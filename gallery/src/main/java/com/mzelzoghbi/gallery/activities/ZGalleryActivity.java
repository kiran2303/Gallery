package com.mzelzoghbi.gallery.activities;

import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.mzelzoghbi.gallery.Constants;
import com.mzelzoghbi.gallery.CustomViewPager;
import com.mzelzoghbi.gallery.OnImgClick;
import com.mzelzoghbi.gallery.R;
import com.mzelzoghbi.gallery.adapters.HorizontalListAdapters;
import com.mzelzoghbi.gallery.adapters.ViewPagerAdapter;
import com.mzelzoghbi.gallery.entities.ZColor;


public class ZGalleryActivity  {
//    private RelativeLayout mainLayout;
//
//    CustomViewPager mViewPager;
//    ViewPagerAdapter adapter;
//    RecyclerView imagesHorizontalList;
//    LinearLayoutManager mLayoutManager;
//    HorizontalListAdapters hAdapter;
//    private int currentPos;
//    private ZColor bgColor;
//
//
//    @Override
//    protected int getResourceLayoutId() {
//        return R.layout.activity_gallery;
//    }
//
//    @Override
//    protected void afterInflation() {
//        // init layouts
//        mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);
//        mViewPager = (CustomViewPager) findViewById(R.id.pager);
//        imagesHorizontalList = (RecyclerView) findViewById(R.id.imagesHorizontalList);
//
//        // get intent data
//        currentPos = getIntent().getIntExtra(Constants.IntentPassingParams.SELECTED_IMG_POS, 0);
//        bgColor = (ZColor) getIntent().getSerializableExtra(Constants.IntentPassingParams.BG_COLOR);
//
//        if (bgColor == ZColor.WHITE) {
//            mainLayout.setBackgroundColor(ContextCompat.getColor(this, android.R.color.white));
//        }
//
//        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        // pager adapter
//        adapter = new ViewPagerAdapter(this, imageURLs, mToolbar, imagesHorizontalList);
//        mViewPager.setAdapter(adapter);
//        // horizontal list adaapter
//        hAdapter = new HorizontalListAdapters(this, imageURLs, new OnImgClick() {
//            @Override
//            public void onClick(int pos) {
//                mViewPager.setCurrentItem(pos, true);
//            }
//        });
//        imagesHorizontalList.setLayoutManager(mLayoutManager);
//        imagesHorizontalList.setAdapter(hAdapter);
//        hAdapter.notifyDataSetChanged();
//
//        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                imagesHorizontalList.smoothScrollToPosition(position);
//                hAdapter.setSelectedItem(position);
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
//
//        hAdapter.setSelectedItem(currentPos);
//        mViewPager.setCurrentItem(currentPos);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == android.R.id.home) {
//            onBackPressed();
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
