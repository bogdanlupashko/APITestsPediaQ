package org.bl.json.jersey.model.user;

import java.util.Map;

/**
 * Created by blupashko on 04.06.2015.
 */
public class Languages {
    private boolean success;
    private Map<Integer, String> languages;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<Integer, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<Integer, String> languages) {
        this.languages = languages;
    }
}
