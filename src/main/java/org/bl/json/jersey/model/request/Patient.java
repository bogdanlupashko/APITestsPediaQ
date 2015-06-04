package org.bl.json.jersey.model.request;

/**
 * Created by blupashko on 04.06.2015.
 */
public class Patient {
    private int id;
    private String type;
    private String first_name;
    private String last_name;
    private String birthday;
    private String gender;
    private String ssn;
    private int race;
    private int[] language;
    private String image;
    private String largeImage;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getRace() {
        return race;
    }

    public void setRace(int race) {
        this.race = race;
    }

    public int[] getLanguage() {
        return language;
    }

    public void setLanguage(int[] language) {
        this.language = language;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }
}
