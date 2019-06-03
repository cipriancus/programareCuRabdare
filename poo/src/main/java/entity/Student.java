package entity;

/**
 * Proprietatile definite pentru un student
 */
public class Student {

    private String name;
    private int age;
    private String city;
    private String preferences;

    public Student(String name, int age, String city, String preferences) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.preferences = preferences;
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

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

}
