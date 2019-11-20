package com.example.test01;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class costem extends BaseAdapter
{
    Context context;
     int[] img1;
      String[] name;
    ArrayList arrayList;


    costem(Context context,int[] img,String[] name)
    {
        this.img1=img;
        this.name=name;
        this.context=context;


    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        convertView=View.inflate(context,R.layout.design,null);

        ImageView img=convertView.findViewById(R.id.i1);
        TextView txt=convertView.findViewById(R.id.t1);

        img.setImageResource(img1[position]);
        txt.setText(name[position]);


        return  convertView;



    }
}
