package com.example.murugesan.againtestingsql;

/**
 * Created by murugesan on 9/14/2015.
 */

import android.os.Bundle;
import android.app.Activity;
import android.widget.LinearLayout;

import java.util.Random;

public class NotificationView extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Random r = new Random();
        int Low = 1;
        int High = 4;
        int R = r.nextInt(High - Low) + Low;
        if(R==1) {
            setContentView(com.example.murugesan.againtestingsql.R.layout.notification);
        }
        if(R==2)
        {
            setContentView(com.example.murugesan.againtestingsql.R.layout.notification1);
        }
        if(R==3)
        {
            setContentView(com.example.murugesan.againtestingsql.R.layout.notification2);
        }
    }
}
