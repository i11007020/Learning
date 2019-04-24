package com.chen.exceptions;

public class Score {
    int value;
    public Score(String s) throws ScoreFormatException{
        try {
            int val = Integer.parseInt(s);
            if(val < 0 || val > 100) {
                throw new ScoreFormatException();
            }
            this.value = val;
        } catch (NumberFormatException e) {
            throw new ScoreFormatException();
        }

    }
}
