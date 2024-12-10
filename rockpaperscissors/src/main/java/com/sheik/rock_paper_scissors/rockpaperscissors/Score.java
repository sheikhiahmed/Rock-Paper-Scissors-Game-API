package com.sheik.rock_paper_scissors.rockpaperscissors;

public class Score {
    int wins;
    int ties;
    int losses;

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getLooses() {
        return losses;
    }

    public void setLooses(int losses) {
        this.losses = losses;
    }

    public Score() {
    }

    public Score(int wins, int ties, int losses) {
        this.wins = wins;
        this.ties = ties;
        this.losses = losses;
    }

    // spring jdbj and data
}
