package com.example.ivan.higherlower;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    EditText guessedNumber;


    public void checkGuess (View view) {

        String guessedNumberString = guessedNumber.getText().toString();

        if (guessedNumberString.matches ("")) {
            Toast.makeText(this, "You did not enter a number.", Toast.LENGTH_SHORT).show();
            return;
        }

        int guessedNumberInt = Integer.parseInt(guessedNumberString);


        String message = "";

        if (guessedNumberInt > randomNumber) {

            message = "Too High.";

        } else if (guessedNumberInt < randomNumber) {

            message = "Too Low.";

        }

            else{

            message = "Correct, well done! Try again!";
            Random();

        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }



    public void Random () {
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(21);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guessedNumber = (EditText) findViewById(R.id.guessedNumber);
        Random();

    }
}
