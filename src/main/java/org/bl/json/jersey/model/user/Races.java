package org.bl.json.jersey.model.user;

import java.util.Map;

/**
 * Created by blupashko on 04.06.2015.
 */
public class Races {
    private boolean success;
    private Map<Integer, String> races;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<Integer, String> getRaces() {
        return races;
    }

    public void setRaces(Map<Integer, String> races) {
        this.races = races;
    }
}
