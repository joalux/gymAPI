package com.example.demo;

public class Employee {
    private Integer ID;
    private String name;
    private String adress;
    private String position;
    private Double salary;

    public Employee(){
    }

    public Employee(Integer ID, String name, String adress, String position, Double salary) {
        this.ID = ID;
        this.name = name;
        this.adress = adress;
        this.position = position;
        this.salary = salary;
    }

    public Integer getID(){
        return ID;
    }
    public String getAdress() {
        return adress;
    }
    public String getPosition() {
        return position;
    }
    public Double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }
}
