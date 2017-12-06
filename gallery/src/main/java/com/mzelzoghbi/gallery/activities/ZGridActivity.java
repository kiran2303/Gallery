package com.mzelzoghbi.gallery.activities;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.mzelzoghbi.gallery.Constants;
import com.mzelzoghbi.gallery.R;
import com.mzelzoghbi.gallery.ZGallery;
import com.mzelzoghbi.gallery.adapters.GridImagesAdapter;
import com.mzelzoghbi.gallery.adapters.listeners.GridClickListener;
import com.mzelzoghbi.gallery.entities.ZColor;


public final class ZGridActivity extends BaseActivity implements GridClickListener {
    private RecyclerView mRecyclerView;
    private GridImagesAdapter adapter;

    private int imgPlaceHolderResId;
    private int spanCount = 2;

    @Override
    protected int getResourceLayoutId() {
        return R.layout.activity_grid;
    }

    @Override
    protected void afterInflation() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // get extra values
        imgPlaceHolderResId = getIntent().getIntExtra(Constants.IntentPassingParams.IMG_PLACEHOLDER, -1);
        spanCount = getIntent().getIntExtra(Constants.IntentPassingParams.COUNT, 2);

        adapter = new GridImagesAdapter(this, imageURLs, imgPlaceHolderResId);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, spanCount));
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(int pos) {
        ZGallery.with(this, imageURLs)
                .setToolbarTitleColor(ZColor.WHITE)
                .setToolbarColorResId(toolbarColorResId)
                .setSelectedImgPosition(pos)
                .setTitle(mToolbar.getTitle().toString())
                .show();
    }
}
