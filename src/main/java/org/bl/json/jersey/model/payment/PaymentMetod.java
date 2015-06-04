package org.bl.json.jersey.model.payment;

/**
 * Created by blupashko on 04.06.2015.
 */
public class PaymentMetod {
    private boolean isDefault;
    private String paymentToken;
    private PaymentMethodInfo paymentMethodInfo;

    public boolean isDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getPaymentToken() {
        return paymentToken;
    }

    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    public PaymentMethodInfo getPaymentMethodInfo() {
        return paymentMethodInfo;
    }

    public void setPaymentMethodInfo(PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
    }

    private static class PaymentMethodInfo{
        private String paymentTypeName;
        private String last4;
        private int type;
        private String imageUrl;

        public String getPaymentTypeName() {
            return paymentTypeName;
        }

        public void setPaymentTypeName(String paymentTypeName) {
            this.paymentTypeName = paymentTypeName;
        }

        public String getLast4() {
            return last4;
        }

        public void setLast4(String last4) {
            this.last4 = last4;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }

}
