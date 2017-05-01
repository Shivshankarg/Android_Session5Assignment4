package com.shivshankar.session5assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView textView=(TextView)findViewById(R.id.username);
        Bundle bundl=getIntent().getExtras();
        String strig=bundl.getString("usrname");
        String s=bundl.getString("passwrd");
        textView.setText("Welcome "+strig);
    }

    public void OnLogout(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
