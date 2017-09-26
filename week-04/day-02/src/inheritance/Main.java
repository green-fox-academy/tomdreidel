package inheritance;

public class Main {

  public static void main(String[] args) {

    Person mike = new Person("Mike", 543, "male");
    System.out.println(mike.introduce());
    System.out.println(mike.getGoal());

    Student corry = new Student("Corry", 30, "female","IBM");
    System.out.println(corry.introduce());
    System.out.println(corry.getGoal());
    corry.skipDays(1);
    System.out.println(corry.introduce());

    Student jane = new Student();
    System.out.println(jane.introduce());
  }
}