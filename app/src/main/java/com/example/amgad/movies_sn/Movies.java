package com.example.amgad.movies_sn;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Movies extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String s;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        ArrayList<String> posts = new ArrayList<String>();

        posts.add("Dark Knight");
        posts.add("Dark Knight Rises");
        posts.add("aa");
        posts.add("djfsnjcs");
        posts.add("dsmjnms");
        posts.add("sdj,nc,sad");
        posts.add("dajncdsaj");
        posts.add("dasjnsakjnfsda");
        posts.add("asdjfnkasjf");
        posts.add("adsfjnfdjnfdasln");


        ListAdapter buckysAdapter = new CustomAdapter(this, posts);
        ListView buckysListView = (ListView) findViewById(R.id.list);
        buckysListView.setAdapter(buckysAdapter);


        buckysListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(Movies.this, food, Toast.LENGTH_LONG).show();
                    }
                }
        );

    }

}





//package com.example.amgad.movies_sn;
//
//import android.os.Bundle;
//import android.app.Activity;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.view.Menu;
//import android.view.MenuItem;
//
//public class Movies extends Activity {
//
//    RecyclerView mRecyclerView;
//    RecyclerView.LayoutManager mLayoutManager;
//    RecyclerView.Adapter mAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_movies);
//
//        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
//        mRecyclerView.setHasFixedSize(true);
//
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);
//
//        mAdapter = new CustomAdapter();
//        mRecyclerView.setAdapter(mAdapter);
//    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//}
