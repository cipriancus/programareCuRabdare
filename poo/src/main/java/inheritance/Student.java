package inheritance;

import encapsulation.Elev;
import entity.Course;
import entity.Preferences;

public class Student extends Elev {

  private String university;

  public Student(
      String name, int age, String city, Preferences preference, String university, Course course) {
    super(name, age, city, preference, course);
    this.university = university;
  }

  public String getUniversity() {
    return university;
  }

  public void setUniversity(String university) {
    this.university = university;
  }

  @Override
  /**
   * POLIMORFISM -- suprascriere -- de comentat sa vedem cum merge si fara el, cand intra pe ce este
   * in elev
   */
  public void doHomework(Course course) {
    System.out.println(
        "I am doing an overridden in student homework for " + course.getCourseName());
  }

  public void doHomework(Course course, String time) {
    System.out.println(
        "I am doing an overloaded in student homework for "
            + course.getCourseName()
            + " and i have to finish in "
            + time
            + " minutes");
  }

  @Override
  public String toString() {
    return "My name is " + getName() + " and I am a Student";
  }
}
