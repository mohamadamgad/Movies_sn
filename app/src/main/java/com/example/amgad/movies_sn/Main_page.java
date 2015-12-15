package com.example.amgad.movies_sn;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main_page extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        ImageButton imgButton =(ImageButton)findViewById(R.id.profile);
        ImageButton moods = (ImageButton)findViewById(R.id.moods);
        ImageButton movie = (ImageButton)findViewById(R.id.moviee);
        Button timeline = (Button) findViewById(R.id.timeline);



        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        Intent profile = new Intent(v.getContext(), My_profile.class);
                        startActivityForResult(profile, 0);

            }
        });

        moods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent moods = new Intent(v.getContext(), Moviemood.class);
                startActivityForResult(moods, 0);
            }
        });

        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent movie = new Intent(v.getContext(), moviedb.class);
                startActivityForResult(movie, 0);

            }
        });


        timeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent timeline = new Intent(v.getContext(), Post.class);
                startActivityForResult(timeline, 0);

            }
        });






    }


//    public void onClick(View b){
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
//            case R.id.buttonpost:
//                TextView text = (TextView) findViewById(R.id.editText);
//                String newPost = text.getText().toString();
//                posts.add(0, newPost);
//
//
//
//
//                Intent i=new Intent(this, My_profile.class);
//                i.putStringArrayListExtra("key", posts);
//                startActivity(i);
//
//
//
//
//
//
//
//
//                break;
//
//
//
//            default:
//                break;
//        }
//
//    }

}
