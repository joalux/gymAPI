package com.example.demo;

import java.io.IOException;
import java.io.*;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import netscape.javascript.JSObject;


public class writeToFile  {

    String gymFile = "gym.txt";
    String staffFile = "staff.txt";
    String memberFile = "members.txt";

    Gson gson = new Gson();


    public writeToFile(Gym gym, Employees emps, Members membs) throws IOException {


        String stringToSave = gson.toJson(emps.getEmployeeByID(1));


    }

    /*public void saveStaff(Employees empos) throws IOException {
        Writer writer = new OutputStreamWriter(new FileOutputStream(("staff145523.json")));
        for(int i = 1; i < empos.getStaffCount(); i++ ){
           Employee emp = empos.getEmployeeByID(i);
           gson.toJson(emp, writer);

        }

    }*/
/*
        try {
            PrintWriter outputStream = new PrintWriter(gymFile);

            outputStream.println(gym.getFacilityName());
            outputStream.println(gym.getFacilityAdress());
            outputStream.println(gym.getFacilityPhoneNumber());
            outputStream.println();


            outputStream.close();
            PrintWriter outputStream2 = new PrintWriter(staffFile);

            outputStream2.println("Personal");
            for (int i = 1; i <= countStaff; i++) {
                outputStream2.println(emps.getEmployeeByID(i));
                outputStream2.println(emps.getEmployeeByID(i).getID());
                outputStream2.println(emps.getEmployeeByID(i).getName());
                outputStream2.println(emps.getEmployeeByID(i).getAdress());
                outputStream2.println(emps.getEmployeeByID(i).getPosition());
                outputStream2.println(emps.getEmployeeByID(i).getSalary());
            }
            outputStream2.println();
            outputStream2.close();

            PrintWriter outputStream3 = new PrintWriter(memberFile);

            outputStream3.println("Medlemmar");
            for (int i = 1; i <= countMembers; i++) {
                outputStream3.println(membs.getMemberByID(i).getID());
                outputStream3.println(membs.getMemberByID(i).getName());
                outputStream3.println(membs.getMemberByID(i).getAdress());
                outputStream3.println(membs.getMemberByID(i).getPhoneNumber());
                outputStream3.println(membs.getMemberByID(i).getActive());

            }

            outputStream3.close();
            System.out.println("Done!");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
    public void addNewMember(Member membo){
        try{

            PrintWriter outputStream = new PrintWriter(memberFile);
            outputStream.println(membo.getID());
            outputStream.println(membo.getName());
            outputStream.println(membo.getAdress());
            outputStream.println(membo.getPhoneNumber());
            outputStream.println(membo.getActive());

        outputStream.close();
    }
    catch (FileNotFoundException e){
        e.printStackTrace();}
    }
    public void addStaffMember(Employee emp){
        try{

            PrintWriter outputStream = new PrintWriter(staffFile);
            outputStream.println(emp.getID());
            outputStream.println(emp.getName());
            outputStream.println(emp.getAdress());
            outputStream.println(emp.getPosition());
            outputStream.println(emp.getSalary());

            outputStream.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();}
    */
    }


