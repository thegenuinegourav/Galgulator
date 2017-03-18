package com.example.android.galgulator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;


public class MainActivity extends ActionBarActivity implements BottomFragment.BottomSectionListener
{




    @Override
    public void display(String number) {
        TopFragment topFragment = (TopFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);

        double num1 = Double.parseDouble(number);
        topFragment.setNumber1(num1);
    }

    @Override
    public void Result(double result) {
        TopFragment topFragment = (TopFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        topFragment.setResult(result);

    }

    @Override
    public void display2(String number) {

        TopFragment topFragment = (TopFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);

        double num2 = Double.parseDouble(number);
        topFragment.setNumber2(num2);
    }

    @Override
    public void displaySign(String sign) {
        TopFragment topFragment = (TopFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        topFragment.setSign(sign);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
