package com.example.amgad.movies_sn;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Friends_profile extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_profile);

        ArrayList<String> posts = new ArrayList<String>();

        posts.add("Ana profile sa7bak");
        posts.add("a");
        posts.add("bgd");
        posts.add("adkjnakd");
        posts.add("lcasdjclaisj");
        posts.add("daskjncdsakjcd");
        posts.add("ajksdnfdklasjnflkdsfijlksdanfkjdsnfdkaljfnkdjasf");
        posts.add("lfsdkjfn;liefje;lwifjnlreifnkenfsjdvnksljnfsdlknf");
        posts.add("sadkljlf;aisfj;laewiji;woeijf;owij;ofwij;o");
        posts.add("sdmvjbn,bsj,sfbshbjdsvjyvda");

//        String[] foods = {"Bacon", "Ham", "Tuna", "Candy", "Meatball", "Potato"};

        ListAdapter buckysAdapter = new CustomAdapter(this, posts);
        ListView buckysListView = (ListView) findViewById(R.id.list);
        buckysListView.setAdapter(buckysAdapter);




        Button friends = (Button) findViewById(R.id.button12);
        friends.setOnClickListener(this);

        Button movies = (Button) findViewById(R.id.button13);
        movies.setOnClickListener(this);




    }



    public void onClick(View b){
        switch (b.getId()) {



            case R.id.button12:
                Intent friends = new Intent(b.getContext(), Friends.class);
                startActivityForResult(friends, 0);
                break;


            case R.id.button13:
                Intent movies = new Intent(b.getContext(), Movies.class);
                startActivityForResult(movies, 0);
                break;




            default:
                break;
        }

    }

}





//package com.example.amgad.movies_sn;
//
//import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.Toolbar;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.ListAdapter;
//import android.widget.ListView;
//
//public class Friends_profile extends AppCompatActivity {
//    RecyclerView mRecyclerView;
//    RecyclerView.LayoutManager mLayoutManager;
//    RecyclerView.Adapter mAdapter;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_friends_profile);
//        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
//        mRecyclerView.setHasFixedSize(true);
//
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);
//
//        mAdapter = new CustomAdapter();
//        mRecyclerView.setAdapter(mAdapter);
//
//
//    }
//
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
//
//}
