package org.bl.json.jersey.model.request;

import java.util.Date;

/**
 * Created by blupashko on 04.06.2015.
 */
public class RequestSimple {
    private int id;
    private Date date;
    private int price;
    private VisitSummary[] visitSummaries;

    private static class VisitSummary {
        private int type;
        private int count;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public VisitSummary[] getVisitSummaries() {
        return visitSummaries;
    }

    public void setVisitSummaries(VisitSummary[] visitSummaries) {
        this.visitSummaries = visitSummaries;
    }
}
