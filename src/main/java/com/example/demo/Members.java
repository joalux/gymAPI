package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Members {

    private List<Member> members;


    public Members(){
        this.members = new ArrayList<>();
        addMemebers();


    }

    public int getMemberCount(){
        return members.size();
    }

    public List<Member> getMember(String search){
        if (search.equals(""))
            return members;

        ArrayList<Member> memberList = new ArrayList<>();
        for (Member membo : members){
            if(membo.getName().toLowerCase().contains(search.toLowerCase()))
                memberList.add(membo);
        }
        return memberList;

    }
    public Member getMemberByID(int ID){
        for (int i= 0; i<members.size(); i++){
            if (members.get(i).getID() == ID){
                return members.get(i);
            }
        }
        return null;
    }
    public void removeMember(int ID){
        for (int i= 0; i<members.size(); i++){
            if (members.get(i).getID().equals(ID)){
                members.remove(i);

            }
        }
    }


    public void addMemeber(Member memb){
        members.add(memb);



    }





    public void removeMember(Member memb){
        members.remove(memb);
    }

    private void addMemebers(){

        Member memb1 = new Member(1, "Johanna Borg", "Söderby 22","070 447 26 36", true);
        Member memb2 = new Member(2, "Cecilia Lundberg Borg", "Stavsnäs 22","070 737 12 11", true);
        Member memb3 = new Member(3, "Åsa Forslund", "Vånö 204","073 117 56 36", false);

        members.add(memb1);
        members.add(memb2);
        members.add(memb3);

    }
}
