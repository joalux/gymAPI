package com.example.demo;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class Gym {
    private String facilityName;
    private String facilityAdress;
    private String facilityPhoneNumber;
    private Members members;
    private Employees staff;

    public Gym (String name, String adress, String number, Employees empos, Members membos)  {
        this.facilityName = name;
        this.facilityAdress = adress;
        this.facilityPhoneNumber = number;
        this.staff = empos;
        this.members = membos;
        readFromFile();
        writeToFile();

    }


    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
        writeToFile();
    }
    public void setFacilityNAdress(String facilityAdress) {
        this.facilityAdress = facilityAdress;
        writeToFile();
    }
    public void setFacilityNumber(String facilityPhoneNumber) {
        this.facilityPhoneNumber = facilityPhoneNumber;
        writeToFile();
    }
    public String getFacilityName(){
        return facilityName;
    }
    public String getFacilityPhoneNumber() {
        return facilityPhoneNumber;
    }

    public String getFacilityAdress() {
        return facilityAdress;
    }

    public Employees getEmployees(){
        return staff;
    }
    public Members getMembers(){
        return members;
    }


    private void writeToFile()  {

        try {
            Writer writer = new OutputStreamWriter(new FileOutputStream(("gym.json")));

            Gson gson = new GsonBuilder().create();
            gson.toJson(this, writer);

            writer.close();

        } catch (IOException e) {}


    }
    private void readFromFile(){

        Gson gson = new Gson();

        try( Reader reader = new FileReader("gym.json")){

            Gym gym = gson.fromJson(reader, Gym.class);

            this.facilityName = gym.facilityName;
            this.facilityAdress = gym.facilityAdress;
            this.facilityPhoneNumber = gym.facilityPhoneNumber;
            this.members = gym.members;
            this.staff = gym.staff;

            System.out.print(gym);


        } catch (IOException e){
            e.printStackTrace();
        }

        }
    }


