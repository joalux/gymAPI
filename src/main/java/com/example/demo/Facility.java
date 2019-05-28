package com.example.demo;

import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.util.List;

@RestController
public class Facility  {

    private Employees employees = new Employees();
    private Members members = new Members();


    private Gym newGym2 = new Gym("GoActiveGym", "vånö 403", "070 543 80 08", employees, members);



    @RequestMapping(value = "/gym", method = RequestMethod.GET)
    public Gym getGym(@RequestParam(value = "Search-string", defaultValue = "") String searchString) throws IOException {

        return newGym2;
    }


    @RequestMapping(value = "/gym", method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee emploe) {

        employees.addEmployee(emploe);

    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getEmployee(@RequestParam(value = "Search-string", defaultValue = "") String searchString){

        return employees.geEmployee(searchString);

    }

    @RequestMapping(value = "/employees/{ID}", method = RequestMethod.GET)
    public Employee getEmployeeName(@PathVariable("ID") Integer ID){
        Employee emp = employees.getEmployeeByID(ID);
        return emp;
    }

    /*@RequestMapping(value = "/employees", method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee emploe) {

        employees.addEmployee(emploe);
        newGym2.getEmployees();


    }*/


    @RequestMapping(value = "/employees/{ID}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable("ID") Integer ID) {

        employees.removeEmployee(ID);

    }

    @RequestMapping(value = "/members", method = RequestMethod.GET)
    public List<Member> getMember(@RequestParam(value = "Search-string", defaultValue = "") String searchString){

        return members.getMember(searchString);
    }

    @RequestMapping(value = "/members/{ID}", method = RequestMethod.GET)
    public Member getMemberName(@PathVariable("ID") Integer ID){
        Member memb = members.getMemberByID(ID);
        return memb;
    }

    @RequestMapping(value = "/members", method = RequestMethod.POST)
    public Member addMember(@RequestBody Member membo) {

        members.addMemeber(membo);
        //writer.addNewMember(membo);
        return membo;
    }


    @RequestMapping(value = "/members/{ID}", method = RequestMethod.DELETE)
    public void deleteMember(@PathVariable("ID") Integer ID) {

        members.removeMember(ID);

    }




}


