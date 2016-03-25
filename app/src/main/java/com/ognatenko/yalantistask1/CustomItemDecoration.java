package com.ognatenko.yalantistask1;

import android.view.View;
import android.support.v7.widget.RecyclerView;
import android.graphics.Rect;

/**
 * Created by Irony on 03/25/16.
 */
public class CustomItemDecoration extends RecyclerView.ItemDecoration {
    private final int mHorizSpaceSize;

    public CustomItemDecoration(int size) {
        mHorizSpaceSize = size;
    }

    @Override
    public void getItemOffsets(Rect rect, View view, RecyclerView parent, RecyclerView.State state) {
        rect.right = mHorizSpaceSize;
    }
}
