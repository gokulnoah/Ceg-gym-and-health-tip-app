package com.example.murugesan.againtestingsql;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class BmiActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE1 = "com.mycompany.mygymapplication2.MESSAGE1";
    public final static String EXTRA_MESSAGE2 = "com.mycompany.mygymapplication2.MESSAGE2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        setContentView(R.layout.activity_bmi);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bmi, menu);
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
    public void resultBmi(View view)
    {
        Intent intent=new Intent(this,ResultActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText1);
        EditText editTexts=(EditText) findViewById(R.id.editText2);
        String message1 = editText.getText().toString();
        String message2 = editTexts.getText().toString();

        intent.putExtra(EXTRA_MESSAGE1, message1);
        intent.putExtra(EXTRA_MESSAGE2, message2);
        startActivity(intent);
    }
}
