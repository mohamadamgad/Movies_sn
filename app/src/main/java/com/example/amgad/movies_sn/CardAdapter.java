package com.example.amgad.movies_sn;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    List<TimeItem> mItems;

    public CardAdapter() {
        super();
        mItems = new ArrayList<>();
        TimeItem item = new TimeItem();
        item.setName("The Great Barrier Reef");
        item.setDes("Lorem ipsum dolor sit amet,.");
        item.setThumbnail(R.drawable.movie1);
        mItems.add(item);

        item = new TimeItem();
        item.setName("Grand Canyon");
        item.setDes("Lorem ipsum dolor sit amet,");
        item.setThumbnail(R.drawable.movie1);
        mItems.add(item);

        item = new TimeItem();
        item.setName("Baltoro Glacier");
        item.setDes("Lorem ipsum dolor sit amet.");
        item.setThumbnail(R.drawable.movie1);
        mItems.add(item);

        item = new TimeItem();
        item.setName("Iguazu Falls");
        item.setDes("Lorem ipsum dolor sit amet.");
        item.setThumbnail(R.drawable.movie1);
        mItems.add(item);


        item = new TimeItem();
        item.setName("Aurora Borealis");
        item.setDes("Lorem ipsum dolor sit amet,");
        item.setThumbnail(R.drawable.movie1);
        mItems.add(item);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view_card_item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        TimeItem item = mItems.get(i);
        viewHolder.tvitem.setText(item.getName());
        viewHolder.tvDesitem.setText(item.getDes());
        viewHolder.imgThumbnail.setImageResource(item.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;
        public TextView tvitem;
        public TextView tvDesitem;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvitem = (TextView)itemView.findViewById(R.id.tv_item);
            tvDesitem = (TextView)itemView.findViewById(R.id.tv_des_item);
        }
    }
}