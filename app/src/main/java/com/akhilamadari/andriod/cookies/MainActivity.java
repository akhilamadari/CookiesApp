package com.akhilamadari.andriod.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.id.message;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String message = " ";

    public void printToLogs(View view) {

        TextView item1 = (TextView) findViewById(R.id.menu_item_1);
        message = (String) item1.getText();
        Log.i("MainActivity: ", message);

        TextView item2 = (TextView) findViewById(R.id.menu_item_2);
        message = (String) item2.getText();
        Log.i("MainActivity", message);

        TextView item3 = (TextView) findViewById(R.id.menu_item_3);
        message = (String) item3.getText();
        Log.i("MainActivity",  message);


    }
}