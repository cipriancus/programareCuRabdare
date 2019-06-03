import entity.Course;
import entity.Preferences;
import encapsulation.Elev;
import inheritance.Student;
import service.StudentDatabase;

public class Main {
  public static void main(String[] args) {

    /** Creaza preferintele */
    Preferences preferences1 = new Preferences("Stiinte ale naturii", "Al. Ioan Cuza");
    Preferences preferences2 = new Preferences("Striinte ale naturii", "Al. Ioan Cuza");

    /** Creaza cursurile */
    Course javaCourse = new Course("Java", 30, "Frasinaru");
    Course matematica = new Course("Matematica", 30, "Ion");

    /** Crearea a 3 studenti */
    Elev elev1 = new Elev("Popescu Maricel", 17, "Bacau", preferences1, matematica);
    Elev elev2 = new Elev("Dorian", 16, "Botosani", preferences1, matematica);
    Elev elev3 = new Elev("Ion", 19, "Iasi", preferences2, matematica);

    /** Mostenirea */
    Student student =
        new Student(
            "Ciobanescu Constantin", 20, "Bacau", preferences1, "Al. Ioan Cuza", javaCourse);

    elev1.doHomework(elev1.getCourse());
    elev2.doHomework(elev1.getCourse());
    elev3.doHomework(elev1.getCourse());
    student.doHomework(student.getCourse());
    student.doHomework(student.getCourse(), "30");

    StudentDatabase studentDatabase = new StudentDatabase();

    studentDatabase.insert(elev1);
    studentDatabase.insert(elev2);
    studentDatabase.insert(elev3);
    studentDatabase.insert(student);

    System.out.println("---------------------------------------");
    studentDatabase.printAllStudents();
  }
}
