package com.example.demo;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Employees {

    private List<Employee> employees;
    private Employee employ;

    public Employees() {
        this.employees = new ArrayList<>();

        addStaff();




    }

    public int getStaffCount(){
        return employees.size();
    }

    public List<Employee> geEmployee(String search){
        if (search.equals(""))
            return employees;

        ArrayList<Employee> employList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().toLowerCase().equals(search.toLowerCase())) {
                employList.add(employee);

            }
        }
        return employList;

    }

    public Employee getEmployeeByID(int ID){
        for (int i= 0; i<employees.size(); i++){
            if (employees.get(i).getID() == ID){
                return employees.get(i);
            }
        }
        return null;
    }
    public void removeEmployee(int ID){
        for (int i= 0; i<employees.size(); i++){
            if (employees.get(i).getID().equals(ID)){
                employees.remove(i);

            }
        }

    }

    public void addEmployee(Employee emp){
        employees.add(emp);



    }
    public void removeEmployee(Employee emp){
        employees.remove(emp);

    }





    private void addStaff(){

        Employee emp1 = new Employee(1, "Tom", "vånö 304", "VD", 30000.0);
        Employee emp2 = new Employee(2, "Thomas", "Gustavsberg 22", "PT", 28000.0);
        Employee emp3 = new Employee(3, "Elsa", "Maja snis gata 33", "Receptionist", 30000.0);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
    }

}
