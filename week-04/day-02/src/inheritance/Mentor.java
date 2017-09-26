package inheritance;

public class Mentor extends Person {

  String level;

  public Mentor() {
    this("Jane Doe", 30, "female", "intermediate");
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public String introduce() {
    return "Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.";
  }

  public String getGoal() {
    return "My goal is: Educate brilliant junior software developers.";
  }
}