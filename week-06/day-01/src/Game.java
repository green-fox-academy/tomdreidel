public class Game {
  Deck gameDeck;
  Hand whiteHand;
  Hand blackHand;
  String winner;
  String winningCombination;
  String[] handCombination;

  public Game(Deck myDeck) {
    this.gameDeck = myDeck;
    this.whiteHand = myDeck.pull();
    this.blackHand = myDeck.pull();
    this.handCombination = new String[] {"High Card", "Pair", "Two Pairs", "Three of a Kind", "Straight", "Flush", "Full House", "Four of a Kind", "Straight Flush"};
  }

  public String play() {
    this.whiteHand.setCardRank();
    this.blackHand.setCardRank();

    this.whiteHand.setHandRank();
    this.blackHand.setHandRank();



    if (this.whiteHand.handRank == 0 && this.blackHand.handRank == 0) {
      if (this.whiteHand.cardRank == this.blackHand.cardRank) {
        return "It's a tie.";
      }
      else if (this.whiteHand.cardRank > this.blackHand.cardRank) {
        return "White hand won with high card: " + gameDeck.value[whiteHand.cardRank];
      }
      return "Black hand won with high card: " + gameDeck.value[blackHand.cardRank];
    }


    return "hdagfdg";

  }
}