package abstraction;

import entity.Course;
import interfaces.Activities;

public class AbstractActivities implements Activities {

  public void doHomework(Course course) {
    System.out.println("I am doing a homework for " + course.getCourseName());
  }
}
