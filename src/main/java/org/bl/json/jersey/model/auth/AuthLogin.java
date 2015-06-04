package org.bl.json.jersey.model.auth;

/**
 * @author Bogdan Lupashko
 */

public class AuthLogin  {

    private String token;
    private Boolean success;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}