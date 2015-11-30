package com.example.amgad.movies_sn;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class CardviewAdapter extends RecyclerView.Adapter<CardviewAdapter.ViewHolder> {

    List<MovieItem> mItems;

    public CardviewAdapter() {
        super();
        mItems = new ArrayList<MovieItem>();
        MovieItem nature = new MovieItem();
        nature.setName("The Pursuit of Happiness");
        nature.setDes("A struggling salesman takes custody of his son as he's poised to begin a life-changing professional endeavor.");
        nature.setThumbnail(R.drawable.movie1);
        mItems.add(nature);

        nature = new MovieItem();
        nature.setName("V For Vendetta");
        nature.setDes("In a future British tyranny, a shadowy freedom fighter, known only by the alias of \"V\", plots to overthrow it with the help of a young woman.");
        nature.setThumbnail(R.drawable.movie2);
        mItems.add(nature);

        nature = new MovieItem();
        nature.setName("Now you see me");
        nature.setDes("An FBI agent and an Interpol detective track a team of illusionists who pull off bank heists during their performances and reward their audiences with the money..");
        nature.setThumbnail(R.drawable.movie3);
        mItems.add(nature);

        nature = new MovieItem();
        nature.setName("The Wolf of Wall Street");
        nature.setDes("Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government..");
        nature.setThumbnail(R.drawable.movie4);
        mItems.add(nature);


        nature = new MovieItem();
        nature.setName("The Godfather");
        nature.setDes("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");
        nature.setThumbnail(R.drawable.movie5);
        mItems.add(nature);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view_c_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        MovieItem nature = mItems.get(i);
        viewHolder.tvNature.setText(nature.getName());
        viewHolder.tvDesNature.setText(nature.getDes());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;
        public TextView tvNature;
        public TextView tvDesNature;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvNature = (TextView)itemView.findViewById(R.id.tv_nature);
            tvDesNature = (TextView)itemView.findViewById(R.id.tv_des_nature);
        }
    }
}