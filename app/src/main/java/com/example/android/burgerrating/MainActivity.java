package com.example.android.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar=findViewById(R.id.ratingBar);
        textView=findViewById(R.id.textView);
    }

    public void btn(View view){

        float rate=ratingBar.getRating();
        if(rate<2){
            textView.setText("We will improve");
        }
        else if(rate>=2 && rate<3){
            textView.setText("We are constantly improving");
        }
        else if(rate>=3 && rate<4){
            textView.setText("We will continously serve you...");
        }
        else if(rate>=4 && rate<=5){
            textView.setText("Thank you... We are very proud to service you");
        }

    }
}
