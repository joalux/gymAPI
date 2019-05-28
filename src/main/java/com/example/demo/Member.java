package com.example.demo;

public class Member {
    private Integer ID;
    private String name;
    private String adress;
    private String phoneNumber;
    private Boolean isActive;

    public Member(Integer ID, String name, String adress, String phoneNumber, Boolean isActive) {
        this.ID = ID;
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
    }


    public Integer getID(){
        return ID;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }


    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Boolean getActive() {
        return isActive;
    }
}
