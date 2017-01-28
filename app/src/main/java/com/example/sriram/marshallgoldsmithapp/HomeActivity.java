package com.example.sriram.marshallgoldsmithapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button Login,Signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Login = (Button) findViewById(R.id.login_button);
        Signup = (Button) findViewById(R.id.signup_button);
        Login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        Signup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });


    }
    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu, menu);

        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent intent0 = new Intent(Intent.ACTION_VIEW, Uri.parse("http:\\mail.coderdojocoimbatore.site"));
                startActivity(intent0);
                return true;
            case R.id.Signin_menu:
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
                return true;
            case R.id.Signup_menu:
                Intent intent1 = new Intent(HomeActivity.this, SignupActivity.class);
                startActivity(intent1);
                return true;
            case R.id.Exit:
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
