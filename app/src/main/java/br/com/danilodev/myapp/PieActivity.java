package br.com.danilodev.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
