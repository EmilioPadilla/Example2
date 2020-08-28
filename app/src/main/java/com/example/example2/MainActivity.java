package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  Button myButton;
  TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button1);
        txt = findViewById(R.id.Txt1);
        txt.setText("Suppp!!");

        myButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            txt.setText("You clicked me!!");
          }


        });

    }
}
