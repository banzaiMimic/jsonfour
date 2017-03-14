package com.devstackio.parsers.jsonfour.university;

/**
 *
 * @author devstack
 */
public class University {
    
    private String id;
    private String name;
    private String city;
    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public void print() {
        System.out.println("[University] print : [ id ] : " + this.id + " [ name ] : " + this.name + " [ city ] : " + this.city + " [ state ] : " + this.state);
    }
    
}
