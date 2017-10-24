package parkinglot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot extends ArrayList<Car> {

  public ParkingLot(int carNum) {
    for (int i = 0; i < carNum; i++) {
      this.add(new Car());
    }
  }

  public void countType() {
    Car tempCar = new Car();

    for (int i = 0; i < tempCar.carType.values().length; i++) {
      System.out.print(tempCar.carType.values()[i]);
      System.out.print(": ");
      int count = 0;
      for (int j = 0; j < this.size(); j++) {
        if (this.get(j).carType.equals(tempCar.carType.values()[i])) {
          count ++;
        }
      }
      System.out.println(count);
    }
  }

  public void countColor() {
    Car tempCar = new Car();

    for (int i = 0; i < tempCar.carColor.values().length; i++) {
      System.out.print(tempCar.carColor.values()[i]);
      System.out.print(": ");
      int count = 0;
      for (int j = 0; j < this.size(); j++) {
        if (this.get(j).carColor.equals(tempCar.carColor.values()[i])) {
          count ++;
        }
      }
      System.out.println(count);
    }
  }

  public void countSame() {
    Car tempCar = new Car();
    Map<Car, Integer> temp = new HashMap<>();

    for (int i = 0; i < this.size(); i++) {
      if (temp.containsKey(this.get(i))) {
        temp.replace(this.get(i), temp.get(this.get(i)).intValue() + 1);
      }
      else if (temp.containsKey(this.get(i))) {
      temp.put(this.get(i), 1);
      }
    }
    System.out.println(temp);
    System.out.print("Most frequent combination is: ");
    System.out.println(Collections.max(temp.values()));
  }
}
