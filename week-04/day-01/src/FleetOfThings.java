import java.util.ArrayList;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing milk = new Thing("Get milk");
    fleet.add(milk);
    Thing obstacles = new Thing("Remove the obstacles");
    fleet.add(obstacles);
    Thing stand = new Thing("Stand up");
    stand.complete();
    fleet.add(stand);
    Thing lunch = new Thing("Eat lunch");
    lunch.complete();
    fleet.add(lunch);
    
    System.out.println(fleet);
  }
}

/**
 * Created by aze on 2017.03.29.
 */

class Fleet {
  private ArrayList<Thing> things;

  public Fleet() {
    things = new ArrayList<>();
  }

  public void add(Thing thing) {
    things.add(thing);
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < things.size(); i++) {
      result += (i+1) + ". " + things.get(i) + "\n";
    }
    return result;
  }
}

/**
 * Created by aze on 2017.03.29.
 */

class Thing {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}