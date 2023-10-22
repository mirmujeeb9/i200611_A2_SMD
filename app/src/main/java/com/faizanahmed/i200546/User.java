package com.faizanahmed.i200546;

public class User {
    private String name, email, password, contactNumber, country, city;

    //Constructor
    public User(String name, String email, String password, String contactNumber, String country, String city) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.contactNumber = contactNumber;
        this.country = country;
        this.city = city;
    }

    //Getters Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}

