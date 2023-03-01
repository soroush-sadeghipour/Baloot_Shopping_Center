package org.example;

public class User {
    private String username;
    private String password;
    private String email;
    private String birthDate;
    private String address;
    private int credit;

    public User(String given_username, String given_password, String given_email, String given_birthDate, String given_address, int given_credit){
        username = given_username;
        password = given_password;
        email = given_email;
        birthDate = given_birthDate;
        address = given_address;
        credit = given_credit;
    }

    public String get_username(){ return username; }
    public String get_password(){ return password; }
    public String get_email(){ return email; }
    public String get_birthDate(){ return birthDate; }
    public String get_address(){ return address; }
    public int get_credit(){ return credit; }

    public void change_username(String new_username){
        username = new_username;
    }

    public void change_password(String new_password){
        password = new_password;
    }

    public void change_email(String new_email){
        email = new_email;
    }

    public void change_birthDate(String new_birthDate){
        birthDate = new_birthDate;
    }

    public void change_address(String new_address){
        address = new_address;
    }

    public void increase_credit(int given_amount){
        credit += given_amount;
    }

    public void decrease_credit(int given_amount){
        credit -= given_amount;
    }
}
