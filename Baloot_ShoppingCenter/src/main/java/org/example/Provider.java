package org.example;

public class Provider {
    private int id;
    private String name;
    private String registryDate;
    private int credit;

    public Provider(int given_id, String given_name, String given_registryDate){
        id = given_id;
        name = given_name;
        registryDate = given_registryDate;
        credit = 0;
    }
    public int get_id(){ return id; }
    public String get_name(){ return name; }
    public String get_registryDate(){ return registryDate; }
    public int get_credit(){ return credit; }

    public void change_id(int new_id){
        id = new_id;
    }

    public void change_name(String new_name){
        name = new_name;
    }

    public void increase_credit(int given_amount){
        credit += given_amount;
    }
}
