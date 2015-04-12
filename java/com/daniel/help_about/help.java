package com.daniel.help_about;

import android.app.Activity;
import android.os.Bundle;
import static com.daniel.help_about.R.*;

public class help extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.help);        // view the xml information when HELP is pressed
    }

}