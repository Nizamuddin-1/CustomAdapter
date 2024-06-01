package com.example.customadapteragain;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class myAdapter extends BaseAdapter {
    ArrayList<String> arrayList;
    Context context;
    public myAdapter(Context context,ArrayList<String> arrayList){
        this.arrayList=arrayList;
        this.context=context;
    }
    @Override
    public int getCount() {
        return arrayList.size()-1;
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null){
            view = LayoutInflater.from(context).inflate(R.layout.my_list,viewGroup,false);
            holder=new ViewHolder();
            holder.textView=view.findViewById(R.id.textView);
            view.setTag(holder);
        }
        else {
            holder=(ViewHolder) view.getTag();
        }
        holder.textView.setText(arrayList.get(i));
        return view;
    }
    static class ViewHolder{
        TextView textView;
    }
}
