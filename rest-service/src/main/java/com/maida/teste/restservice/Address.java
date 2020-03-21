package com.maida.teste.restservice;

public class Address {

    private final String country;
    private final String state;
    private final String city;
    private final String district;
    private final String street;
    private final long number;
    private final long zip;

    public Address(String country, String state, String city, String district,
            String street, long number, long zip) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.district = district;
        this.street = street;
        this.number = number;
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

    public long getNumber() {
        return number;
    }

    public long getZip() {
        return zip;
    }
}
