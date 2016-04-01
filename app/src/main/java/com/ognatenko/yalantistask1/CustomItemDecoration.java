package com.ognatenko.yalantistask1;

import android.view.View;
import android.support.v7.widget.RecyclerView;
import android.graphics.Rect;

/**
 * Created by Irony on 03/25/16.
 */
public class CustomItemDecoration extends RecyclerView.ItemDecoration {
    private final int mHorizontalSpaceSize;

    public CustomItemDecoration(int size) {
        mHorizontalSpaceSize = size;
    }

    @Override
    public void getItemOffsets(Rect rect, View view, RecyclerView parent, RecyclerView.State state) {
        rect.right = mHorizontalSpaceSize;
    }
}
