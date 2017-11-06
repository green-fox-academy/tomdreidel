package main;

public class Score {
  private int player1score;
  private int player2score;
  private String result;

  public Score(int player1score, int player2score, String result) {
    this.player1score = player1score;
    this.player2score = player2score;
    this.result = result;
  }

  public int getPlayer1score() {
    return player1score;
  }

  public int getPlayer2score() {
    return player2score;
  }

  public String getResult() {
    return result;
  }
}
