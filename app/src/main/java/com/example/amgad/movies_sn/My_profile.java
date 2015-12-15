package com.example.amgad.movies_sn;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import retrofit.RestAdapter;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.Path;

public class My_profile extends Activity implements View.OnClickListener{

    myAPI api;
    ArrayList<String> posts = new ArrayList<String>();
//    Context context = getApplicationContext();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);


        Intent intent = getIntent();
        posts = intent.getStringArrayListExtra("key");
        if(posts == null){
            posts = new ArrayList<String>();
        }
//        String[] foods = {"Bacon", "Ham", "Tuna", "Candy", "Meatball", "Potato"};

        ListAdapter buckysAdapter = new CustomAdapter(this, posts);
        ListView buckysListView = (ListView) findViewById(R.id.list);
        buckysListView.setAdapter(buckysAdapter);


        Button edit = (Button) findViewById(R.id.Button01);
        edit.setOnClickListener(this);

        Button friends = (Button) findViewById(R.id.button12);
        friends.setOnClickListener(this);

        Button movies = (Button) findViewById(R.id.button13);
        movies.setOnClickListener(this);


        Button post = (Button) findViewById(R.id.buttonpost);
        post.setOnClickListener(this);
        final RestAdapter ADAPTER =
                new RestAdapter.Builder().setEndpoint("http://10.0.2.2:3000").build();
         api = ADAPTER.create(myAPI.class);


    }



    public void onClick(View b){

        switch (b.getId()) {


            case R.id.button12:
//                Intent friends = new Intent(b.getContext(), Friends.class);
//                startActivityForResult(friends, 0);

                api.findFriends(new Callback<users>() {
                    @Override
                    public void success(users users, Response response) {
                        String x  = users.getFirst_name();
                        Log.d("eshta3'al yalla" , x);
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Log.d("eeh ba2aaa ", error.toString());

                    }
                });

//                api.findFriends( new Callback<users>() {
//                    @Override
//                    public void success(String a, Response response) {
//                        Log.d("khoood ", a );
//
//                        //  startActivity(new Intent(My_profile.this, friends.class));
//                    }
//
//                    @Override
//                    public void failure(RetrofitError error) {
//                        Log.d("eeh ba2aaa ", error.toString());
//                    }
//                });
                break;

            case R.id.Button01:
                Intent edit = new Intent(b.getContext(), Edit_profile.class);
                startActivityForResult(edit, 0);
                break;

            case R.id.button13:
                Intent movies = new Intent(b.getContext(), Movies_android.class);
                startActivityForResult(movies, 0);
                break;

            case R.id.buttonpost:
                TextView text = (TextView) findViewById(R.id.editText);
                String newPost = text.getText().toString();
                posts.add(0, newPost);



                Intent i=new Intent(this, My_profile.class);
                i.putStringArrayListExtra("key", posts);
                startActivity(i);


                break;



            default:
                break;
        }

    }

}
















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
//import android.widget.ImageButton;
//import android.widget.ListAdapter;
//import android.widget.ListView;
//import android.widget.Toast;
//import android.app.Activity;
//import android.widget.Button;
//
//
//
//public class My_profile extends AppCompatActivity implements View.OnClickListener {
//
//
//    RecyclerView mRecyclerView;
//    RecyclerView.LayoutManager mLayoutManager;
//    RecyclerView.Adapter mAdapter;
//
//    public Activity activity;
//
//    public My_profile( Activity _activity){
//
//        this.activity = _activity;
//
//    }
//
//   // CustomAdapter c = new CustomAdapter(this);
//
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my_profile);
//
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
//
//
//
//
//        Button edit = (Button) findViewById(R.id.Button01);
//        edit.setOnClickListener(this);
//
//        Button friends = (Button) findViewById(R.id.button12);
//        friends.setOnClickListener(this);
//
//        Button movies = (Button) findViewById(R.id.button13);
//        movies.setOnClickListener(this);
//
//
//
//    }
//
//
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
//    @Override
//    public void onClick(View b)
//    {
//        switch (b.getId()) {
//
//
//
//            case R.id.button12:
//                Intent friends = new Intent(b.getContext(), Friends.class);
//                startActivityForResult(friends, 0);
//                break;
//
//            case R.id.Button01:
//                Intent edit = new Intent(b.getContext(), Edit_profile.class);
//                startActivityForResult(edit, 0);
//                break;
//
//            case R.id.button13:
//                Intent movies = new Intent(b.getContext(), Movies.class);
//                startActivityForResult(movies, 0);
//                break;
//
//            case R.id.comment:
//                Intent comment = new Intent(b.getContext(), Edit_profile.class);
//                startActivityForResult(comment, 0);
//                break;
//
//            default:
//                break;
//        }
//    }
//}
