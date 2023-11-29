package com.example.intent;

import static com.example.intent.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main2);
        tv1 = findViewById(R.id.t1);
        tv2 = findViewById(R.id.t2);

        Bundle extra = getIntent().getExtras();
        String text1 = extra.getString("First Name:");
        String text2 = extra.getString("Last Name:");
        tv1.setText("First Name: "+text1);
        tv2.setText("Last Name: "+text2);

    }

}
