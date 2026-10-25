package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ts;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public int a;
    public float b;
    public boolean c;
    public int[] d;
    public int[] e;
    public Drawable f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public boolean xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public int xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public int xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public int xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = true;
        this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = -1;
        this.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = 0;
        this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = 8388659;
        int[] iArr = ql.g;
        zp a = zp.m(context, attrs, iArr, defStyleAttr, 0);
        wr.L(this, context, iArr, attrs, a.i(), defStyleAttr, 0);
        int[] iArr2 = ql.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        int index = a.b(1, -1);
        if (index >= 0) {
            setOrientation(index);
        }
        int index2 = a.b(0, -1);
        if (index2 >= 0) {
            setGravity(index2);
        }
        boolean baselineAligned = a.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(2, true);
        if (!baselineAligned) {
            setBaselineAligned(baselineAligned);
        }
        this.b = a.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(4, -1.0f);
        this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = a.b(3, -1);
        this.c = a.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(7, false);
        setDividerDrawable(a.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(5));
        this.i = a.b(8, 0);
        this.j = a.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(6, 0);
        a.n();
    }

    public void setShowDividers(int showDividers) {
        if (showDividers != this.i) {
            requestLayout();
        }
        this.i = showDividers;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.i;
    }

    public Drawable getDividerDrawable() {
        return this.f;
    }

    public void setDividerDrawable(Drawable divider) {
        if (divider == this.f) {
            return;
        }
        this.f = divider;
        if (divider != null) {
            this.g = divider.getIntrinsicWidth();
            this.h = divider.getIntrinsicHeight();
        } else {
            this.g = 0;
            this.h = 0;
        }
        setWillNotDraw(divider == null);
        requestLayout();
    }

    public void setDividerPadding(int padding) {
        this.j = padding;
    }

    public int getDividerPadding() {
        return this.j;
    }

    public int getDividerWidth() {
        return this.g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        if (this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa == 1) {
            xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(canvas);
        } else {
            xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(canvas);
        }
    }

    public void xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Canvas canvas) {
        int bottom;
        int count = getVirtualChildCount();
        for (int i = 0; i < count; i++) {
            View child = i(i);
            if (child != null && child.getVisibility() != 8 && j(i)) {
                xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child.getLayoutParams();
                int top = (child.getTop() - ((LinearLayout.LayoutParams) lp).topMargin) - this.h;
                xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(canvas, top);
            }
        }
        if (j(count)) {
            View child2 = i(count - 1);
            if (child2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.h;
            } else {
                xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp2 = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child2.getLayoutParams();
                int bottom2 = child2.getBottom() + ((LinearLayout.LayoutParams) lp2).bottomMargin;
                bottom = bottom2;
            }
            xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(canvas, bottom);
        }
    }

    public void xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Canvas canvas) {
        int position;
        int position2;
        int count = getVirtualChildCount();
        boolean isLayoutRtl = ts.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(this);
        for (int i = 0; i < count; i++) {
            View child = i(i);
            if (child != null && child.getVisibility() != 8 && j(i)) {
                xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child.getLayoutParams();
                if (isLayoutRtl) {
                    position2 = child.getRight() + ((LinearLayout.LayoutParams) lp).rightMargin;
                } else {
                    int position3 = child.getLeft();
                    position2 = (position3 - ((LinearLayout.LayoutParams) lp).leftMargin) - this.g;
                }
                xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(canvas, position2);
            }
        }
        if (j(count)) {
            View child2 = i(count - 1);
            if (child2 == null) {
                if (isLayoutRtl) {
                    position = getPaddingLeft();
                } else {
                    int position4 = getWidth();
                    position = (position4 - getPaddingRight()) - this.g;
                }
            } else {
                xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp2 = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child2.getLayoutParams();
                if (isLayoutRtl) {
                    position = (child2.getLeft() - ((LinearLayout.LayoutParams) lp2).leftMargin) - this.g;
                } else {
                    int position5 = child2.getRight();
                    position = position5 + ((LinearLayout.LayoutParams) lp2).rightMargin;
                }
            }
            xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(canvas, position);
        }
    }

    public void xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Canvas canvas, int top) {
        this.f.setBounds(getPaddingLeft() + this.j, top, (getWidth() - getPaddingRight()) - this.j, this.h + top);
        this.f.draw(canvas);
    }

    public void xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Canvas canvas, int left) {
        this.f.setBounds(left, getPaddingTop() + this.j, this.g + left, (getHeight() - getPaddingBottom()) - this.j);
        this.f.draw(canvas);
    }

    public void setBaselineAligned(boolean baselineAligned) {
        this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = baselineAligned;
    }

    public void setMeasureWithLargestChildEnabled(boolean enabled) {
        this.c = enabled;
    }

    @Override // android.view.View
    public int getBaseline() {
        int majorGravity;
        if (this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        if (childCount <= i) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View child = getChildAt(i);
        int childBaseline = child.getBaseline();
        if (childBaseline == -1) {
            if (this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int childTop = this.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        if (this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa == 1 && (majorGravity = this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa & 112) != 48) {
            switch (majorGravity) {
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    childTop += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.a) / 2;
                    break;
                case 80:
                    childTop = ((getBottom() - getTop()) - getPaddingBottom()) - this.a;
                    break;
            }
        }
        xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child.getLayoutParams();
        return ((LinearLayout.LayoutParams) lp).topMargin + childTop + childBaseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = i;
    }

    public View i(int index) {
        return getChildAt(index);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.b;
    }

    public void setWeightSum(float weightSum) {
        this.b = Math.max(0.0f, weightSum);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa == 1) {
            p(widthMeasureSpec, heightMeasureSpec);
        } else {
            n(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public boolean j(int childIndex) {
        if (childIndex == 0) {
            return (this.i & 1) != 0;
        }
        if (childIndex == getChildCount()) {
            return (this.i & 4) != 0;
        }
        if ((this.i & 2) == 0) {
            return false;
        }
        for (int i = childIndex - 1; i >= 0; i--) {
            if (getChildAt(i).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0395  */
    /* JADX WARN: Code duplicated, block: B:159:0x0397  */
    public void p(int widthMeasureSpec, int heightMeasureSpec) {
        int heightMode;
        int alternativeMaxWidth;
        int delta;
        float weightSum;
        boolean matchWidthLocally;
        int i;
        int alternativeMaxWidth2;
        int alternativeMaxWidth3;
        int heightSize;
        int oldHeight;
        int i2;
        int heightMode2;
        int weightedMaxWidth;
        int alternativeMaxWidth4;
        int i3;
        int i4;
        int weightedMaxWidth2;
        int i5 = 0;
        this.a = 0;
        int count = getVirtualChildCount();
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int heightMode3 = View.MeasureSpec.getMode(heightMeasureSpec);
        int baselineChildIndex = this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        boolean useLargestChild = this.c;
        int weightedMaxWidth3 = 0;
        float totalWeight = 0.0f;
        int measuredWidth = 0;
        int alternativeMaxWidth5 = 0;
        int largestChildHeight = 0;
        int childState = 0;
        int childState2 = 0;
        boolean skippedMeasure = false;
        int weightedMaxWidth4 = 1;
        int weightedMaxWidth5 = 0;
        while (true) {
            boolean useLargestChild2 = useLargestChild;
            if (childState2 < count) {
                View child = i(childState2);
                if (child == null) {
                    int i6 = this.a;
                    o();
                    this.a = i6 + i5;
                    heightMode2 = heightMode3;
                } else if (child.getVisibility() == 8) {
                    f();
                    childState2 += 0;
                    heightMode2 = heightMode3;
                } else {
                    if (j(childState2)) {
                        this.a += this.h;
                    }
                    xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child.getLayoutParams();
                    float f = ((LinearLayout.LayoutParams) lp).weight;
                    float totalWeight2 = totalWeight + f;
                    if (heightMode3 != 1073741824 || ((LinearLayout.LayoutParams) lp).height != 0 || f <= 0.0f) {
                        int i7 = childState2;
                        if (((LinearLayout.LayoutParams) lp).height == 0 && f > 0.0f) {
                            ((LinearLayout.LayoutParams) lp).height = -2;
                            oldHeight = 0;
                        } else {
                            oldHeight = Integer.MIN_VALUE;
                        }
                        i2 = i7;
                        int largestChildHeight2 = alternativeMaxWidth5;
                        int oldHeight2 = oldHeight;
                        heightMode2 = heightMode3;
                        weightedMaxWidth = weightedMaxWidth5;
                        alternativeMaxWidth4 = measuredWidth;
                        int alternativeMaxWidth6 = totalWeight2 == 0.0f ? this.a : 0;
                        m(child, widthMeasureSpec, 0, heightMeasureSpec, alternativeMaxWidth6);
                        if (oldHeight2 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) lp).height = oldHeight2;
                        }
                        int childHeight = child.getMeasuredHeight();
                        int totalLength = this.a;
                        int i8 = totalLength + childHeight + ((LinearLayout.LayoutParams) lp).topMargin + ((LinearLayout.LayoutParams) lp).bottomMargin;
                        h();
                        this.a = Math.max(totalLength, i8 + 0);
                        if (!useLargestChild2) {
                            alternativeMaxWidth5 = largestChildHeight2;
                        } else {
                            alternativeMaxWidth5 = Math.max(childHeight, largestChildHeight2);
                        }
                    } else {
                        int totalLength2 = this.a;
                        int i9 = ((LinearLayout.LayoutParams) lp).topMargin + totalLength2;
                        int i10 = childState2;
                        int i11 = ((LinearLayout.LayoutParams) lp).bottomMargin;
                        this.a = Math.max(totalLength2, i9 + i11);
                        skippedMeasure = true;
                        weightedMaxWidth = weightedMaxWidth5;
                        alternativeMaxWidth4 = measuredWidth;
                        heightMode2 = heightMode3;
                        i2 = i10;
                    }
                    if (baselineChildIndex >= 0) {
                        i3 = i2;
                        if (baselineChildIndex == i3 + 1) {
                            this.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = this.a;
                        }
                    } else {
                        i3 = i2;
                    }
                    if (i3 < baselineChildIndex && ((LinearLayout.LayoutParams) lp).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    boolean matchWidthLocally2 = false;
                    if (widthMode != 1073741824) {
                        i4 = -1;
                        if (((LinearLayout.LayoutParams) lp).width == -1) {
                            largestChildHeight = 1;
                            matchWidthLocally2 = true;
                        }
                    } else {
                        i4 = -1;
                    }
                    int margin = ((LinearLayout.LayoutParams) lp).leftMargin + ((LinearLayout.LayoutParams) lp).rightMargin;
                    int measuredWidth2 = child.getMeasuredWidth() + margin;
                    int maxWidth = Math.max(weightedMaxWidth3, measuredWidth2);
                    int childState3 = View.combineMeasuredStates(childState, child.getMeasuredState());
                    int i12 = (weightedMaxWidth4 == 0 || ((LinearLayout.LayoutParams) lp).width != i4) ? 0 : 1;
                    if (((LinearLayout.LayoutParams) lp).weight > 0.0f) {
                        weightedMaxWidth2 = Math.max(weightedMaxWidth, matchWidthLocally2 ? margin : measuredWidth2);
                    } else {
                        weightedMaxWidth2 = weightedMaxWidth;
                        alternativeMaxWidth4 = Math.max(alternativeMaxWidth4, matchWidthLocally2 ? margin : measuredWidth2);
                    }
                    f();
                    childState2 = i3 + 0;
                    weightedMaxWidth4 = i12;
                    childState = childState3;
                    weightedMaxWidth5 = weightedMaxWidth2;
                    totalWeight = totalWeight2;
                    measuredWidth = alternativeMaxWidth4;
                    weightedMaxWidth3 = maxWidth;
                }
                childState2++;
                useLargestChild = useLargestChild2;
                heightMode3 = heightMode2;
                i5 = 0;
            } else {
                int largestChildHeight3 = alternativeMaxWidth5;
                int largestChildHeight4 = measuredWidth;
                int heightMode4 = heightMode3;
                int weightedMaxWidth6 = weightedMaxWidth5;
                int i13 = this.a;
                if (i13 > 0 && j(count)) {
                    this.a += this.h;
                }
                if (useLargestChild2) {
                    heightMode = heightMode4;
                    if (heightMode == Integer.MIN_VALUE || heightMode == 0) {
                        this.a = 0;
                        int i14 = 0;
                        while (i14 < count) {
                            View child2 = i(i14);
                            if (child2 == null) {
                                int i15 = this.a;
                                o();
                                this.a = i15 + 0;
                            } else if (child2.getVisibility() == 8) {
                                f();
                                i14 += 0;
                            } else {
                                xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp2 = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child2.getLayoutParams();
                                int totalLength3 = this.a;
                                int i16 = totalLength3 + largestChildHeight3 + ((LinearLayout.LayoutParams) lp2).topMargin + ((LinearLayout.LayoutParams) lp2).bottomMargin;
                                h();
                                this.a = Math.max(totalLength3, i16 + 0);
                            }
                            i14++;
                        }
                    }
                } else {
                    heightMode = heightMode4;
                }
                this.a += getPaddingTop() + getPaddingBottom();
                int heightSizeAndState = View.resolveSizeAndState(Math.max(this.a, getSuggestedMinimumHeight()), heightMeasureSpec, 0);
                int heightSize2 = heightSizeAndState & 16777215;
                int delta2 = heightSize2 - this.a;
                if (skippedMeasure || (delta2 != 0 && totalWeight > 0.0f)) {
                    float weightSum2 = this.b;
                    if (weightSum2 <= 0.0f) {
                        weightSum2 = totalWeight;
                    }
                    this.a = 0;
                    int i17 = 0;
                    int alternativeMaxWidth7 = largestChildHeight4;
                    while (i17 < count) {
                        View child3 = i(i17);
                        int largestChildHeight5 = largestChildHeight3;
                        if (child3.getVisibility() == 8) {
                            heightMode = heightMode;
                            delta = delta2;
                            baselineChildIndex = baselineChildIndex;
                        } else {
                            xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp3 = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child3.getLayoutParams();
                            float childExtra = ((LinearLayout.LayoutParams) lp3).weight;
                            if (childExtra <= 0.0f) {
                                heightMode = heightMode;
                                int heightMode5 = delta2;
                                delta = heightMode5;
                            } else {
                                int share = (int) ((delta2 * childExtra) / weightSum2);
                                float weightSum3 = weightSum2 - childExtra;
                                delta = delta2 - share;
                                int childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(widthMeasureSpec, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) lp3).leftMargin + ((LinearLayout.LayoutParams) lp3).rightMargin, ((LinearLayout.LayoutParams) lp3).width);
                                if (((LinearLayout.LayoutParams) lp3).height != 0 || heightMode != 1073741824) {
                                    int heightMode6 = child3.getMeasuredHeight();
                                    int childHeight2 = heightMode6 + share;
                                    if (childHeight2 < 0) {
                                        childHeight2 = 0;
                                    }
                                    child3.measure(childWidthMeasureSpec, View.MeasureSpec.makeMeasureSpec(childHeight2, 1073741824));
                                } else {
                                    heightMode = heightMode;
                                    int heightMode7 = share > 0 ? share : 0;
                                    child3.measure(childWidthMeasureSpec, View.MeasureSpec.makeMeasureSpec(heightMode7, 1073741824));
                                }
                                childState = View.combineMeasuredStates(childState, child3.getMeasuredState() & (-256));
                                weightSum2 = weightSum3;
                            }
                            int margin2 = ((LinearLayout.LayoutParams) lp3).leftMargin + ((LinearLayout.LayoutParams) lp3).rightMargin;
                            int measuredWidth3 = child3.getMeasuredWidth() + margin2;
                            weightedMaxWidth3 = Math.max(weightedMaxWidth3, measuredWidth3);
                            if (widthMode != 1073741824) {
                                weightSum = weightSum2;
                                matchWidthLocally = ((LinearLayout.LayoutParams) lp3).width == -1;
                                if (matchWidthLocally) {
                                    i = margin2;
                                } else {
                                    i = measuredWidth3;
                                }
                                alternativeMaxWidth7 = Math.max(alternativeMaxWidth7, i);
                                int i18 = (weightedMaxWidth4 == 0 && ((LinearLayout.LayoutParams) lp3).width == -1) ? 1 : 0;
                                int totalLength4 = this.a;
                                int measuredHeight = totalLength4 + child3.getMeasuredHeight() + ((LinearLayout.LayoutParams) lp3).topMargin + ((LinearLayout.LayoutParams) lp3).bottomMargin;
                                h();
                                this.a = Math.max(totalLength4, measuredHeight + 0);
                                weightedMaxWidth4 = i18;
                                weightSum2 = weightSum;
                            } else {
                                weightSum = weightSum2;
                            }
                            if (matchWidthLocally) {
                                i = margin2;
                            } else {
                                i = measuredWidth3;
                            }
                            alternativeMaxWidth7 = Math.max(alternativeMaxWidth7, i);
                            if (weightedMaxWidth4 == 0) {
                            }
                            int totalLength5 = this.a;
                            int measuredHeight2 = totalLength5 + child3.getMeasuredHeight() + ((LinearLayout.LayoutParams) lp3).topMargin + ((LinearLayout.LayoutParams) lp3).bottomMargin;
                            h();
                            this.a = Math.max(totalLength5, measuredHeight2 + 0);
                            weightedMaxWidth4 = i18;
                            weightSum2 = weightSum;
                        }
                        i17++;
                        largestChildHeight3 = largestChildHeight5;
                        baselineChildIndex = baselineChildIndex;
                        delta2 = delta;
                        heightMode = heightMode;
                    }
                    this.a += getPaddingTop() + getPaddingBottom();
                    alternativeMaxWidth = alternativeMaxWidth7;
                } else {
                    int alternativeMaxWidth8 = Math.max(largestChildHeight4, weightedMaxWidth6);
                    if (!useLargestChild2 || heightMode == 1073741824) {
                        alternativeMaxWidth2 = alternativeMaxWidth8;
                    } else {
                        int i19 = 0;
                        while (i19 < count) {
                            float totalWeight3 = totalWeight;
                            View child4 = i(i19);
                            if (child4 != null) {
                                alternativeMaxWidth3 = alternativeMaxWidth8;
                                int alternativeMaxWidth9 = child4.getVisibility();
                                heightSize = heightSize2;
                                if (alternativeMaxWidth9 != 8 && ((LinearLayout.LayoutParams) ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child4.getLayoutParams())).weight > 0.0f) {
                                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(child4.getMeasuredWidth(), 1073741824);
                                    int weightedMaxWidth7 = View.MeasureSpec.makeMeasureSpec(largestChildHeight3, 1073741824);
                                    child4.measure(iMakeMeasureSpec, weightedMaxWidth7);
                                }
                            } else {
                                alternativeMaxWidth3 = alternativeMaxWidth8;
                                heightSize = heightSize2;
                            }
                            i19++;
                            totalWeight = totalWeight3;
                            alternativeMaxWidth8 = alternativeMaxWidth3;
                            heightSize2 = heightSize;
                            weightedMaxWidth6 = weightedMaxWidth6;
                        }
                        alternativeMaxWidth2 = alternativeMaxWidth8;
                    }
                    alternativeMaxWidth = alternativeMaxWidth2;
                }
                if (weightedMaxWidth4 == 0 && widthMode != 1073741824) {
                    weightedMaxWidth3 = alternativeMaxWidth;
                }
                int maxWidth2 = weightedMaxWidth3 + getPaddingLeft() + getPaddingRight();
                setMeasuredDimension(View.resolveSizeAndState(Math.max(maxWidth2, getSuggestedMinimumWidth()), widthMeasureSpec, childState), heightSizeAndState);
                if (largestChildHeight != 0) {
                    b(count, heightMeasureSpec);
                    return;
                }
                return;
            }
        }
    }

    public final void b(int count, int heightMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i = 0; i < count; i++) {
            View child = i(i);
            if (child.getVisibility() != 8) {
                xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child.getLayoutParams();
                if (((LinearLayout.LayoutParams) lp).width == -1) {
                    int oldHeight = ((LinearLayout.LayoutParams) lp).height;
                    ((LinearLayout.LayoutParams) lp).height = child.getMeasuredHeight();
                    measureChildWithMargins(child, uniformMeasureSpec, 0, heightMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) lp).height = oldHeight;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:207:0x0527  */
    /* JADX WARN: Code duplicated, block: B:209:0x0530  */
    /* JADX WARN: Code duplicated, block: B:211:0x0534  */
    /* JADX WARN: Code duplicated, block: B:213:0x0557  */
    /* JADX WARN: Code duplicated, block: B:214:0x055c  */
    public void n(int widthMeasureSpec, int heightMeasureSpec) {
        int descent;
        int maxHeight;
        int widthMode;
        int count;
        int childState;
        int maxHeight2;
        boolean useLargestChild;
        int widthMode2;
        int widthMode3;
        int alternativeMaxHeight;
        boolean allFillParent;
        int childBaseline;
        int i;
        int alternativeMaxHeight2;
        int alternativeMaxHeight3;
        int widthSize;
        int i2;
        int oldWidth;
        int weightedMaxHeight;
        int alternativeMaxHeight4;
        int childState2;
        int maxHeight3;
        boolean baselineAligned;
        int weightedMaxHeight2;
        int widthMode4;
        xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp;
        int weightedMaxHeight3;
        int childBaseline2;
        this.a = 0;
        int alternativeMaxHeight5 = 0;
        int count2 = getVirtualChildCount();
        int widthMode5 = View.MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (this.d == null || this.e == null) {
            this.d = new int[4];
            this.e = new int[4];
        }
        int[] maxAscent = this.d;
        int[] maxDescent = this.e;
        maxAscent[3] = -1;
        maxAscent[2] = -1;
        maxAscent[1] = -1;
        maxAscent[0] = -1;
        maxDescent[3] = -1;
        maxDescent[2] = -1;
        maxDescent[1] = -1;
        maxDescent[0] = -1;
        boolean baselineAligned2 = this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        boolean matchHeight = false;
        boolean useLargestChild2 = this.c;
        boolean skippedMeasure = false;
        boolean isExactly = widthMode5 == 1073741824;
        int largestChildWidth = 0;
        int i3 = 0;
        int maxHeight4 = 0;
        float totalWeight = 0.0f;
        boolean allFillParent2 = true;
        int weightedMaxHeight4 = 0;
        int childState3 = 0;
        while (i3 < count2) {
            View child = i(i3);
            if (child == null) {
                int weightedMaxHeight5 = childState3;
                int weightedMaxHeight6 = this.a;
                o();
                this.a = weightedMaxHeight6 + 0;
                baselineAligned = baselineAligned2;
                childState3 = weightedMaxHeight5;
                weightedMaxHeight2 = widthMode5;
            } else {
                int weightedMaxHeight7 = childState3;
                int weightedMaxHeight8 = child.getVisibility();
                int alternativeMaxHeight6 = alternativeMaxHeight5;
                if (weightedMaxHeight8 == 8) {
                    f();
                    i3 += 0;
                    baselineAligned = baselineAligned2;
                    childState3 = weightedMaxHeight7;
                    alternativeMaxHeight5 = alternativeMaxHeight6;
                    weightedMaxHeight2 = widthMode5;
                } else {
                    if (j(i3)) {
                        this.a += this.g;
                    }
                    xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp2 = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child.getLayoutParams();
                    float f = ((LinearLayout.LayoutParams) lp2).weight;
                    float totalWeight2 = totalWeight + f;
                    if (widthMode5 != 1073741824 || ((LinearLayout.LayoutParams) lp2).width != 0 || f <= 0.0f) {
                        int childState4 = weightedMaxHeight4;
                        if (((LinearLayout.LayoutParams) lp2).width == 0 && f > 0.0f) {
                            ((LinearLayout.LayoutParams) lp2).width = -2;
                            oldWidth = 0;
                        } else {
                            oldWidth = Integer.MIN_VALUE;
                        }
                        weightedMaxHeight = weightedMaxHeight7;
                        alternativeMaxHeight4 = alternativeMaxHeight6;
                        int oldWidth2 = oldWidth;
                        childState2 = childState4;
                        int oldWidth3 = totalWeight2 == 0.0f ? this.a : 0;
                        maxHeight3 = maxHeight4;
                        baselineAligned = baselineAligned2;
                        weightedMaxHeight2 = widthMode5;
                        widthMode4 = -1;
                        m(child, widthMeasureSpec, oldWidth3, heightMeasureSpec, 0);
                        if (oldWidth2 == Integer.MIN_VALUE) {
                            lp = lp2;
                        } else {
                            lp = lp2;
                            ((LinearLayout.LayoutParams) lp).width = oldWidth2;
                        }
                        int childWidth = child.getMeasuredWidth();
                        if (isExactly) {
                            int i4 = this.a;
                            int i5 = ((LinearLayout.LayoutParams) lp).leftMargin + childWidth + ((LinearLayout.LayoutParams) lp).rightMargin;
                            h();
                            this.a = i4 + i5 + 0;
                        } else {
                            int totalLength = this.a;
                            int i6 = totalLength + childWidth + ((LinearLayout.LayoutParams) lp).leftMargin + ((LinearLayout.LayoutParams) lp).rightMargin;
                            h();
                            this.a = Math.max(totalLength, i6 + 0);
                        }
                        if (useLargestChild2) {
                            largestChildWidth = Math.max(childWidth, largestChildWidth);
                        } else {
                            largestChildWidth = largestChildWidth;
                        }
                    } else {
                        if (!isExactly) {
                            int totalLength2 = this.a;
                            this.a = Math.max(totalLength2, ((LinearLayout.LayoutParams) lp2).leftMargin + totalLength2 + ((LinearLayout.LayoutParams) lp2).rightMargin);
                        } else {
                            int i7 = this.a;
                            int i8 = ((LinearLayout.LayoutParams) lp2).leftMargin;
                            int childState5 = ((LinearLayout.LayoutParams) lp2).rightMargin;
                            this.a = i7 + i8 + childState5;
                        }
                        if (baselineAligned2) {
                            int freeSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            child.measure(freeSpec, freeSpec);
                            lp = lp2;
                            maxHeight3 = maxHeight4;
                            baselineAligned = baselineAligned2;
                            weightedMaxHeight = weightedMaxHeight7;
                            alternativeMaxHeight4 = alternativeMaxHeight6;
                            childState2 = weightedMaxHeight4;
                            weightedMaxHeight2 = widthMode5;
                            widthMode4 = -1;
                            largestChildWidth = largestChildWidth;
                        } else {
                            skippedMeasure = true;
                            lp = lp2;
                            maxHeight3 = maxHeight4;
                            baselineAligned = baselineAligned2;
                            weightedMaxHeight = weightedMaxHeight7;
                            alternativeMaxHeight4 = alternativeMaxHeight6;
                            childState2 = weightedMaxHeight4;
                            weightedMaxHeight2 = widthMode5;
                            widthMode4 = -1;
                        }
                    }
                    boolean matchHeightLocally = false;
                    if (heightMode != 1073741824 && ((LinearLayout.LayoutParams) lp).height == widthMode4) {
                        matchHeight = true;
                        matchHeightLocally = true;
                    }
                    int margin = ((LinearLayout.LayoutParams) lp).topMargin + ((LinearLayout.LayoutParams) lp).bottomMargin;
                    int childHeight = child.getMeasuredHeight() + margin;
                    int iCombineMeasuredStates = View.combineMeasuredStates(childState2, child.getMeasuredState());
                    if (baselineAligned && (childBaseline2 = child.getBaseline()) != widthMode4) {
                        int i9 = ((LinearLayout.LayoutParams) lp).gravity;
                        if (i9 < 0) {
                            i9 = this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                        }
                        int gravity = i9 & 112;
                        int index = ((gravity >> 4) & (-2)) >> 1;
                        maxAscent[index] = Math.max(maxAscent[index], childBaseline2);
                        int childState6 = childHeight - childBaseline2;
                        maxDescent[index] = Math.max(maxDescent[index], childState6);
                    }
                    int maxHeight5 = Math.max(maxHeight3, childHeight);
                    boolean allFillParent3 = allFillParent2 && ((LinearLayout.LayoutParams) lp).height == -1;
                    if (((LinearLayout.LayoutParams) lp).weight > 0.0f) {
                        weightedMaxHeight3 = Math.max(weightedMaxHeight, matchHeightLocally ? margin : childHeight);
                    } else {
                        int weightedMaxHeight9 = weightedMaxHeight;
                        alternativeMaxHeight4 = Math.max(alternativeMaxHeight4, matchHeightLocally ? margin : childHeight);
                        weightedMaxHeight3 = weightedMaxHeight9;
                    }
                    f();
                    i3 += 0;
                    allFillParent2 = allFillParent3;
                    childState3 = weightedMaxHeight3;
                    totalWeight = totalWeight2;
                    weightedMaxHeight4 = iCombineMeasuredStates;
                    maxHeight4 = maxHeight5;
                    alternativeMaxHeight5 = alternativeMaxHeight4;
                }
            }
            i3++;
            baselineAligned2 = baselineAligned;
            widthMode5 = weightedMaxHeight2;
        }
        int maxHeight6 = maxHeight4;
        boolean baselineAligned3 = baselineAligned2;
        int widthMode6 = widthMode5;
        int weightedMaxHeight10 = childState3;
        int i10 = weightedMaxHeight4;
        int largestChildWidth2 = largestChildWidth;
        int weightedMaxHeight11 = this.a;
        if (weightedMaxHeight11 > 0 && j(count2)) {
            this.a += this.g;
        }
        if (maxAscent[1] == -1 && maxAscent[0] == -1 && maxAscent[2] == -1 && maxAscent[3] == -1) {
            descent = maxHeight6;
        } else {
            int ascent = Math.max(maxAscent[3], Math.max(maxAscent[0], Math.max(maxAscent[1], maxAscent[2])));
            int i11 = maxDescent[3];
            int i12 = maxDescent[0];
            int i13 = maxDescent[1];
            int childState7 = maxDescent[2];
            int descent2 = Math.max(i11, Math.max(i12, Math.max(i13, childState7)));
            descent = Math.max(maxHeight6, ascent + descent2);
        }
        if (useLargestChild2) {
            widthMode = widthMode6;
            if (widthMode == Integer.MIN_VALUE || widthMode == 0) {
                this.a = 0;
                int i14 = 0;
                while (i14 < count2) {
                    View child2 = i(i14);
                    if (child2 == null) {
                        int i15 = this.a;
                        o();
                        this.a = i15 + 0;
                    } else {
                        if (child2.getVisibility() == 8) {
                            f();
                            i2 = i14 + 0;
                            descent = descent;
                        } else {
                            xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp3 = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child2.getLayoutParams();
                            if (!isExactly) {
                                int maxHeight7 = this.a;
                                int i16 = maxHeight7 + largestChildWidth2 + ((LinearLayout.LayoutParams) lp3).leftMargin + ((LinearLayout.LayoutParams) lp3).rightMargin;
                                h();
                                int i17 = i16 + 0;
                                this.a = Math.max(maxHeight7, i17);
                            } else {
                                int i18 = this.a;
                                int maxHeight8 = ((LinearLayout.LayoutParams) lp3).leftMargin;
                                int i19 = largestChildWidth2 + maxHeight8 + ((LinearLayout.LayoutParams) lp3).rightMargin;
                                h();
                                this.a = i18 + i19 + 0;
                            }
                        }
                        i14 = i2 + 1;
                        descent = descent;
                    }
                    i2 = i14;
                    i14 = i2 + 1;
                    descent = descent;
                }
                maxHeight = descent;
            } else {
                maxHeight = descent;
            }
        } else {
            maxHeight = descent;
            widthMode = widthMode6;
        }
        int maxHeight9 = this.a;
        this.a = maxHeight9 + getPaddingLeft() + getPaddingRight();
        int widthSizeAndState = View.resolveSizeAndState(Math.max(this.a, getSuggestedMinimumWidth()), widthMeasureSpec, 0);
        int widthSize2 = widthSizeAndState & 16777215;
        int delta = widthSize2 - this.a;
        if (skippedMeasure || (delta != 0 && totalWeight > 0.0f)) {
            float weightSum = this.b;
            if (weightSum <= 0.0f) {
                weightSum = totalWeight;
            }
            maxAscent[3] = -1;
            maxAscent[2] = -1;
            maxAscent[1] = -1;
            maxAscent[0] = -1;
            maxDescent[3] = -1;
            maxDescent[2] = -1;
            maxDescent[1] = -1;
            maxDescent[0] = -1;
            int maxHeight10 = -1;
            this.a = 0;
            int delta2 = delta;
            int delta3 = 0;
            int childState8 = i10;
            while (delta3 < count2) {
                int weightedMaxHeight12 = weightedMaxHeight10;
                View child3 = i(delta3);
                if (child3 != null) {
                    useLargestChild = useLargestChild2;
                    if (child3.getVisibility() == 8) {
                        widthMode = widthMode;
                        count2 = count2;
                        widthMode2 = delta2;
                    } else {
                        xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp4 = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child3.getLayoutParams();
                        float childExtra = ((LinearLayout.LayoutParams) lp4).weight;
                        if (childExtra <= 0.0f) {
                            widthMode = widthMode;
                            widthMode3 = delta2;
                        } else {
                            int share = (int) ((delta2 * childExtra) / weightSum);
                            float weightSum2 = weightSum - childExtra;
                            int delta4 = delta2 - share;
                            int childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(heightMeasureSpec, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) lp4).topMargin + ((LinearLayout.LayoutParams) lp4).bottomMargin, ((LinearLayout.LayoutParams) lp4).height);
                            if (((LinearLayout.LayoutParams) lp4).width != 0 || widthMode != 1073741824) {
                                int childWidth2 = child3.getMeasuredWidth() + share;
                                if (childWidth2 < 0) {
                                    childWidth2 = 0;
                                }
                                child3.measure(View.MeasureSpec.makeMeasureSpec(childWidth2, 1073741824), childHeightMeasureSpec);
                            } else {
                                widthMode = widthMode;
                                child3.measure(View.MeasureSpec.makeMeasureSpec(share > 0 ? share : 0, 1073741824), childHeightMeasureSpec);
                            }
                            childState8 = View.combineMeasuredStates(childState8, child3.getMeasuredState() & (-16777216));
                            weightSum = weightSum2;
                            widthMode3 = delta4;
                        }
                        if (!isExactly) {
                            int totalLength3 = this.a;
                            int measuredWidth = child3.getMeasuredWidth() + totalLength3 + ((LinearLayout.LayoutParams) lp4).leftMargin + ((LinearLayout.LayoutParams) lp4).rightMargin;
                            h();
                            this.a = Math.max(totalLength3, measuredWidth + 0);
                        } else {
                            int i20 = this.a;
                            int measuredWidth2 = child3.getMeasuredWidth() + ((LinearLayout.LayoutParams) lp4).leftMargin + ((LinearLayout.LayoutParams) lp4).rightMargin;
                            h();
                            this.a = i20 + measuredWidth2 + 0;
                        }
                        boolean matchHeightLocally2 = heightMode != 1073741824 && ((LinearLayout.LayoutParams) lp4).height == -1;
                        int margin2 = ((LinearLayout.LayoutParams) lp4).topMargin + ((LinearLayout.LayoutParams) lp4).bottomMargin;
                        int childHeight2 = child3.getMeasuredHeight() + margin2;
                        maxHeight10 = Math.max(maxHeight10, childHeight2);
                        int alternativeMaxHeight7 = Math.max(alternativeMaxHeight5, matchHeightLocally2 ? margin2 : childHeight2);
                        if (allFillParent2) {
                            alternativeMaxHeight = alternativeMaxHeight7;
                            allFillParent = ((LinearLayout.LayoutParams) lp4).height == -1;
                            if (baselineAligned3) {
                                allFillParent2 = allFillParent;
                            } else {
                                childBaseline = child3.getBaseline();
                                allFillParent2 = allFillParent;
                                if (childBaseline == -1) {
                                    i = ((LinearLayout.LayoutParams) lp4).gravity;
                                    if (i < 0) {
                                        i = this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                                    }
                                    int gravity2 = i & 112;
                                    int index2 = ((gravity2 >> 4) & (-2)) >> 1;
                                    int gravity3 = maxAscent[index2];
                                    maxAscent[index2] = Math.max(gravity3, childBaseline);
                                    maxDescent[index2] = Math.max(maxDescent[index2], childHeight2 - childBaseline);
                                }
                            }
                            weightSum = weightSum;
                            alternativeMaxHeight5 = alternativeMaxHeight;
                            widthMode2 = widthMode3;
                        } else {
                            alternativeMaxHeight = alternativeMaxHeight7;
                        }
                        if (baselineAligned3) {
                            allFillParent2 = allFillParent;
                        } else {
                            childBaseline = child3.getBaseline();
                            allFillParent2 = allFillParent;
                            if (childBaseline == -1) {
                                i = ((LinearLayout.LayoutParams) lp4).gravity;
                                if (i < 0) {
                                    i = this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                                }
                                int gravity4 = i & 112;
                                int index3 = ((gravity4 >> 4) & (-2)) >> 1;
                                int gravity5 = maxAscent[index3];
                                maxAscent[index3] = Math.max(gravity5, childBaseline);
                                maxDescent[index3] = Math.max(maxDescent[index3], childHeight2 - childBaseline);
                            }
                        }
                        weightSum = weightSum;
                        alternativeMaxHeight5 = alternativeMaxHeight;
                        widthMode2 = widthMode3;
                    }
                } else {
                    widthMode = widthMode;
                    count2 = count2;
                    useLargestChild = useLargestChild2;
                    widthMode2 = delta2;
                }
                delta3++;
                delta2 = widthMode2;
                useLargestChild2 = useLargestChild;
                count2 = count2;
                weightedMaxHeight10 = weightedMaxHeight12;
                widthMode = widthMode;
            }
            count = count2;
            this.a += getPaddingLeft() + getPaddingRight();
            if (maxAscent[1] != -1 || maxAscent[0] != -1 || maxAscent[2] != -1 || maxAscent[3] != -1) {
                int ascent2 = Math.max(maxAscent[3], Math.max(maxAscent[0], Math.max(maxAscent[1], maxAscent[2])));
                int descent3 = Math.max(maxDescent[3], Math.max(maxDescent[0], Math.max(maxDescent[1], maxDescent[2])));
                maxHeight10 = Math.max(maxHeight10, ascent2 + descent3);
            }
            int i21 = childState8;
            childState = maxHeight10;
            maxHeight2 = i21;
        } else {
            int alternativeMaxHeight8 = Math.max(alternativeMaxHeight5, weightedMaxHeight10);
            if (!useLargestChild2 || widthMode == 1073741824) {
                alternativeMaxHeight2 = alternativeMaxHeight8;
            } else {
                int i22 = 0;
                while (i22 < count2) {
                    float totalWeight3 = totalWeight;
                    View child4 = i(i22);
                    if (child4 != null) {
                        alternativeMaxHeight3 = alternativeMaxHeight8;
                        int alternativeMaxHeight9 = child4.getVisibility();
                        widthSize = widthSize2;
                        if (alternativeMaxHeight9 != 8 && ((LinearLayout.LayoutParams) ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child4.getLayoutParams())).weight > 0.0f) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(largestChildWidth2, 1073741824);
                            int largestChildWidth3 = child4.getMeasuredHeight();
                            child4.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(largestChildWidth3, 1073741824));
                        }
                    } else {
                        alternativeMaxHeight3 = alternativeMaxHeight8;
                        widthSize = widthSize2;
                    }
                    i22++;
                    alternativeMaxHeight8 = alternativeMaxHeight3;
                    totalWeight = totalWeight3;
                    widthSize2 = widthSize;
                    largestChildWidth2 = largestChildWidth2;
                }
                alternativeMaxHeight2 = alternativeMaxHeight8;
            }
            count = count2;
            alternativeMaxHeight5 = alternativeMaxHeight2;
            childState = maxHeight;
            maxHeight2 = i10;
        }
        if (!allFillParent2 && heightMode != 1073741824) {
            childState = alternativeMaxHeight5;
        }
        int maxHeight11 = childState + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(((-16777216) & maxHeight2) | widthSizeAndState, View.resolveSizeAndState(Math.max(maxHeight11, getSuggestedMinimumHeight()), heightMeasureSpec, maxHeight2 << 16));
        if (matchHeight) {
            a(count, widthMeasureSpec);
        }
    }

    public final void a(int count, int widthMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i = 0; i < count; i++) {
            View child = i(i);
            if (child.getVisibility() != 8) {
                xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child.getLayoutParams();
                if (((LinearLayout.LayoutParams) lp).height == -1) {
                    int oldWidth = ((LinearLayout.LayoutParams) lp).width;
                    ((LinearLayout.LayoutParams) lp).width = child.getMeasuredWidth();
                    measureChildWithMargins(child, widthMeasureSpec, 0, uniformMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) lp).width = oldWidth;
                }
            }
        }
    }

    public int f() {
        return 0;
    }

    public int o() {
        return 0;
    }

    public void m(View child, int widthMeasureSpec, int totalWidth, int heightMeasureSpec, int totalHeight) {
        measureChildWithMargins(child, widthMeasureSpec, totalWidth, heightMeasureSpec, totalHeight);
    }

    public int g() {
        return 0;
    }

    public int h() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        if (this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa == 1) {
            l(l, t, r, b);
        } else {
            k(l, t, r, b);
        }
    }

    public void l(int left, int top, int right, int bottom) {
        int childTop;
        int gravity;
        int childLeft;
        LinearLayoutCompat linearLayoutCompat = this;
        int paddingLeft = getPaddingLeft();
        int width = right - left;
        int childRight = width - getPaddingRight();
        int childSpace = (width - paddingLeft) - getPaddingRight();
        int count = getVirtualChildCount();
        int i = linearLayoutCompat.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        int majorGravity = i & 112;
        int minorGravity = i & 8388615;
        switch (majorGravity) {
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                int childTop2 = getPaddingTop();
                childTop = childTop2 + (((bottom - top) - linearLayoutCompat.a) / 2);
                break;
            case 80:
                int childTop3 = getPaddingTop();
                childTop = ((childTop3 + bottom) - top) - linearLayoutCompat.a;
                break;
            default:
                childTop = getPaddingTop();
                break;
        }
        int i2 = 0;
        while (i2 < count) {
            View child = linearLayoutCompat.i(i2);
            if (child == null) {
                o();
                childTop += 0;
            } else if (child.getVisibility() != 8) {
                int childWidth = child.getMeasuredWidth();
                int childHeight = child.getMeasuredHeight();
                xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child.getLayoutParams();
                int gravity2 = ((LinearLayout.LayoutParams) lp).gravity;
                if (gravity2 >= 0) {
                    gravity = gravity2;
                } else {
                    gravity = minorGravity;
                }
                int layoutDirection = wr.o(this);
                int absoluteGravity = hb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(gravity, layoutDirection);
                switch (absoluteGravity & 7) {
                    case 1:
                        int childLeft2 = childSpace - childWidth;
                        childLeft = (((childLeft2 / 2) + paddingLeft) + ((LinearLayout.LayoutParams) lp).leftMargin) - ((LinearLayout.LayoutParams) lp).rightMargin;
                        break;
                    case 5:
                        int childLeft3 = childRight - childWidth;
                        childLeft = childLeft3 - ((LinearLayout.LayoutParams) lp).rightMargin;
                        break;
                    default:
                        childLeft = ((LinearLayout.LayoutParams) lp).leftMargin + paddingLeft;
                        break;
                }
                if (linearLayoutCompat.j(i2)) {
                    childTop += linearLayoutCompat.h;
                }
                int childTop4 = childTop + ((LinearLayout.LayoutParams) lp).topMargin;
                g();
                q(child, childLeft, childTop4 + 0, childWidth, childHeight);
                int i3 = childHeight + ((LinearLayout.LayoutParams) lp).bottomMargin;
                h();
                f();
                i2 += 0;
                childTop = childTop4 + i3 + 0;
            }
            i2++;
            linearLayoutCompat = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x010a  */
    public void k(int left, int top, int right, int bottom) {
        int childLeft;
        int start;
        int dir;
        int layoutDirection;
        boolean isLayoutRtl;
        int height;
        int childBaseline;
        int gravity;
        int gravity2;
        int childTop;
        int childTop2;
        int childTop3;
        LinearLayoutCompat linearLayoutCompat = this;
        boolean isLayoutRtl2 = ts.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(this);
        int paddingTop = getPaddingTop();
        int height2 = bottom - top;
        int childBottom = height2 - getPaddingBottom();
        int childSpace = (height2 - paddingTop) - getPaddingBottom();
        int count = getVirtualChildCount();
        int i = linearLayoutCompat.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        int majorGravity = i & 8388615;
        int minorGravity = i & 112;
        boolean baselineAligned = linearLayoutCompat.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        int[] maxAscent = linearLayoutCompat.d;
        int[] maxDescent = linearLayoutCompat.e;
        int layoutDirection2 = wr.o(this);
        switch (hb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(majorGravity, layoutDirection2)) {
            case 1:
                int childLeft2 = getPaddingLeft();
                childLeft = childLeft2 + (((right - left) - linearLayoutCompat.a) / 2);
                break;
            case 5:
                int childLeft3 = getPaddingLeft();
                childLeft = ((childLeft3 + right) - left) - linearLayoutCompat.a;
                break;
            default:
                childLeft = getPaddingLeft();
                break;
        }
        if (!isLayoutRtl2) {
            start = 0;
            dir = 1;
        } else {
            int start2 = count - 1;
            start = start2;
            dir = -1;
        }
        int i2 = 0;
        while (i2 < count) {
            int childIndex = start + (dir * i2);
            View child = linearLayoutCompat.i(childIndex);
            if (child == null) {
                o();
                childLeft += 0;
                layoutDirection = layoutDirection2;
                isLayoutRtl = isLayoutRtl2;
                height = height2;
            } else {
                int i3 = i2;
                int i4 = child.getVisibility();
                layoutDirection = layoutDirection2;
                if (i4 != 8) {
                    int childWidth = child.getMeasuredWidth();
                    int childHeight = child.getMeasuredHeight();
                    xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa lp = (xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) child.getLayoutParams();
                    if (!baselineAligned) {
                        isLayoutRtl = isLayoutRtl2;
                    } else {
                        isLayoutRtl = isLayoutRtl2;
                        if (((LinearLayout.LayoutParams) lp).height != -1) {
                            childBaseline = child.getBaseline();
                        }
                        gravity = ((LinearLayout.LayoutParams) lp).gravity;
                        if (gravity < 0) {
                            gravity2 = gravity;
                        } else {
                            gravity2 = minorGravity;
                        }
                        switch (gravity2 & 112) {
                            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                                height = height2;
                                int childTop4 = ((((childSpace - childHeight) / 2) + paddingTop) + ((LinearLayout.LayoutParams) lp).topMargin) - ((LinearLayout.LayoutParams) lp).bottomMargin;
                                childTop = childTop4;
                                break;
                            case 48:
                                height = height2;
                                childTop2 = ((LinearLayout.LayoutParams) lp).topMargin + paddingTop;
                                if (childBaseline != -1) {
                                    childTop = childTop2;
                                } else {
                                    childTop = childTop2 + (maxAscent[1] - childBaseline);
                                }
                                break;
                            case 80:
                                int childTop5 = childBottom - childHeight;
                                height = height2;
                                childTop3 = childTop5 - ((LinearLayout.LayoutParams) lp).bottomMargin;
                                if (childBaseline != -1) {
                                    childTop = childTop3;
                                } else {
                                    int descent = child.getMeasuredHeight() - childBaseline;
                                    childTop = childTop3 - (maxDescent[2] - descent);
                                }
                                break;
                            default:
                                height = height2;
                                childTop = paddingTop;
                                break;
                        }
                        if (linearLayoutCompat.j(childIndex)) {
                            childLeft += linearLayoutCompat.g;
                        }
                        int childLeft4 = childLeft + ((LinearLayout.LayoutParams) lp).leftMargin;
                        g();
                        q(child, childLeft4 + 0, childTop, childWidth, childHeight);
                        int i5 = childWidth + ((LinearLayout.LayoutParams) lp).rightMargin;
                        h();
                        f();
                        i2 = i3 + 0;
                        childLeft = childLeft4 + i5 + 0;
                    }
                    childBaseline = -1;
                    gravity = ((LinearLayout.LayoutParams) lp).gravity;
                    if (gravity < 0) {
                        gravity2 = gravity;
                    } else {
                        gravity2 = minorGravity;
                    }
                    switch (gravity2 & 112) {
                        case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                            height = height2;
                            int childTop6 = ((((childSpace - childHeight) / 2) + paddingTop) + ((LinearLayout.LayoutParams) lp).topMargin) - ((LinearLayout.LayoutParams) lp).bottomMargin;
                            childTop = childTop6;
                            break;
                        case 48:
                            height = height2;
                            childTop2 = ((LinearLayout.LayoutParams) lp).topMargin + paddingTop;
                            if (childBaseline != -1) {
                                childTop = childTop2;
                            } else {
                                childTop = childTop2 + (maxAscent[1] - childBaseline);
                            }
                            break;
                        case 80:
                            int childTop7 = childBottom - childHeight;
                            height = height2;
                            childTop3 = childTop7 - ((LinearLayout.LayoutParams) lp).bottomMargin;
                            if (childBaseline != -1) {
                                childTop = childTop3;
                            } else {
                                int descent2 = child.getMeasuredHeight() - childBaseline;
                                childTop = childTop3 - (maxDescent[2] - descent2);
                            }
                            break;
                        default:
                            height = height2;
                            childTop = paddingTop;
                            break;
                    }
                    if (linearLayoutCompat.j(childIndex)) {
                        childLeft += linearLayoutCompat.g;
                    }
                    int childLeft5 = childLeft + ((LinearLayout.LayoutParams) lp).leftMargin;
                    g();
                    q(child, childLeft5 + 0, childTop, childWidth, childHeight);
                    int i6 = childWidth + ((LinearLayout.LayoutParams) lp).rightMargin;
                    h();
                    f();
                    i2 = i3 + 0;
                    childLeft = childLeft5 + i6 + 0;
                } else {
                    isLayoutRtl = isLayoutRtl2;
                    height = height2;
                    i2 = i3;
                }
            }
            i2++;
            linearLayoutCompat = this;
            layoutDirection2 = layoutDirection;
            isLayoutRtl2 = isLayoutRtl;
            height2 = height;
            maxDescent = maxDescent;
            maxAscent = maxAscent;
        }
    }

    public final void q(View child, int left, int top, int width, int height) {
        child.layout(left, top, left + width, top + height);
    }

    public void setOrientation(int orientation) {
        if (this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa != orientation) {
            this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = orientation;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    }

    public void setGravity(int gravity) {
        if (this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa != gravity) {
            if ((8388615 & gravity) == 0) {
                gravity |= 8388611;
            }
            if ((gravity & 112) == 0) {
                gravity |= 48;
            }
            this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = gravity;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    }

    public void setHorizontalGravity(int horizontalGravity) {
        int gravity = horizontalGravity & 8388615;
        int i = this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        if ((8388615 & i) != gravity) {
            this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = ((-8388616) & i) | gravity;
            requestLayout();
        }
    }

    public void setVerticalGravity(int verticalGravity) {
        int gravity = verticalGravity & 112;
        int i = this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        if ((i & 112) != gravity) {
            this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = (i & (-113)) | gravity;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa generateLayoutParams(AttributeSet attrs) {
        return new xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa generateDefaultLayoutParams() {
        int i = this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        if (i == 0) {
            return new xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(-2, -2);
        }
        if (i == 1) {
            return new xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa generateLayoutParams(ViewGroup.LayoutParams p) {
        return new xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(p);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public static class xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa extends LinearLayout.LayoutParams {
        public xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int width, int height) {
            super(width, height);
        }

        public xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(ViewGroup.LayoutParams p) {
            super(p);
        }
    }
}
