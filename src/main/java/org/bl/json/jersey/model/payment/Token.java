package org.bl.json.jersey.model.payment;

/**
 * Created by blupashko on 04.06.2015.
 */
public class Token {
    private boolean success;
    private String paymentToken;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getPaymentToken() {
        return paymentToken;
    }

    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }
}
