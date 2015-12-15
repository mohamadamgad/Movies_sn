package com.example.amgad.movies_sn;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;


        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

class CustomAdapter extends ArrayAdapter<String> {
    Context  context;
    ArrayList<String> Posts;
    CustomAdapter(Context context, ArrayList<String> posts) {
        super(context, R.layout.custom_row ,posts);
        Posts = posts;
        this.context = context;
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {




        LayoutInflater buckysInflater = LayoutInflater.from(getContext());
        View customView = buckysInflater.inflate(R.layout.custom_row, parent, false);

        TextView buckysText = (TextView) customView.findViewById(R.id.buckysText);
        buckysText.setText(Posts.get(position));
        ImageView buckysImage = (ImageView) customView.findViewById(R.id.buckysImage);

        Button comment = (Button) customView.findViewById(R.id.commentbutton);



        buckysImage.setOnClickListener(new View.OnClickListener() {


            @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Friends_profile.class);
                    context.startActivity(myIntent);
                }
            });


        comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Comment.class);
                context.startActivity(myIntent);
            }
        });



        buckysImage.setImageResource(R.drawable.profilepic);
        return customView;
    }
}























//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageButton;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//
//import com.example.amgad.movies_sn.R;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
///**
// * Created by Edwin on 18/01/2015.
// */
//
//public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>  {
//
////    CustomAdapter(Context context, ArrayList<String>posts) {
////    }
//
//    List<Item> mItems;
//
//    public CustomAdapter() {
//        super();
//        mItems = new ArrayList<Item>();
//        Item nature = new Item();
//        nature.setName("The Great Barrier Reef");
//        nature.setDes("Hello");
//        nature.setThumbnail(R.drawable.profile);
//        mItems.add(nature);
//
//        nature = new Item();
//        nature.setName("Grand Canyon");
//        nature.setDes("Hello");
//        nature.setThumbnail(R.drawable.profile);
//        mItems.add(nature);
//
//        nature = new Item();
//        nature.setName("Baltoro Glacier");
//        nature.setDes("Hello");
//        nature.setThumbnail(R.drawable.profile);
//        mItems.add(nature);
//
//        nature = new Item();
//        nature.setName("Iguazu Falls");
//        nature.setDes("Hello");
//        nature.setThumbnail(R.drawable.profile);
//        mItems.add(nature);
//
//        nature = new Item();
//        nature.setName("Aurora Borealis");
//        nature.setDes("Hello");
//        nature.setThumbnail(R.drawable.profile);
//        mItems.add(nature);
//    }
//
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
//        View v = LayoutInflater.from(viewGroup.getContext())
//                .inflate(R.layout.card, viewGroup, false);
//        ViewHolder viewHolder = new ViewHolder(v);
//        return viewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(ViewHolder viewHolder, int i) {
//        Item nature = mItems.get(i);
//        viewHolder.tvNature.setText(nature.getName());
//        viewHolder.tvDesNature.setText(nature.getDes());
//        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
//    }
//
//    @Override
//    public int getItemCount() {
//        return mItems.size();
//    }
//
//    class ViewHolder extends RecyclerView.ViewHolder{
//
//        public ImageView imgThumbnail;
//        public TextView tvNature;
//        public TextView tvDesNature;
//        public ImageButton comment;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
//            tvNature = (TextView)itemView.findViewById(R.id.tv_nature);
//            tvDesNature = (TextView)itemView.findViewById(R.id.tv_des_nature);
//
//           // comment = (ImageButton)itemView.findViewById(R.id.comment);
//
////            comment.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View v) {
////                    Intent myIntent = new Intent(v.getContext(), Edit_profile.class);
////                    Main.this.startActivityForResult(myIntent, 0);
////                }
////            });
//
//
//        }
//
//
//    }
//
//
//}