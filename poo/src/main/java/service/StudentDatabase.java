package service;

import encapsulation.Elev;
import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
  private List<Elev> allStudents;

  public StudentDatabase() {
    allStudents = new ArrayList<Elev>();
  }

  public boolean insert(Elev elev) {
    if (elev != null) {
      allStudents.add(elev);
      return true;
    }
    return false;
  }

  public void printAllStudents(){
    for(Elev iterator:allStudents){
      System.out.println(iterator);
    }
  }
}
