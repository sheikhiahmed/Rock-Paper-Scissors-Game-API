package com.sheik.rock_paper_scissors.rockpaperscissors;

public class Score {
    int wins;
    int ties;
    int looses;

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
        return looses;
    }

    public void setLooses(int looses) {
        this.looses = looses;
    }

    public Score() {
    }

    public Score(int wins, int ties, int looses) {
        this.wins = wins;
        this.ties = ties;
        this.looses = looses;
    }

    // spring jdbj and data
}
