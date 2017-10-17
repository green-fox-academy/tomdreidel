public class Main {

  public static void main(String[] args) {

    Deck myDeck = new Deck();
    myDeck.generate();

    Game myGame = new Game(myDeck);
    System.out.println(myGame.whiteHand);
    System.out.println(myGame.blackHand);
    System.out.println(myGame.play());

  }
}