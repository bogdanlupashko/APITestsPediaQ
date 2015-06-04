package org.bl.json.jersey.model.payment;

/**
 * Created by blupashko on 04.06.2015.
 */
public class PaymentGet {
    private boolean success;
    private PaymentMetod[] paymentMethodList;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public PaymentMetod[] getPaymentMethodList() {
        return paymentMethodList;
    }

    public void setPaymentMethodList(PaymentMetod[] paymentMethodList) {
        this.paymentMethodList = paymentMethodList;
    }
}
