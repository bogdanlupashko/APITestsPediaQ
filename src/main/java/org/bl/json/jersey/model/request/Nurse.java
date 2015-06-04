package org.bl.json.jersey.model.request;

/**
 * Created by blupashko on 04.06.2015.
 */
public class Nurse {
    private int id;
    private String name;
    private int twilioName;
    private int rating;
    private String image;
    private String largeImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTwilioName() {
        return twilioName;
    }

    public void setTwilioName(int twilioName) {
        this.twilioName = twilioName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
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
