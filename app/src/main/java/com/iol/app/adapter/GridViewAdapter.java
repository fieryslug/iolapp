package com.iol.app.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.iol.app.R;

public class GridViewAdapter extends BaseAdapter {

    private Context mContext;
    private Integer[] mImageIds = {

            R.drawable.iol_logo_bgg,
            R.drawable.uklo_logo,
            R.drawable.naclo_logo,
            R.drawable.obl_logo,
            R.drawable.plo_logo,
            R.drawable.ailo_logo,
            R.drawable.iol_logo_bg,
            R.drawable.iol_logo_bgb,
            R.drawable.iol_logo_bg,
            R.drawable.iol_logo_bgb,
            R.drawable.iol_logo_bg,
            R.drawable.iol_logo_bgb,
            R.drawable.iol_logo_bg,
            R.drawable.iol_logo_bgb

    };

    public GridViewAdapter(Context context) {

        mContext = context;

    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView;
        if(view == null) {

            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(0, 0, 0, 0);

        }
        else {
            imageView = (ImageView) view;
        }

        imageView.setImageResource(mImageIds[i]);
        return imageView;
    }
}
