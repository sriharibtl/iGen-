
package com.example.srihari.igen_plus;

import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;


public class MainActivity extends ActionBarActivity {

    SearchView g1;
    Button g2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g2 = (Button) findViewById(R.id.g2);

        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(MainActivity.this, MainActivity2Activity.class);
                startActivity(intent);
            }
        });
    }
}
