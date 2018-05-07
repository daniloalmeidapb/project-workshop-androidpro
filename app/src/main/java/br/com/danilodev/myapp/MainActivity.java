package br.com.danilodev.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cakeButton = findViewById(R.id.cake_button);
        cakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CakeActivity.class);
                startActivity(intent);
            }
        });

        Button pieButton = findViewById(R.id.pie_button);
        pieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PieActivity.class);
                startActivity(intent);
            }
        });

        Button cookieButton = findViewById(R.id.cookie_button);
        cookieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CookieActivity.class);
                startActivity(intent);
            }
        });

        Button iceCreamButton = findViewById(R.id.ice_cream_button);
        iceCreamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IceCreamActivity.class);
                startActivity(intent);
            }
        });
    }

}
