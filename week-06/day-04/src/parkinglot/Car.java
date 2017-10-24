package parkinglot;

import java.util.Random;

public class Car {
  CarColor carColor;
  CarType carType;
  Random generator;

  public enum CarColor {
    WHITE,
    BLACK,
    VIOLET,
    BLUE,
    GREEN,
    YELLOW,
    ORANGE,
    RED
  }

  public enum CarType {
    AUDI,
    BMW,
    CITROEN,
    TESLA,
    RENAULT,
    TOYOTA,
    VOLKSWAGEN,
    VOLVO
  }

  public Car() {
    this.generator = new Random();
    this.carColor = CarColor.values()[generator.nextInt(CarColor.values().length)];
    this.carType = CarType.values()[generator.nextInt(CarType.values().length)];
  }

  @Override
  public String toString() {
    return carColor + " " + carType + "\n";
  }
}