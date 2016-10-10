package com.example.student.omnitrix;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;

    private Predictions() {
        answers = new String[] {
                "You have just recieved Four-Arms!",
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
        return answers[1];
    }
}