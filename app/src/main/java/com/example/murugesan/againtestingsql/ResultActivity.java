package com.example.murugesan.againtestingsql;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ResultActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        String messagea = intent.getStringExtra(BmiActivity.EXTRA_MESSAGE1);
        String messageb = intent.getStringExtra(BmiActivity.EXTRA_MESSAGE2);
        float a=Float.parseFloat(messagea);
        float b=Float.parseFloat(messageb);
        float c;

        if(a>0&&b>0) {
            c = a / (b * b);


            String result = String.valueOf(c);
            TextView textView = new TextView(this);

            textView.setBackgroundResource(R.drawable.result);

            if(c<18.5)
            {
                String s1=new String("UNDER WEIGHT ;)");
                textView.setTextSize(40);
                textView.setTextColor(Color.MAGENTA);
                textView.setText(s1 + "\n" + result);
                setContentView(textView);

            }
            if(c>=18.5&&c<=24.9)
            {
                String s1=new String("NORMAL :)");
                textView.setTextSize(40);
                textView.setTextColor(Color.CYAN);
                textView.setText(s1 + "\n" + result);
                setContentView(textView);
            }
            if(c>=25.0&&c<=29.9)
            {
                String s1=new String("OVER WEIGHT :(");
                textView.setTextSize(40);
                textView.setTextColor(Color.YELLOW);
                textView.setText(s1+""+result);
                setContentView(textView);
            }
            if(c>=30.0)
            {
                String s1=new String("OBESE :-(");
                textView.setTextSize(40);
                textView.setTextColor(Color.BLACK);
                textView.setText(s1 + "\n" + result);
                setContentView(textView);
            }

            // r1.addView(textView);
            //setContentView(R.layout.activity_result);

            //r1.setBackgroundResource(R.drawable.bmresult);
        }
        else
        {
            String s2=new String("wrong input format");
            TextView textView=new TextView(this);
            textView.setBackgroundResource(Color.WHITE);
            textView.setTextColor(Color.YELLOW);
            textView.setText(s2);
            setContentView(textView);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result, menu);
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
