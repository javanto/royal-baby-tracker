package com.javanto.rbt;

import android.os.Bundle;
import android.support.v4.view.WindowCompat;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The Action Bar is a window feature. The feature must be requested
        // before setting a content view. Normally this is set automatically
        // by your Activity's theme in your manifest. The provided system
        // theme Theme.WithActionBar enables this for you. Use it as you would
        // use Theme.NoTitleBar. You can add an Action Bar to your own themes
        // by adding the element <item name="android:windowActionBar">true</item>
        // to your style definition.
        setContentView(R.layout.activity_main);
        TextView questionView = (TextView) findViewById(R.id.question);
        questionView.setText(Html.fromHtml(getString(R.string.question)));
        TextView answerView = (TextView) findViewById(R.id.answer);
        answerView.setText(Html.fromHtml(getString(R.string.positive)));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}