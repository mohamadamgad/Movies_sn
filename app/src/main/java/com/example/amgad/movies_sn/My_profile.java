package com.example.amgad.movies_sn;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.widget.Button;


public class My_profile extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        Button next = (Button) findViewById(R.id.Button01);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Edit_profile.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }

}










//import android.app.ListActivity;
//import android.os.Bundle;
//import android.widget.ArrayAdapter;
//
//public class My_profile extends ListActivity {
//
//    String[] itemname ={
//            "Safari",
//            "Camera",
//            "Global",
//            "FireFox",
//            "UC Browser",
//            "Android Folder",
//            "VLC Player",
//            "Cold War"
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my_profile);
//
//        this.setListAdapter(new ArrayAdapter<String>(
//                this, R.layout.mylist,
//                R.id.Itemname,itemname));
//    }
//}