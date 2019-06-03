package entity;

public class Preferences {

  private String profilePreferences;
  private String highSchoolName;

  public Preferences(String profilePreferences, String highSchoolName) {
    this.profilePreferences = profilePreferences;
    this.highSchoolName = highSchoolName;
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
