package com.example.student.omnitrix;

import java.util.Random;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;
    private Random random = new Random();
    private int rnd;

    private Predictions() {
        answers = new String[] {
                "You have just recieved Four-Arms!",
                "You have just recieved Heat-Blast!",
                "You have just recieved Diamond-Head!",
                "You have just recieved XLR8!",
                "You have recieved nothing LOL."

        };
    }

    public static Predictions get() {
        if(predictions == null) {
            predictions = new Predictions();
        }
        return predictions;
    }

    public String getPrediction() {
        rnd  = random.nextInt(answers.length);
        return answers[rnd];
    }
}