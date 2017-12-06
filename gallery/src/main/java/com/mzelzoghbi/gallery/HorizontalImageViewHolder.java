package com.mzelzoghbi.gallery;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;


public class HorizontalImageViewHolder extends RecyclerView.ViewHolder {
    public ImageView image;

    public HorizontalImageViewHolder(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.iv);
    }
}
