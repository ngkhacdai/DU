package com.example.test_pr.Home;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.SyncStateContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.test_pr.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView slideshow = view.findViewById(R.id.homeslideshow);
        slideshow.setBackgroundResource(R.drawable.home_slideshow);
        AnimationDrawable animationDrawable = (AnimationDrawable) slideshow.getBackground();
        animationDrawable.start();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i<10;i++){
            list.add(R.drawable.phukienslideshow);
        }
        NonScrollGridView gridView = view.findViewById(R.id.lv);
        gridView.setNumColumns(2);
        gridView.setAdapter(new GrAdapter(list));
        gridView.setExpanded(true);
    }
    public class GrAdapter extends BaseAdapter{
        ArrayList<Integer> list;

        public GrAdapter(ArrayList<Integer> list) {
            this.list = list;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
            ImageView img = convertView.findViewById(R.id.img);
            img.setImageResource(list.get(position));
            return convertView;
        }
    }



}