package com.aasguard.dev.funfacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {

    private FactBook mFactBook = new FactBook();
    private MeFactBook mMeFactBook = new MeFactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    public static final String TAG = FunFactsActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(19);
                if (randomNumber == 0) {
                    String meFact = mMeFactBook.getMeFact();
                    factLabel.setText(meFact);
                }
                else {
                    String fact = mFactBook.getFact();
                    factLabel.setText(fact);
                }

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);
        //Toast.makeText(this, "Yay, toast!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "log message!");
    }
}
