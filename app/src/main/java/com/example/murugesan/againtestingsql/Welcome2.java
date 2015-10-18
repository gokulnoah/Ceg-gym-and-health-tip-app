package com.example.murugesan.againtestingsql;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Welcome2 extends ActionBarActivity {
    ImageButton b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        setContentView(R.layout.activity_welcome2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //  return true;
        //}

//        return super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.action_settings1:
                Intent in = new Intent(this, Loggingout.class);
                startActivity(in);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void sendM(View view)
    {
        Intent intent = new Intent(this,ModeActivity.class);
        startActivity(intent);
    }
    public void sendContacts(View view)
    {
        Intent intent = new Intent(this,Contacts.class);
        startActivity(intent);
    }
    public void sendWork(View view)
    {
        Intent intent = new Intent(this,WorkoutScreen.class);
        startActivity(intent);
    }
}
