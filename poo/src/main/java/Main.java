import entity.Preferences;
import entity.Student;

public class Main {
    public static void main(String[] args) {

        /**
         * Crearea a 3 studenti
         */
        Student student1 = new Student("Popescu Maricel", 17, "Bacau", null );
        Student student2 = new Student("Dorian", 16, "Botosani", null );
        Student student3 = new Student("Ion", 19, "Iasi", null );

        /**
         * Creaza preferintele cu studentii asignati
         */
        Preferences preferences1 = new Preferences("Striinte ale naturii", "Al. Ioan Cuza",
                "Popescu Maricel", 17, "Bacau", null);
        Preferences preferences2 = new Preferences("Striinte ale naturii", "Al. Ioan Cuza",
                "Popescu Maricel", 17, "Bacau", null);

    }
}