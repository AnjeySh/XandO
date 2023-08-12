package com.example.xo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void chck1 (View view){
        CheckBox cb9 = findViewById(R.id.cB1);
        cb9.setClickable(false);
        cb9.setText("X");
        int j;
        Random r = new Random();
        j = r.nextInt(9)+1;
        step(j);
    }public void chck2 (View view){
        CheckBox cb9 = findViewById(R.id.cB2);
        cb9.setClickable(false);
        cb9.setText("X");
        int j;
        Random r = new Random();
        j = r.nextInt(9)+1;
        step(j);
    }public void chck3 (View view){
        CheckBox cb9 = findViewById(R.id.cB3);
        cb9.setClickable(false);
        cb9.setText("X");
        int j;
        Random r = new Random();
        j = r.nextInt(9)+1;
        step(j);
    }public void chck4 (View view){
        CheckBox cb9 = findViewById(R.id.cB4);
        cb9.setClickable(false);
        cb9.setText("X");
        int j;
        Random r = new Random();
        j = r.nextInt(9)+1;
        step(j);
    }public void chck5 (View view){
        CheckBox cb9 = findViewById(R.id.cB5);
        cb9.setClickable(false);
        cb9.setText("X");
        int j;
        Random r = new Random();
        j = r.nextInt(9)+1;
        step(j);
    }public void chck6 (View view){
        CheckBox cb9 = findViewById(R.id.cB6);
        cb9.setClickable(false);
        cb9.setText("X");
        int j;
        Random r = new Random();
        j = r.nextInt(9)+1;
        step(j);
    }public void chck7 (View view){
        CheckBox cb9 = findViewById(R.id.cB7);
        cb9.setClickable(false);
        cb9.setText("X");
        int j;
        Random r = new Random();
        j = r.nextInt(9)+1;
        step(j);
    }public void chck8 (View view){
        CheckBox cb9 = findViewById(R.id.cB8);
        cb9.setClickable(false);
        cb9.setText("X");
        int j;
        Random r = new Random();
        j = r.nextInt(9)+1;
        step(j);
    }
    public void chck9 (View view){
        CheckBox cb9 = findViewById(R.id.cB9);
        cb9.setClickable(false);
        cb9.setText("X");
        int j;
        Random r = new Random();
        j = r.nextInt(9)+1;
        step(j);
    }
    private void step (int i){
        CheckBox cb = findViewById(R.id.cB1);
        switch (i){
            case (1):

                break;
            case (2):
                cb = findViewById(R.id.cB2);
                break;
            case (3):
                cb = findViewById(R.id.cB3);
                break;
            case (4):
                cb = findViewById(R.id.cB4);
                break;
            case (5):
                cb = findViewById(R.id.cB5);
                break;
            case (6):
                cb = findViewById(R.id.cB6);
                break;
            case (7):
                cb = findViewById(R.id.cB7);
                break;
            case (8):
                cb = findViewById(R.id.cB8);
                break;
            case (9):
                cb = findViewById(R.id.cB9);
                break;
        }
        cb.setClickable(false);
        cb.setChecked(true);
        cb.setText("0");
    }
}