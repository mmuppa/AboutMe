package uw.tacoma.edu.aboutme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JowyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jowy);

        TextView jowyText = (TextView) findViewById(R.id.about_jowy_text);
        jowyText.setText("I'm Jowy Tran \n\n I'm going to be graduating in 3 quarters \n\n Nice to meet you \n\n");
    }

}
