package com.example.murugesan.againtestingsql;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PhoneActivity extends Activity {
    ImageButton b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        setContentView(R.layout.activity_phone);
        b1=(ImageButton)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call();
            }
        });


        b2=(ImageButton)findViewById(R.id.button1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call2();
            }
        });

        b3=(ImageButton)findViewById(R.id.button2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call3();
            }
        });
    }

    private void call() {
        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
        phoneIntent.setData(Uri.parse("tel:8870708051"));
        //Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("9840985057"));
        try{
            startActivity(phoneIntent);
        }

        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"yourActivity is not founded",Toast.LENGTH_SHORT).show();
        }
    }
    private void call2() {
        Intent phoneIntent2 = new Intent(Intent.ACTION_CALL);
        phoneIntent2.setData(Uri.parse("tel:8056209557"));
        //Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("0000000000"));
        try{
            startActivity(phoneIntent2);
        }

        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"yourActivity is not founded",Toast.LENGTH_SHORT).show();
        }
    }
    private void call3() {
        Intent phoneIntent3 = new Intent(Intent.ACTION_CALL);
        phoneIntent3.setData(Uri.parse("tel:9840985057"));
        //Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("0000000000"));
        try{
            startActivity(phoneIntent3);
        }

        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"yourActivity is not founded",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_phone, menu);
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