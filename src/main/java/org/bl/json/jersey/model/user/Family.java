package org.bl.json.jersey.model.user;

/**
 * Created by blupashko on 04.06.2015.
 */
public class Family {
    private boolean success;
    private FamilySimple family;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public FamilySimple getFamily() {
        return family;
    }

    public void setFamily(FamilySimple family) {
        this.family = family;
    }
}
