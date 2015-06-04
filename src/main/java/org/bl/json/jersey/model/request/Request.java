package org.bl.json.jersey.model.request;

/**
 * Created by blupashko on 04.06.2015.
 */
public class Request {
    private boolean success;
    private int totalCount;
    private RequestItem[] requests;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public RequestItem[] getRequests() {
        return requests;
    }

    public void setRequests(RequestItem[] requests) {
        this.requests = requests;
    }
}
