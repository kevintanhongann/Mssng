package com.mssng.android.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;

import com.mssng.android.R;


/**
 * Created by kevintanhongann on 5/12/15.
 */
public class AutofitRecyclerView extends RecyclerView {

    private int columnWidth;

    private int numColumns;

    private int rowHeight;

    private GridLayoutManager manager;

    private boolean smoothScrollbarEnabled;

    private static final String TAG = "AutofitRecyclerView";

    public AutofitRecyclerView(Context context) {
        super(context);
    }

    public AutofitRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public AutofitRecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        super.onMeasure(widthSpec, heightSpec);
        if (columnWidth > 0) {
            int spanCount = Math.max(1, getMeasuredWidth() / columnWidth);
            Log.d(TAG, "AutofitRecyclerView spanCount "+spanCount);
            manager.setSpanCount(spanCount);
        }
    }

    private void init(Context context, AttributeSet attrs) {

        TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.AutofitRecyclerView,
                0, 0);

        try {
            numColumns = typedArray.getInt(R.styleable.AutofitRecyclerView_numColumns, 1);
            rowHeight = typedArray.getDimensionPixelSize(R.styleable.AutofitRecyclerView_rowHeight,
                    100);
            smoothScrollbarEnabled = typedArray.getBoolean(R.styleable.AutofitRecyclerView_smoothScrollbarEnabled, false);
        } finally {
            typedArray.recycle();
        }

        if (attrs != null) {
            int[] attrsArray = {
                    android.R.attr.columnWidth
            };
            TypedArray array = context.obtainStyledAttributes(
                    attrs, attrsArray);
            columnWidth = array.getDimensionPixelSize(0, -1);
            array.recycle();
        }

        Log.d(TAG, "AutofitRecyclerView numColumns "+numColumns);

        manager = new GridLayoutManager(getContext(), numColumns);
        manager.setSmoothScrollbarEnabled(smoothScrollbarEnabled);
        setLayoutManager(manager);
    }
}
