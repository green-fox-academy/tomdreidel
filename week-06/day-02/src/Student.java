public class Student implements Cloneable {
  String name;
  int age;
  String gender;

  String previousOrganization;
  int skippedDays;

  public Student() {
    this("Jane Doe", 30, "female", "The School of Life");
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
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

  public static void main(String[] args) throws CloneNotSupportedException {

    Student clare = new Student();
    System.out.println(clare.introduce());

    Student cloneClare = (Student) clare.clone();
    System.out.println(cloneClare.introduce());
  }
}