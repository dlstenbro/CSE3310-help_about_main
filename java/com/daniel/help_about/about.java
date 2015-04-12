package com.daniel.help_about;

import android.app.Activity;
import android.os.Bundle;
import static com.daniel.help_about.R.*;

public class about extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.about);       // view the about xml when the about overflow is pressed
    }

}