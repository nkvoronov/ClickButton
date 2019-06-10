package com.nkvoronov.clickbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mHelloTextView;
    private Button mCrowsCounterButton;
    private Button mCatsCounterButton;
    private int mCountCrown = 0;
    private int mCountCat = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = (TextView) findViewById(R.id.textView);
        mHelloTextView.setText("");
        mCrowsCounterButton = findViewById(R.id.button_counter_crown);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mHelloTextView.setText(getString(R.string.countcrown, ++mCountCrown));
           }
        });
        mCatsCounterButton = findViewById(R.id.button_counter_cat);
        mCatsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHelloTextView.setText(getString(R.string.countcat, ++mCountCat));
            }
        });
    }

    public void onClick(View view) {
        mCountCrown = 0;
        mCountCat = 0;
        mHelloTextView.setText(getString(R.string.label));
    }
}
