package parkinglot;

import java.util.Collections;

public class Main {

  public static void main(String[] args) {
//
//    ParkingLot parkingLot = new ParkingLot(256);
//
//    parkingLot.countType();
//    parkingLot.countColor();
//    parkingLot.countSame();

    System.out.println((char)27 + "[34m" + "Hello Blue World" + (char)27 + "[0m");
    System.out.println((char)27 + "[31m" + "Hello Red World" + (char)27 + "[0m");

    int myBiggerRandom = (int) (((Math.random() * 50) + 100) -50);

    System.out.println(     (int) (((Math.random() * 50) + 100) -50));

    System.out.println((char)27);




  }
}

//  Create a Car class with 2 enum properties
//enum of car types
//    The types of these cars or vehicles is up to you
//enum of colors
//    Create 256 Vehicles randomly and put them into a List
//    Count and Print the number of same vehicles for each type
//    Count and Print the number of same vehicles for each color
//    Print the most frequently occurring vehicle