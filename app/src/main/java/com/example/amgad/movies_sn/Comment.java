package com.example.amgad.movies_sn;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

import java.util.ArrayList;

public class Comment extends Activity  {
    ArrayList<String> comments = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        Intent intent = getIntent();
        comments = intent.getStringArrayListExtra("key");
        if(comments == null){
            comments = new ArrayList<String>();
        }
    }

}
