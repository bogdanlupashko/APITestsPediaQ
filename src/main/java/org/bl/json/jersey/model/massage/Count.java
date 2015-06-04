package org.bl.json.jersey.model.massage;

/**
 * Created by blupashko on 04.06.2015.
 */
public class Count {
    private boolean success;
    private int count;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
