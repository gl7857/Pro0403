package com.example.pro0403;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    int clicksNumber=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
    }

    public void clicked(View view) {
        clicksNumber++;
        btn.setText("This is a click number:"+clicksNumber);
        if (clicksNumber==6){
            btn.setText("Enough to click.Go to new start!");
            clicksNumber=0;
        }
    }
}
