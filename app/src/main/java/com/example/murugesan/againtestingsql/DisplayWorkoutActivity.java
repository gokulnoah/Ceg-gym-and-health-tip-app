package com.example.murugesan.againtestingsql;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class DisplayWorkoutActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(WorkoutActivity.EXTRA_MESSAGE);

        // Create the text view
        //TextView textView = new TextView(this);

        //textView.getText(message);

        // Set the text view as the activity layout

        int i=Integer.parseInt(message);
        if(i>=50&&i<=60) {
            setContentView(R.layout.activity_display_workout);
        }
        else
        {
            System.out.println("you are unfit");
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_workout, menu);
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
    public void sendChest(View view)
    {
        Intent intent=new Intent(this,ChestActivity.class);
        startActivity(intent);
    }
    public void sendShoulder(View view)
    {
        Intent intent=new Intent(this,ShoulderActivity.class);
        startActivity(intent);
    }
    public void sendLats(View view)
    {
        Intent intent=new Intent(this,LatsActivity.class);
        startActivity(intent);
    }
    public void sendTri(View view)
    {
        Intent intent=new Intent(this,TricepsActivity.class);
        startActivity(intent);
    }
    public void sendBi(View view)
    {
        Intent intent=new Intent(this,BicepsActivity.class);
        startActivity(intent);
    }
    public void sendSquat(View view)
    {
        Intent intent=new Intent(this,SquatsActivity.class);
        startActivity(intent);
    }
}
