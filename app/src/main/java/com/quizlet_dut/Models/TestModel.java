package com.quizlet_dut.Models;

public class TestModel {
    private String testID;
    private int topScore;
    private int time;

    public TestModel(String testID, int topScore, int time) {
        this.testID = testID;
        this.topScore = topScore;
        this.time = time;
    }

    public void setTestID(String testID) {
        this.testID = testID;
    }

    public void setTopScore(int topScore) {
        this.topScore = topScore;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTestID() {
        return testID;
    }

    public int getTopScore() {
        return topScore;
    }

    public int getTime() {
        return time;
    }
}