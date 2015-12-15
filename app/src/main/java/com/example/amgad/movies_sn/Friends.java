package com.example.amgad.movies_sn;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Friends extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String s;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        ArrayList<String> posts = new ArrayList<String>();

        posts.add("Ahmad ");
        posts.add("Ali");
        posts.add("Amgad");
        posts.add("Mohamad");
        posts.add("Ziad");
        posts.add("Ayman");
        posts.add("Aymoon");
        posts.add("Zayood");
        posts.add("omar");
        posts.add("DIAA");


//        Bundle bun=this.getIntent().getExtras();
//        Intent i = getIntent();
//        ArrayList<String> list = i.getStringArrayListExtra("post");
////        ArrayList<String> newposts = bun.getStringArrayList("posts");
//
//        posts.add(0,list.get(0));

//        Bundle b=this.getIntent().getExtras();
//        ArrayList<String> postnew =b.getStringArrayList("key");
//
//        posts.add(0,postnew.get(0));


        ListAdapter buckysAdapter = new CustomAdapter(this, posts);
        ListView buckysListView = (ListView) findViewById(R.id.list);
        buckysListView.setAdapter(buckysAdapter);


        buckysListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(Friends.this, food, Toast.LENGTH_LONG).show();
                    }
                }
        );

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
//import android.widget.ImageView;
//import android.widget.ListAdapter;
//import android.widget.ListView;
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
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ListAdapter;
//import android.widget.ListView;
//import android.widget.Toast;
//import android.app.Activity;
//import android.widget.Button;
//
//public class Friends extends AppCompatActivity implements View.OnClickListener{
//    RecyclerView mRecyclerView;
//    RecyclerView.LayoutManager mLayoutManager;
//    RecyclerView.Adapter mAdapter;
//
//
//
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_friends);
//            mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
//            mRecyclerView.setHasFixedSize(true);
//
//            mLayoutManager = new LinearLayoutManager(this);
//            mRecyclerView.setLayoutManager(mLayoutManager);
//
//            mAdapter = new CustomAdapter();
//            mRecyclerView.setAdapter(mAdapter);
//
//
//            ImageView image = (ImageView) findViewById(R.id.img_thumbnail);
//
//            image.setOnClickListener(this);
//
//
//
//        }
//
//        @Override
//        public boolean onCreateOptionsMenu(Menu menu) {
//            // Inflate the menu; this adds items to the action bar if it is present.
//            getMenuInflater().inflate(R.menu.menu_main, menu);
//            return true;
//        }
//
//        @Override
//        public boolean onOptionsItemSelected(MenuItem item) {
//            // Handle action bar item clicks here. The action bar will
//            // automatically handle clicks on the Home/Up button, so long
//            // as you specify a parent activity in AndroidManifest.xml.
//            int id = item.getItemId();
//
//            //noinspection SimplifiableIfStatement
//            if (id == R.id.action_settings) {
//                return true;
//            }
//
//            return super.onOptionsItemSelected(item);
//        }
//
//    @Override
//    public void onClick(View b)
//    {
//        switch (b.getId()) {
//
//
//            case R.id.img_thumbnail:
//                Intent image = new Intent(b.getContext(), Friends_profile.class);
//                startActivityForResult(image, 0);
//                break;
//
//            default:
//                break;
//        }
//
//
//    }
//
//
//
//    }
//
//
