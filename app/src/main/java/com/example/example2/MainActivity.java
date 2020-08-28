package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
            // txt.setText("You clicked me!!");
            //Intencion de intentar una nueva actividad, pero aun no empieza
            Intent myIntent = new Intent(MainActivity.this, ChildActivity.class);
            //Se ejecuta el intento
            startActivity(myIntent);

          }


        });

      // Some existing RelativeLayout from your layout xml
      RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL1);

      ImageView iv = new ImageView(this);

      RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(30, 40);
      params.leftMargin = 50;
      params.topMargin = 60;
      rl.addView(iv, params);

    }
}
