package inheritance;

public class Sponsor extends Person {

  String company;
  int hiredStudents;

  public Sponsor() {
    this("Jane Doe", 30, "female", "Google");
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public String introduce() {
    return "Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.";
  }

  public String getGoal() {
    return "My goal is: Hire brilliant junior software developers.";
  }

  public void hire() {
    this.hiredStudents ++;
  }
}