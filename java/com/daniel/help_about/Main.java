package com.daniel.help_about;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
//import static com.daniel.help_about.R;


public class Main extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        final Context context = this;

        int id = item.getItemId();

        switch (item.getItemId()) {
            case R.id.action_help:
                // Help is selected
                Intent intent_help = new Intent(context, help.class);
                startActivity(intent_help);

                return true;

            case R.id.action_about:
                // About is selected

                Intent intent_about = new Intent(context, about.class);
                startActivity(intent_about);

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}