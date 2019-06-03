package encapsulation;

import abstraction.AbstractActivities;
import entity.Course;
import entity.Preferences;

/** Proprietatile definite pentru un elev */
public class Elev extends AbstractActivities {

  private String name;
  private int age;
  private String city;
  private Preferences preference;
  private Course course;

  public Elev(String name, int age, String city, Preferences preference, Course course) {
    this.name = name;
    this.age = age;
    this.city = city;
    this.preference = preference;
    this.course = course;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Preferences getPreferences() {
    return preference;
  }

  public void setPreferences(Preferences preference) {
    this.preference = preference;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  @Override
  public String toString() {
    return "My name is " + name + " and I am an Elev";
  }
}
