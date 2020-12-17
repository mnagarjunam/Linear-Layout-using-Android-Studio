package com.example.linearlayout;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {
    Button red,blue,green;
    LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blue = findViewById(R.id.blue);
        green = findViewById(R.id.green);
        red = findViewById(R.id.red);
        linear = (LinearLayout) findViewById(R.id.linear);

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear.setBackgroundColor(Color.BLUE);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear.setBackgroundColor(Color.GREEN);
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear.setBackgroundColor(Color.RED);
            }
        });
    }
}
