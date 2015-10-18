package com.example.murugesan.againtestingsql;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;


public class ModeActivity extends ActionBarActivity {


    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        setContentView(R.layout.activity_mode);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mode, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_settings1:
                Intent in = new Intent(this, Loggingout.class);
                startActivity(in);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void Timer(View view)
    {
        Intent intent=new Intent(this,Alarm.class);
        startActivity(intent);
    }
    public void speech(View view)
    {
        Intent intent=new Intent(this,Blind.class);
        startActivity(intent);
    }

}
