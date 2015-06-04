package org.bl.json.jersey.model.tariff;

/**
 * Created by blupashko on 04.06.2015.
 */
public class Tariff {
    private String name;
    private float price;
    private Field[] fields;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Field[] getFields() {
        return fields;
    }

    public void setFields(Field[] fields) {
        this.fields = fields;
    }

    private static class Field {
        private String field_name;
        private int type;
        private int price;
        private String service_description;

        public String getField_name() {
            return field_name;
        }

        public void setField_name(String field_name) {
            this.field_name = field_name;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getService_description() {
            return service_description;
        }

        public void setService_description(String service_description) {
            this.service_description = service_description;
        }
    }


}
