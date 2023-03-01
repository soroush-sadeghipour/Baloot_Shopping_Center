package org.example;
import java.util.*;
import java.util.regex.Pattern;

public class Commodity {
    private int id;
    private String name;
    private int provider_id;
    private int price;
    private List<String> categories;
    private float rating;
    private List<User_Rate> User_Rates = new ArrayList<>();
    private int inStock;

    public Commodity(int given_id, String given_name, int given_provider_id, int given_price, List<String> given_categories, float given_rating, int given_inStock){
        id = given_id;
        name = given_name;
        provider_id = given_provider_id;
        price = given_price;
        categories = given_categories;
        rating = given_rating;
        inStock = given_inStock;
    }

    public int get_id(){ return id; }
    public String get_name(){ return name; }
    public int get_provider_id(){ return provider_id; }
    public int get_price(){ return price; }
    public List<String> get_categories(){ return categories; }
    public float get_rating(){ return rating; }
    public int get_inStock(){ return inStock; }

    public void change_id(int new_id){ id = new_id; }

    public void change_name(String new_name){
        name = new_name;
    }

    public void change_provider_id(int new_provider_id){
        provider_id = new_provider_id;
    }

    public void change_price(int new_price){
        price = new_price;
    }

    public void change_categories(List<String> new_categories){
        categories = new_categories;
    }

    public void increase_inStock(int given_amount){
        inStock += given_amount;
    }

    public void decrease_inStock(int given_amount){
        inStock -= given_amount;
    }

    public void add_user_rate(String username, int user_rate){
        if(user_rate < 1 || user_rate > 10)
            System.out.println("Rate must be an Integer between 1 to 10");
        else {
            for (int index_of_User_Rate = 0; index_of_User_Rate < User_Rates.size(); index_of_User_Rate++)
                if (User_Rates.get(index_of_User_Rate).username.equals(username)) {
                    User_Rates.get(index_of_User_Rate).rate = user_rate;
                    rating = get_mean_of_user_rates();
                    return;
                }
            User_Rate New_User_Rate = new User_Rate(username, user_rate);
            User_Rates.add(New_User_Rate);
            rating = get_mean_of_user_rates();
        }
    }

    public float get_mean_of_user_rates(){
        float sum_of_user_rates = 0;
        for (int index_of_User_Rate = 0; index_of_User_Rate < User_Rates.size(); index_of_User_Rate++)
            sum_of_user_rates += User_Rates.get(index_of_User_Rate).rate;
        return sum_of_user_rates / User_Rates.size();
    }
}
