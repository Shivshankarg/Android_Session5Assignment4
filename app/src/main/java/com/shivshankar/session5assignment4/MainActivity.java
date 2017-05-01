package com.shivshankar.session5assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLogin(View view) {
        EditText usrid=(EditText)findViewById(R.id.usredit);
        String s=usrid.getText().toString();
        EditText pwd=(EditText)findViewById(R.id.pwdedit);
        String p=pwd.getText().toString();
        if (s.isEmpty())
        {
            usrid.setError("Please enter user name");
        }
        else if (p.isEmpty())
        {
            pwd.setError("Please enter password");
        }
        else
        {
            Bundle bundle=new Bundle();
            bundle.putString("usrname",s);
            bundle.putString("passwrd",p);
            Intent intent=new Intent(this,Login.class);
            intent.putExtras(bundle);
            startActivity(intent);
            usrid.setText("");
            pwd.setText("");
        }

    }
}
