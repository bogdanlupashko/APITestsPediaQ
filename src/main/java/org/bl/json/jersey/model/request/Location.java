package org.bl.json.jersey.model.request;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by blupashko on 04.06.2015.
 */
public class Location {
    private int id;
    private int userId;
    private String country;
    private String stateCode;
    private String city;
    private String street;
    private String street_number;
    private String apt_suite;
    private int zip;
    @JsonProperty(value = "default")
    private String defaultValue;
    private String latitude;
    private String longitude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet_number() {
        return street_number;
    }

    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }

    public String getApt_suite() {
        return apt_suite;
    }

    public void setApt_suite(String apt_suite) {
        this.apt_suite = apt_suite;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
