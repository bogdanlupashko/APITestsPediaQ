package org.bl.json.jersey.model.user;

/**
 * Created by blupashko on 04.06.2015.
 */
public class Status {

    private boolean success;
    private int status;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
