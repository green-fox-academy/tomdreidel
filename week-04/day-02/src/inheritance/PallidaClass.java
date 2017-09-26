package inheritance;

import java.util.ArrayList;

public class PallidaClass {

  String className;
  ArrayList<Student> students;
  ArrayList<Mentor> mentors;

  public PallidaClass(String className) {
    this.className = className;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public String info() {
    return "Pallida " + className + " class has " + students.size() + " students and " + mentors.size() + " mentors.";
  }
}