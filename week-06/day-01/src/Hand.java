import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Hand extends Deck {
  int handRank;
  int cardRank;


  public Hand() {
    this.handRank = 0;
    this.cardRank = 0;

  }

  public void setCardRank() {
    for (int i = 0; i < this.size(); i++) {
      if (Arrays.asList(this.value).indexOf(this.get(i).substring(1)) > cardRank) {
        cardRank = Arrays.asList(this.value).indexOf(this.get(i).substring(1));
      }
    }
  }

  public Map setHandRank() {
    Map<String, Integer> hands;
    for (int i = 0; i < this.size(); i++) {
      if (hands.keySet().contains(this.get(i).substring(1))) {
        hands.put(this.get(i).substring(1), hands.get(this.get(i).substring(1) + 1));
      }
      hands.put(this.get(i).substring(1), 1);
    }
    handRank = 5;
    for (int j = 0; j < this.size(); j++) {
      if(this.get(0).substring(0, 1) != this.get(j).substring(0, 1)) {
        handRank = 0;
      }
    }
    return hands;
    }











}