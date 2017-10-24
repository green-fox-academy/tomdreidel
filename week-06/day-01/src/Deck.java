import java.util.ArrayList;
import java.util.Random;

public class Deck extends ArrayList<String> {
  String[] suit;
  String [] value;

  public Deck() {
    this.suit = new String[]{"C", "D", "H", "S"};
    this.value = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
  }

  public void generate() {
    for (int i = 0; i < this.suit.length; i++) {
      for (int j = 0; j < this.value.length; j++) {
        this.add(this.suit[i] + this.value[j]);
      }
    }
  }

  public Hand pull() {
    Hand myHand = new Hand();
    for (int i = 0; i < 5; i++) {
      Random generator = new Random();
      int pull = generator.nextInt(this.size());



      int myRandom = (int) Math.random();

      int myAnotherRandom = (int) (((Math.random() * 50) + 100) -50);

      System.out.println(     (int) (((Math.random() * 50) + 100) -50));





















      myHand.add(this.get(pull));
      this.remove(pull);
    }
    return myHand;
  }
}