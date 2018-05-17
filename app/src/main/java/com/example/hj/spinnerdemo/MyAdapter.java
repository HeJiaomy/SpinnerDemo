package com.example.hj.spinnerdemo;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter implements SpinnerAdapter {

    private ArrayList<String> list;
    private Context context;

    public MyAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView== null){
            holder= new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.item,null);
            holder.textView= convertView.findViewById(R.id.tv_name);
            holder.imageView= convertView.findViewById(R.id.iv_image);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }

        holder.textView.setText(list.get(position));
        holder.imageView.setImageResource(R.mipmap.ic_launcher);
        return convertView;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView== null){
            holder= new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.item,null);
            holder.textView= convertView.findViewById(R.id.tv_name);
            holder.imageView= convertView.findViewById(R.id.iv_image);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }

        holder.textView.setText(list.get(position));
        holder.imageView.setImageResource(R.mipmap.ic_launcher);
        return convertView;
    }

    private class ViewHolder{
        TextView textView;
        ImageView imageView;
    }

    @Override
    public int getItemViewType(int position) {
        return 1;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
