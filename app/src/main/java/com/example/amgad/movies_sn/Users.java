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

public class Users extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        ArrayList<String> posts = new ArrayList<String>();

        posts.add("Ana mesh sa7bak");
        posts.add("a");
        posts.add("bgd");
        posts.add("adkjnakd");
        posts.add("lcasdjclaisj");
        posts.add("daskjncdsakjcd");
        posts.add("ajksdnfdklasjnflkdsfijlksdanfkjdsnfdkaljfnkdjasf");
        posts.add("lfsdkjfn;liefje;lwifjnlreifnkenfsjdvnksljnfsdlknf");
        posts.add("sadkljlf;aisfj;laewiji;woeijf;owij;ofwij;o");
        posts.add("sdmvjbn,bsj,sfbshbjdsvjyvda");


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

