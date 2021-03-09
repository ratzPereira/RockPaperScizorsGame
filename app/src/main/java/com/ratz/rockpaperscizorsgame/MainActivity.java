package com.ratz.rockpaperscizorsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playerChoose(String playerChoose) {

        ImageView cpuHandImg = findViewById(R.id.cpuHand);

        TextView result = findViewById(R.id.resultText);

        int randomNumber = new Random().nextInt(3);
        String[] hands = {"rock", "paper", "scizor"};

        String cpuHand = hands[randomNumber];

        switch (cpuHand) {
            case "rock": cpuHandImg.setImageResource(R.drawable.pedra);
                break;
            case "paper": cpuHandImg.setImageResource(R.drawable.papel);
                break;
            case "scizor": cpuHandImg.setImageResource(R.drawable.tesoura);
                break;
        }

        if( cpuHand == "scizor" && playerChoose == "paper" || cpuHand == "rock" && playerChoose == "scizor" || cpuHand == "paper" && playerChoose == "rock") {
            //cpu wins
            result.setText("Computer wins!");
        } else if (cpuHand == "paper" && playerChoose == "scizor" || cpuHand == "rock" && playerChoose == "scizor" || cpuHand == "paper" && playerChoose == "rock") {
            // player wins
            result.setText("You won!");
        }else {
            //draw
            result.setText("Its a tie!");
        }

    }

    public void rockHand(View view) {
        this.playerChoose("rock");
    }

    public void paperHand(View view) {
        this.playerChoose("paper");
    }

    public void scizorHand(View view) {
        this.playerChoose("scizor");
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
