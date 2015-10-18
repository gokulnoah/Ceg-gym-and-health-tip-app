package com.example.murugesan.againtestingsql;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class WorkoutActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.mycompany.mygymapplication2.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //public final static String EXTRA_MESSAGE = "com.mycompany.mygymapplication.MESSAGE";
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();


        setContentView(R.layout.activity_workout);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_workout, menu);
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
    public void sendWork1(View view)
    {
        Intent intent=new Intent(this,DisplayWorkoutActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
