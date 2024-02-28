package com.cicd.githubjenkins.models;

public class Address {

    private String city;
    private String state;
    private int pinCode;

    public Address(String city, String state, int pinCode) {
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
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

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

        public String toString() {
        return "City: " + city +
            "\nState: " + state +
            "\nPin code: " + pinCode + "\n";
    }
}
