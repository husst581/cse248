package net.androidbootcamp.checkdrawer;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class camera_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_activity);
        ActionBar actionBar=(ActionBar) getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.ic_file_upload_black_24dp);
        FloatingActionButton fabHome = (FloatingActionButton) findViewById(R.id.float_home);
        fabHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchHome();


            }
        });
        FloatingActionButton fabDashboard = (FloatingActionButton) findViewById(R.id.float_dashboard);
        fabDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               switchDashboard();
            }
        });
        FloatingActionButton fabExit = (FloatingActionButton) findViewById(R.id.float_exit);
        fabExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }        });


        }
    public void switchHome(){
        Intent searchIntent = new Intent(camera_activity.this, MainActivity.class);
        startActivity(searchIntent);
        }
        public void switchDashboard(){
        Intent searchIntent = new Intent(camera_activity.this, dashbaord.class);
        startActivity(searchIntent);

    }
    }
