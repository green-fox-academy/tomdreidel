package inheritance;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

//    Person mike = new Person("Mike", 543, "male");
//    System.out.println(mike.introduce());
//    System.out.println(mike.getGoal());
//
//    Student corry = new Student("Corry", 30, "female","IBM");
//    System.out.println(corry.introduce());
//    System.out.println(corry.getGoal());
//    corry.skipDays(1);
//    System.out.println(corry.introduce());
//
//    Student jane = new Student();
//    System.out.println(jane.introduce());
//
//    Mentor hilde = new Mentor();
//    Mentor bernard = new Mentor("Bernard", 107, "male", "senior");
//
//    System.out.println(hilde.introduce());
//    System.out.println(bernard.getGoal());
//
//    Sponsor google = new Sponsor();
//    Sponsor elon = new Sponsor("Elon", 42, "male", "Tesla");
//
//    System.out.println(google.introduce());
//    System.out.println(elon.introduce());
//
//    PallidaClass oracle = new PallidaClass("Oracle");
//    System.out.println(oracle.info());
//    oracle.addStudent(corry);
//    oracle.addStudent(jane);
//    oracle.addMentor(bernard);
//    System.out.println(oracle.info());

    ArrayList<Person> people = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    people.add(john);
    Student student = new Student();
    people.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    people.add(gandhi);
    Mentor mentor = new Mentor();
    people.add(mentor);
    Sponsor sponsor = new Sponsor();
    people.add(sponsor);
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
    people.add(elon);

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }
    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for(Person person : people) {
      System.out.println(person.introduce());
      System.out.println(person.getGoal());
    }

    PallidaClass badass = new PallidaClass("BADA55");
    badass.addStudent(student);
    badass.addStudent(john);
    badass.addMentor(mentor);
    badass.addMentor(gandhi);
    System.out.println(badass.info());
  }
}