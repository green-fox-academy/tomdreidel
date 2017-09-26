package inheritance;

public class Person {

  String name;
  int age;
  String gender;

  public Person() {

  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String introduce() {
    return "Hi, I'm " + name + ", a " + age + " year old " + gender + ".";
  }

  public String getGoal() {
    return "My goal is: Live for the moment!";
  }
}