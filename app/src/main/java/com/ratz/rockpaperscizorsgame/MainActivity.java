package com.ratz.rockpaperscizorsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int cpuWins = 0;
    int playerWins = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playerChoose(String playerChoose) {



        ImageView cpuHandImg = findViewById(R.id.cpuHand);

        TextView result = findViewById(R.id.resultText);

        TextView userScore = findViewById(R.id.playerScore);
        TextView cpuScore = findViewById(R.id.cpuScore);


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


        if(     cpuHand == "scizor" && playerChoose == "paper" ||
                cpuHand == "paper" && playerChoose == "rock" ||
                cpuHand == "rock" && playerChoose == "scizor") {
            //cpu wins
            cpuWins++;
            System.out.println("CPU WON " + cpuWins);
            result.setText("Computer wins!");
            userScore.setText(String.valueOf(playerWins));

        } else if (  playerChoose == "scizor" && cpuHand == "paper" ||
                     playerChoose == "paper" && cpuHand == "rock" ||
                     playerChoose == "rock" && cpuHand == "scizor") {
            // player wins
            playerWins++;
            result.setText("You won!");
            System.out.println("Player WON " + playerWins);

            cpuScore.setText(String.valueOf(cpuWins));

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

}
