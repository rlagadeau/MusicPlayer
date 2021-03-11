package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = MediaPlayer.create(this,R.raw.drake);
    }

    public void play(View v){
        music.start();
        Toast start = Toast.makeText(this, "The music is started", Toast.LENGTH_SHORT);
        start.show();
    }

    public void pause(View v){
        music.pause();
        Toast pause = Toast.makeText(this, "The music is paused", Toast.LENGTH_SHORT);
        pause.show();
    }

    public void stop(View v){
        music.stop();
        music = MediaPlayer.create(this, R.raw.drake);
        Toast stop = Toast.makeText(this, "The music is stopped", Toast.LENGTH_SHORT);
        stop.show();
    }
}