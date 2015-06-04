package org.bl.json.jersey.model.user;

/**
 * Created by blupashko on 04.06.2015.
 */
public class FamilySimple {
    private Child[] children;
    private String[] relatives;

    public Child[] getChildren() {
        return children;
    }

    public void setChildren(Child[] children) {
        this.children = children;
    }

    public String[] getRelatives() {
        return relatives;
    }

    public void setRelatives(String[] relatives) {
        this.relatives = relatives;
    }

}
