package com.example.androideatit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSignUp,btnLogIn;
    TextView txtSlogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogIn=(Button)findViewById(R.id.log_in);
        btnSignUp=(Button)findViewById(R.id.sign_up);

        txtSlogan=(TextView)findViewById(R.id.textSlogan);
        Typeface face= Typeface.createFromAsset(getAssets(),"fonts/Nabila.ttf");
        txtSlogan.setTypeface(face);

        btnLogIn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent logIn = new Intent(MainActivity.this,LogIn.class);
                startActivity(logIn);

            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent SignUp = new Intent(MainActivity.this,SignUp.class);
                startActivity(SignUp);
            }
        });
    }
}
