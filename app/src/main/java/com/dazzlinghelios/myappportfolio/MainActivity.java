package com.dazzlinghelios.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 *  created by Merlin, 10/19/2016
 *
 *  Main activity for the Project MyAppPortfolio
 *
 *
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final Button[] buttons = new Button[6];
    public static final int[] ids = {R.id.button1, R.id.button2,
                                     R.id.button3, R.id.button4,
                                     R.id.button5, R.id.button6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 6; ++i) {
            buttons[i] = (Button) findViewById(ids[i]);
        }

        for (int i = 0; i < 6; ++i) {
            buttons[i].setOnClickListener(this);
        }
    }

    // toast
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button1:
                Toast.makeText(MainActivity.this, "LAUNCHING  \'POPULAR MOVIES\' APP",
                        Toast.LENGTH_LONG).show();
                break;

            case R.id.button2:
                Toast.makeText(MainActivity.this, "LAUNCHING  \'STOCK HAWK\' APP",
                        Toast.LENGTH_LONG).show();
                break;

            case R.id.button3:
                Toast.makeText(MainActivity.this, "LAUNCHING  \'BUILD IT BIGGER\' APP",
                        Toast.LENGTH_LONG).show();
                break;

            case R.id.button4:
                Toast.makeText(MainActivity.this, "LAUNCHING  \'MAKE APP MATERIAL\' APP",
                        Toast.LENGTH_LONG).show();
                break;

            case R.id.button5:
                Toast.makeText(MainActivity.this, "LAUNCHING  \'GO UBIQUITOUS\' APP",
                        Toast.LENGTH_LONG).show();
                break;

            case R.id.button6:
                Toast.makeText(MainActivity.this, "LAUNCHING  \'CAPSTONE\' APP",
                        Toast.LENGTH_LONG).show();
                break;
        }
    }
}
