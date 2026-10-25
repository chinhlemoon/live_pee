package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
class Platform {
    private static final Platform PLATFORM = findPlatform();
    private final boolean hasJava8Types;

    @Nullable
    private final Constructor<MethodHandles.Lookup> lookupConstructor;

    public static Platform get() {
        return PLATFORM;
    }

    private static Platform findPlatform() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new Android();
        }
        return new Platform(true);
    }

    public Platform(boolean hasJava8Types) {
        this.hasJava8Types = hasJava8Types;
        Constructor<MethodHandles.Lookup> lookupConstructor = null;
        if (hasJava8Types) {
            try {
                lookupConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                lookupConstructor.setAccessible(true);
            } catch (NoClassDefFoundError e) {
            } catch (NoSuchMethodException e2) {
            }
        }
        this.lookupConstructor = lookupConstructor;
    }

    @Nullable
    public Executor defaultCallbackExecutor() {
        return null;
    }

    public List<? extends CallAdapter.Factory> defaultCallAdapterFactories(@Nullable Executor callbackExecutor) {
        DefaultCallAdapterFactory executorFactory = new DefaultCallAdapterFactory(callbackExecutor);
        return this.hasJava8Types ? Arrays.asList(CompletableFutureCallAdapterFactory.INSTANCE, executorFactory) : Collections.singletonList(executorFactory);
    }

    public int defaultCallAdapterFactoriesSize() {
        return this.hasJava8Types ? 2 : 1;
    }

    public List<? extends Converter.Factory> defaultConverterFactories() {
        return this.hasJava8Types ? Collections.singletonList(OptionalConverterFactory.INSTANCE) : Collections.emptyList();
    }

    public int defaultConverterFactoriesSize() {
        return this.hasJava8Types ? 1 : 0;
    }

    @IgnoreJRERequirement
    public boolean isDefaultMethod(Method method) {
        return this.hasJava8Types && method.isDefault();
    }

    @Nullable
    @IgnoreJRERequirement
    public Object invokeDefaultMethod(Method method, Class<?> declaringClass, Object object, Object... args) throws Throwable {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.lookupConstructor;
        if (constructor != null) {
            lookup = constructor.newInstance(declaringClass, -1);
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, declaringClass).bindTo(object).invokeWithArguments(args);
    }

    public static final class Android extends Platform {
        public Android() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // retrofit2.Platform
        public Executor defaultCallbackExecutor() {
            return new MainThreadExecutor();
        }

        @Override // retrofit2.Platform
        @Nullable
        public Object invokeDefaultMethod(Method method, Class<?> declaringClass, Object object, Object... args) throws Throwable {
            if (Build.VERSION.SDK_INT < 26) {
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            }
            return super.invokeDefaultMethod(method, declaringClass, object, args);
        }

        public static final class MainThreadExecutor implements Executor {
            private final Handler handler = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable r) {
                this.handler.post(r);
            }
        }
    }
}
