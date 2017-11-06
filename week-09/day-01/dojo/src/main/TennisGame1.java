package main;

public class TennisGame1 implements TennisGame {

  private ScoreList scoreList;
  private Player player1;
  private Player player2;

  public TennisGame1(String player1Name, String player2Name) {
    this.player1 = new Player(player1Name);
    this.player2 = new Player(player2Name);
    this.scoreList = new ScoreList();
  }

  public void wonPoint(String playerName) {
    if (playerName.equals(player1.getName())) {
      player1.setScore(player1.getScore() + 1);
    } else {
      player2.setScore(player2.getScore() + 1);
    }
  }

  public String getScore() {

    for (int i = 0; i < scoreList.size(); i++) {
      if (scoreList.get(i).getPlayer1score() == player1.getScore()) {
        if (scoreList.get(i).getPlayer2score() == player2.getScore()) {
          return String.valueOf(scoreList.get(i).getResult());
        }
      }
    }
    return "";
  }
}