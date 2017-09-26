package inheritance;

public class Student extends Person {

  String previousOrganization;
  int skippedDays;

  public Student() {
    this("Jane Doe", 30, "female", "The School of Life");
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public String introduce() {
    return "Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.";
  }

  public String getGoal() {
    return "My goal is: Be a junior software developer.";
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }
}