package com.example.lab3_1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.ImageView;

import java.util.List;

public class ImageAdapter extends BaseAdapter {
    private List<Integer> ThumbIds;
    private Context mContext;
    public ImageAdapter(List<Integer> ThumbIds,Context mContext)
    {
        this.mContext=mContext;
        this.ThumbIds=ThumbIds;

    }
    @Override
    public int getCount() {
        return ThumbIds.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return ThumbIds.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageview=(ImageView) convertView;
        if(imageview==null)
        {
            imageview=new ImageView((mContext));
            imageview.setLayoutParams(new ViewGroup.LayoutParams(350,450));
            imageview.setScaleType((ImageView.ScaleType.CENTER_CROP));

        }
        imageview.setImageResource((ThumbIds.get(position)));
        return imageview;
    }
}
