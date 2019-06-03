package entity;

public class Preferences extends Student {

    private String profilePreferences;
    private String highSchoolName;

    public Preferences(String profilePreferences, String highSchoolName, String name, int age, String city, String preferences) {
        super(name, age, city, preferences);
    }

    public String getProfilePreferences() {
        return profilePreferences;
    }

    public void setProfilePreferences(String profilePreferences) {
        this.profilePreferences = profilePreferences;
    }

    public String getHighSchoolName() {
        return highSchoolName;
    }

    public void setHighSchoolName(String highSchoolName) {
        this.highSchoolName = highSchoolName;
    }
}
