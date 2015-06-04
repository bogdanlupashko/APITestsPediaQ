package org.bl.json.jersey.model.request;


/**
 * Created by blupashko on 04.06.2015.
 */
public class RequestItem {
    private RequestSimple[] request;
    private Location location;
    private Nurse nurse;
    private Patient[] patients;

    public RequestSimple[] getRequest() {
        return request;
    }

    public void setRequest(RequestSimple[] request) {
        this.request = request;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }
}
