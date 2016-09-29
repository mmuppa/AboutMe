package uw.tacoma.edu.aboutme;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAboutMe(View v) {
        Intent i = new Intent(this, AboutMeActivity.class);
        startActivity(i);
    }

    public void openJowy(View v) {
        Intent i = new Intent(this, JowyActivity.class);
        startActivity(i);
    }

    public void showImage(View v) {
        Intent i = new Intent(this, ImageActivity.class);
        startActivity(i);

    }

    public void openWebPage(View v) {
        Uri webpage = Uri.parse("http://developer.android.com/index.html");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void openToast(View v) {
        Toast.makeText(this, "I am a message", Toast.LENGTH_SHORT)
                .show();
    }

    public void openDialog(View v) {
        new AlertDialog.Builder(this)
                .setMessage("I am a dialog")
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create().show();
    }

}
