package com.example.amgad.movies_sn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bLogin,bFbLogin;
    TextView etUsername,etPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bLogin = (Button) findViewById(R.id.bLogin);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);

        bLogin.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bLogin:
                if( etUsername.getText().toString().length() == 0 ) {
                    etUsername.setError("Username is required!");
                }
                if( etPassword.getText().toString().length() == 0 ) {
                    etPassword.setError("Username is required!");
                }
                else{
                    Intent login = new Intent(v.getContext(), My_profile.class);
                    startActivityForResult(login, 0);
                    break;

                }
                break;
        }

    }
}










//package com.example.amgad.movies_sn;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.ActionBarActivity;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//import android.view.View;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.Button;
//
//public class MainActivity extends ActionBarActivity {
//
//
//        @Override
//        public void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//
//            Button next = (Button) findViewById(R.id.button11);
//            next.setOnClickListener(new View.OnClickListener() {
//                public void onClick(View view) {
//                    Intent myIntent = new Intent(view.getContext(), My_profile.class);
//                    startActivityForResult(myIntent, 0);
//                }
//
//            });
//        }
//
//    }
//
//
//
