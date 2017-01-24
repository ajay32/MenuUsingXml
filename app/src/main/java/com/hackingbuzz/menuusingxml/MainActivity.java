package com.hackingbuzz.menuusingxml;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);

        switch (item.getItemId()) {

            case R.id.red : rl.setBackgroundColor(Color.RED); break;
            case R.id.close: finish(); break;
            case  R.id.gray: rl.setBackgroundColor(Color.GRAY); break;
            case R.id.green: rl.setBackgroundColor(Color.GREEN); break;
            case R.id.yello: rl.setBackgroundColor(Color.YELLOW); break;
            case R.id.white: rl.setBackgroundColor(Color.WHITE); break;
            default: rl.setBackgroundColor(Color.BLACK);
        }


        return super.onOptionsItemSelected(item);
    }
}
