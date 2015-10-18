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
import android.widget.ImageButton;


public class WorkoutScreen extends ActionBarActivity {

    ImageButton b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_screen);


        b1 = (ImageButton) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notify("Message", "You've received new message");
            }
        });


    }
    public void Notify(String notificationTitle, String notificationMessage){
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        @SuppressWarnings("deprecation")

        Notification notification = new Notification(R.drawable.abc_ab_share_pack_mtrl_alpha,"New Message", System.currentTimeMillis());
        Intent notificationIntent = new Intent(this,NotificationView.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,notificationIntent, 0);

        notification.setLatestEventInfo(WorkoutScreen.this, notificationTitle,notificationMessage, pendingIntent);
        notificationManager.notify(9999, notification);
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_workout_screen, menu);
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
    public void sendBMI(View view)
    {
        Intent intent = new Intent(this,BmiActivity.class);
        startActivity(intent);
    }

    public void sendSchedule(View view)
    {
        Intent intent = new Intent(this,DisplayActivity.class);
        startActivity(intent);
    }
    public void sendRoutines(View view)
    {
        Intent intent = new Intent(this,WorkoutActivity.class);
        startActivity(intent);
    }
}
