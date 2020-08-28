package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChildActivity extends AppCompatActivity {

  Button Button2;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_child);

    Button2 = findViewById(R.id.button2);

    Button2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        // txt.setText("You clicked me!!");
        //Intencion de intentar una nueva actividad, pero aun no empieza
        Intent myIntent = new Intent(ChildActivity.this, MainActivity.class);
        //Se ejecuta el intento
        startActivity(myIntent);
      }
    });
  }
}
