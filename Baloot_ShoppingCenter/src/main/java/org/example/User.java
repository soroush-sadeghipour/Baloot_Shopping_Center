package org.example;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String email;
    private String birthDate;
    private String address;
    private int credit;

    private List<Buy_List> User_Buy_List = new ArrayList<>();

    public User(){
        super();
    }

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

    public List<Buy_List> get_User_Buy_List(){ return User_Buy_List; }

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

    public void add_commodity_to_user_buy_list(int Commodity_id){
        for (int index_of_User_Buy_List = 0; index_of_User_Buy_List < User_Buy_List.size(); index_of_User_Buy_List++)
            if (User_Buy_List.get(index_of_User_Buy_List).Commodity == Commodity_id) {
                System.out.println("Commodity is available in your buy list");
                return;
            }
        Buy_List New_Buy_List = new Buy_List(Commodity_id);
        User_Buy_List.add(New_Buy_List);
    }

    public void remove_commodity_from_user_buy_list(int Commodity_id){
        for (int index_of_User_Buy_List = 0; index_of_User_Buy_List < User_Buy_List.size(); index_of_User_Buy_List++)
            if (User_Buy_List.get(index_of_User_Buy_List).Commodity == Commodity_id) {
                User_Buy_List.remove(User_Buy_List.get(index_of_User_Buy_List));
                return;
            }
        System.out.println("Commodity isn't available in your buy list");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public int getCredit() {
        return credit;
    }
}

