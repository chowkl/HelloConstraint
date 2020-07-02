package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, " CHOW KOK LIM 19WMD03570 ",Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));

        }
        if (mCount%2==1) {
            view.setBackgroundColor(Color.GREEN);
            findViewById(R.id.button).setBackgroundColor(Color.RED);
        }
        else {
            view.setBackgroundColor(Color.MAGENTA);
            findViewById(R.id.button).setBackgroundColor(Color.CYAN);
        }

    }
    public void reset(View view){
        Toast toast = Toast.makeText(this, " Reset ",Toast.LENGTH_SHORT);
        toast.show();
        mCount = 0;
        mShowCount = (TextView) findViewById(R.id.show_count);
        view.setBackgroundColor(Color.GRAY);
        findViewById(R.id.button_count).setBackgroundColor(Color.BLUE);


    }
}

