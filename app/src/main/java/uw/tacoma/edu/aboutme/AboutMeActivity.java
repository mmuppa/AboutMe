package uw.tacoma.edu.aboutme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        TextView aboutMeTextView = (TextView) findViewById(R.id.about_me_text);
        aboutMeTextView.setText("Menaka Abraham\n\n Will be in school forever!! \n\n Teaching \n\n");

    }
}
