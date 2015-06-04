package org.bl.json.jersey.model.user;

import org.bl.json.jersey.model.request.Location;

/**
 * Created by blupashko on 04.06.2015.
 */
public class Profile {
    private boolean success;
    private String first_name;
    private String last_name;
    private String birthday;
    private int[] language;
    private String ssn;
    private String race;
    private String promocode;
    private Location[] address;
    private String parentalRole;
    private int twilioName;
    private String email;
    private String phone;
    private String gender;
    private String image;
    private String invitedBy;
    private String priority;
    private int status;
    private int rating;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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

    public int[] getLanguage() {
        return language;
    }

    public void setLanguage(int[] language) {
        this.language = language;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPromocode() {
        return promocode;
    }

    public void setPromocode(String promocode) {
        this.promocode = promocode;
    }

    public Location[] getAddress() {
        return address;
    }

    public void setAddress(Location[] address) {
        this.address = address;
    }

    public String getParentalRole() {
        return parentalRole;
    }

    public void setParentalRole(String parentalRole) {
        this.parentalRole = parentalRole;
    }

    public int getTwilioName() {
        return twilioName;
    }

    public void setTwilioName(int twilioName) {
        this.twilioName = twilioName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInvitedBy() {
        return invitedBy;
    }

    public void setInvitedBy(String invitedBy) {
        this.invitedBy = invitedBy;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
