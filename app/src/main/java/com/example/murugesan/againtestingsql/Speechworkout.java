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


public class Speechworkout extends ActionBarActivity {

    TextToSpeech t1;
    EditText ed1;
    Button b1,b2,b3,b4,b5;
    static final String toSpeak="you have pressed chest workout chest workout is scheduled on every monday" +
            "chest workout consists of mflat bench press 3 sets weight 5 kg 8 kg 10 kg for beginners and 15 kg 25 kg 30 kg for experts" +
            "next upper bench press 3 sets weight 5 kg 7 kg 8 kg for beginners and 15 kg 25 kg 30 kg for experts" +
            "next inclined  press 3 sets weight 5 kg 7 kg 8 kg for beginners and 8 kg 10 kg 15 kg for experts" +
            "next fly 3 sets weight 4 kg 6 kg 8 kg for beginners and 10 kg 12 kg 16 kg for experts" +
            "next parellel bar 3 sets for beginners and 5 kg 8 kg 10 kg for experts" +
            "next bendam press 3 sets weight 10 kg 15 kg 17 kg for beginners and 20 kg 25 kg 30 kg for experts";

    static final String toSpeak2="you have pressed shoulder workout   scheduled on every tuesday" +
            "shoulder workout consists of military press 3 sets weight 5 kg 8 kg 10 kg for beginners and 12 kg 15 kg 20 kg for experts" +
            "next dumbell front  press 3 sets weight 5 kg 7 kg 8 kg for beginners and 10 kg 15 kg 18 kg for experts" +
            "next  machine  press 3 sets weight 5 kg 7 kg 8 kg for beginners and 8 kg 10 kg 15 kg for experts" +
            "next dumbell front  raises 3 sets weight 2 kg 5 kg 7 kg for beginners and 8 kg 10 kg 12 kg for experts" +
            "next lateral raises 3 sets weight 5 kg 7 kg 8 kg for beginners and 10 kg 12 kg 15 kg for experts" +
            "next shrugs 3 sets weight 5 kg 7 kg 8 kg for beginners and 20 kg 30 kg 40 kg for experts";
    static final String toSpeak3="you have pressed lats workout scheduled on every wednesday" +
            "lats workout consists of bent over row 3 sets weight 5 kg 8 kg 10 kg for beginners and 12 kg 15 kg 20 kg for experts" +
            "next pull downs 3 sets weight 5 kg 7 kg 8 kg for beginners and 10 kg 15 kg 18 kg for experts" +
            "next  pull ups 3 sets weight 5 kg 7 kg 8 kg for beginners and 8 kg 10 kg 15 kg for experts" +
            "next cable rope 3 sets weight 2 kg 5 kg 7 kg for beginners and 8 kg 10 kg 12 kg for experts" +
            "next neck press down 3 sets weight 5 kg 7 kg 8 kg for beginners and 6 kg 8 kg 10 kg for experts";

    static final String toSpeak4="you have pressed triceps workout scheduled on every thursday" +
            "triceps workout consists of bench dips 3 sets weight 5 kg 8 kg 10 kg for beginners and 20 kg 30 kg 40 kg for experts" +
            "next tricep bench press 3 sets weight 5 kg 7 kg 8 kg for beginners and 20 kg 25 kg 30 kg for experts" +
            "next  rope press 3 sets weight 3 kg 5 kg 7 kg for beginners and 8 kg 10 kg 15 kg for experts" +
            "next ez bar press 3 sets weight 5 kg 7 kg 7 kg for beginners and 10 kg 12 kg 15 kg for experts" +
            "next one arm raises 3 sets weight 5 kg 7 kg 7 kg for beginners and 15 kg 17 kg 20 kg for experts" +
            "next dumbell extension 3 sets weight 5 kg 7 kg 7 kg for beginners and 11 kg 15 kg 17 kg for experts";
    static final String toSpeak5="you have pressed biceps workout scheduled on every friday biceps workout consists of biceps curls 3 sets weight 5 kg 8 kg 10 kg for beginners and 15 kg 18 kg 20 kg for expertsnext ez bar curls 3 sets weight 5 kg 7 kg 8 kg for beginners and 15 kg 18 kg 20 kg for experts next barbell extension 3 sets weight 5 kg 7 kg 8 kg for beginners and 8 kg 10 kg 12 kg for experts next hammer curls 3 sets weight 2 kg 5 kg 7 kg for beginners and 8 kg 10 kg 12 kg for experts next cable curls 3 sets weight 5 kg 7 kg 8 kg for beginners and 10 kg 12 kg 15 kg for expert atlast sitting dumbell 3 sets weight 5 kg 7 kg 8 kg for beginners and 10 kg 15 kg 20 kg for experts";

    static final String s1="you selected chest routine";
    static final String s2="you selected shoulder routine";
    static final String s3="you selected lats routine";
    static final String s4="you selected triceps routine";
    static final String s5="you selected biceps routine";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        setContentView(R.layout.activity_speechworkout);
        //ed1=(EditText)findViewById(R.id.editText);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        b3=(Button)findViewById(R.id.button5);
        b4=(Button)findViewById(R.id.button6);
        b5=(Button)findViewById(R.id.button7);
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), s1, Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), s2, Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak2, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), s3, Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak3, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), s4, Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak4, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), s5, Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak5, TextToSpeech.QUEUE_FLUSH, null);
            }
        });


    }

    public void onPause(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_speechworkout, menu);
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
