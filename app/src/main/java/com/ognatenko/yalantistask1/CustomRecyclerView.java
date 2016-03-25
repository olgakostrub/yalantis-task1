package com.ognatenko.yalantistask1;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.LayoutInflater;

import com.squareup.picasso.Picasso;

import android.widget.Toast;

/**
 * Created by Irony on 03/24/16.
 */
public class CustomRecyclerView extends RecyclerView.Adapter<CustomRecyclerView.ImageHolder> {
    private String[] mImages;
    private Context mContext;

    public CustomRecyclerView(Context context, String[] images) {
        mContext = context;
        mImages = images;
    }

    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_image, parent, false);
        return new ImageHolder(view);
    }

    @Override
    public int getItemCount() {
        return mImages.length;
    }

    @Override
    public void onBindViewHolder(ImageHolder container, int position) {
        Picasso.with(mContext)
                .load(mImages[position])
                .placeholder(R.mipmap.ic_launcher)
                .centerInside().fit().into(container.mImageView);
    }


    class ImageHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;

        public ImageHolder(final View view) {
            super(view);
            mImageView = (ImageView) view.findViewById(R.id.image_view);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toastText = view.getClass().getCanonicalName() + "\n" + (mImages[getAdapterPosition()]);
                    Toast.makeText(mContext, toastText, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
