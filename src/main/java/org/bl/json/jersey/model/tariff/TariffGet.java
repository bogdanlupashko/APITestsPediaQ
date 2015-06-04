package org.bl.json.jersey.model.tariff;

/**
 * Created by blupashko on 04.06.2015.
 */
public class TariffGet {
    private boolean success;
    private Tariff tariff;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }
}
