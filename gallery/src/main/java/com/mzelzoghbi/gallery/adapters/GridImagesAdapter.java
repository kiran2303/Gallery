package com.mzelzoghbi.gallery.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.mzelzoghbi.gallery.ImageViewHolder;
import com.mzelzoghbi.gallery.R;
import com.mzelzoghbi.gallery.adapters.listeners.GridClickListener;

import java.util.ArrayList;

public class GridImagesAdapter extends RecyclerView.Adapter<ImageViewHolder> {
    private ArrayList<String> imageURLs;
    private Activity mActivity;
    private int imgPlaceHolderResId = -1;
    private GridClickListener clickListener;

    public GridImagesAdapter(Activity activity, ArrayList<String> imageURLs, int imgPlaceHolderResId) {
        this.imageURLs = imageURLs;
        this.mActivity = activity;
        this.imgPlaceHolderResId = imgPlaceHolderResId;
        this.clickListener = (GridClickListener) activity;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImageViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, null));
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, final int position) {
        Glide.with(mActivity).load(imageURLs.get(position))
                .placeholder(imgPlaceHolderResId != -1 ? imgPlaceHolderResId : R.drawable.placeholder)
                .into(holder.image);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageURLs != null ? imageURLs.size() : 0;
    }
}
