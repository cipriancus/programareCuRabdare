package entity;

public class Course {

  private String courseName;
  private int hoursPerWeek;
  private String teacherName;

  public Course(String courseName, int hoursPerWeek, String teacherName) {
    this.courseName = courseName;
    this.hoursPerWeek = hoursPerWeek;
    this.teacherName = teacherName;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public int getHoursPerWeek() {
    return hoursPerWeek;
  }

  public void setHoursPerWeek(int hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
  }

  public String getTeacherName() {
    return teacherName;
  }

  public void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }
}
