package com.ratz.rockpaperscizorsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playerChoose(String playerChoose) {

    }

    public void rockHand() {

    }

    public void paperHand() {

    }

    public void scizorHand() {

    }

    public void startGame(View view) {

      ImageView rockImg = findViewById(R.id.rock);
      ImageView paperImg = findViewById(R.id.paper);
      ImageView scizorImg = findViewById(R.id.scizor);


      TextView userScore = findViewById(R.id.playerScore);
      TextView cpuScore = findViewById(R.id.cpuScore);


      TextView roundResult = findViewById(R.id.resultText);


      int playerWins = 0;
      int cpuWins = 0;
    }

}
