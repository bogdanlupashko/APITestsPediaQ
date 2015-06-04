package org.bl.json.jersey.model.parent;

/**
 * Created by blupashko on 04.06.2015.
 */
public class NearestNurses {
    private boolean success;
    private Nurse[] nurses;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Nurse[] getNurses() {
        return nurses;
    }

    public void setNurses(Nurse[] nurses) {
        this.nurses = nurses;
    }
}
