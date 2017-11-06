package main;

import java.util.ArrayList;

public class ScoreList extends ArrayList<Score> {

  public ScoreList() {
    
    this.add(new Score(0, 0, "Love-All"));
    this.add(new Score(1, 1, "Fifteen-All"));
    this.add(new Score(2, 2, "Thirty-All"));
    this.add(new Score(3, 3, "Forty-All"));
    this.add(new Score(4, 4, "Deuce"));
    this.add(new Score(1, 0, "Fifteen-Love"));
    this.add(new Score(0, 1, "Love-Fifteen"));
    this.add(new Score(2, 0, "Thirty-Love"));
    this.add(new Score(0, 2, "Love-Thirty"));
    this.add(new Score(3, 0, "Forty-Love"));
    this.add(new Score(0, 3, "Love-Forty"));
    this.add(new Score(4, 0, "Win for player1"));
    this.add(new Score(0, 4, "Win for player2"));
    this.add(new Score(2, 1, "Thirty-Fifteen"));
    this.add(new Score(3, 1, "Forty-Fifteen"));
    this.add(new Score(1, 2, "Fifteen-Thirty"));
    this.add(new Score(1, 3, "Fifteen-Forty"));
    this.add(new Score(4, 1, "Win for player1"));
    this.add(new Score(1, 4, "Win for player2"));
    this.add(new Score(3, 2, "Forty-Thirty"));
    this.add(new Score(2, 3, "Thirty-Forty"));
    this.add(new Score(4, 2, "Win for player1"));
    this.add(new Score(2, 4, "Win for player2"));
    this.add(new Score(4, 3, "Advantage player1"));
    this.add(new Score(3, 4, "Advantage player2"));
    this.add(new Score(5, 4, "Advantage player1"));
    this.add(new Score(4, 5, "Advantage player2"));
    this.add(new Score(15, 14, "Advantage player1"));
    this.add(new Score(14, 15, "Advantage player2"));
    this.add(new Score(6, 4, "Win for player1"));
    this.add(new Score(4, 6, "Win for player2"));
    this.add(new Score(16, 14, "Win for player1"));
    this.add(new Score(14, 16, "Win for player2"));
  }
}