package org.example;
import java.util.*;
import java.util.regex.Pattern;

public class Shopping_WebSite {
    private List<User> Users = new ArrayList<>();
    private List<Provider> Providers = new ArrayList<>();
    private List<Commodity> Commodities = new ArrayList<>();

    public Shopping_WebSite(){}

    public User get_User(String username){
        for (int index_of_User = 0; index_of_User < Users.size(); index_of_User++)
            if (Users.get(index_of_User).get_username().equals(username))
                return Users.get(index_of_User);
        return null;
    }

    public Provider get_Provider(int id){
        for (int index_of_Provider = 0; index_of_Provider < Providers.size(); index_of_Provider++)
            if (Providers.get(index_of_Provider).get_id() == id)
                return Providers.get(index_of_Provider);
        return null;
    }

    public Commodity get_Commodity(int id){
        for (int index_of_Commodity = 0; index_of_Commodity < Commodities.size(); index_of_Commodity++)
            if (Commodities.get(index_of_Commodity).get_id() == id)
                return Commodities.get(index_of_Commodity);
        return null;
    }
    public void add_user(String given_username, String given_password, String given_email, String given_birthDate, String given_address, int given_credit){
        Pattern name_pattern = Pattern.compile("^[A-Za-z0-9]++$");
        if(!name_pattern.matcher(given_username).matches())
            System.out.println("Invalid username");
        else {
            for (int index_of_User = 0; index_of_User < Users.size(); index_of_User++)
                if (Users.get(index_of_User).get_username().equals(given_username)) {
                    User updated_user = new User(given_username, given_password, given_email, given_birthDate, given_address, given_credit);
                    Users.set(index_of_User, updated_user);
                    return;
                }
            User New_User = new User(given_username, given_password, given_email, given_birthDate, given_address, given_credit);
            Users.add(New_User);
        }
    }

    public void add_provider(int given_id, String given_name, String given_registryDate){
        Pattern name_pattern = Pattern.compile("^[A-Za-z0-9]++$");
        if(!name_pattern.matcher(given_name).matches())
            System.out.println("Invalid username");
        else {
            for (int index_of_provider = 0; index_of_provider < Providers.size(); index_of_provider++)
                if (Providers.get(index_of_provider).get_id() == given_id) {
                    Provider updated_provider = new Provider(given_id, given_name, given_registryDate);
                    Providers.set(index_of_provider, updated_provider);
                    return;
                }
            Provider New_Provider = new Provider(given_id, given_name, given_registryDate);
            Providers.add(New_Provider);
        }
    }

    public void add_commodity(int given_id, String given_name, int given_provider_id, int given_price, List<String> given_categories, float given_rating, int given_inStock){
        for (int index_of_provider = 0; index_of_provider < Providers.size(); index_of_provider++)
            if (Providers.get(index_of_provider).get_id() == given_provider_id) {
                for (int index_of_commodity = 0; index_of_commodity < Commodities.size(); index_of_commodity++)
                    if (Commodities.get(index_of_commodity).get_id() == given_id) {
                        Commodity updated_commodity = new Commodity(given_id, given_name, given_provider_id, given_price, given_categories, given_rating, given_inStock);
                        Commodities.set(index_of_commodity, updated_commodity);
                    }
                Commodity New_Commodity = new Commodity(given_id, given_name, given_provider_id, given_price, given_categories, given_rating, given_inStock);
                Commodities.add(New_Commodity);
                return;
            }
        System.out.println("Provider doesn't exists");
    }

    public void rate_commodity(String given_username, int given_commodity_id, int given_rate){
        for (int index_of_user = 0; index_of_user < Users.size(); index_of_user++)
            if (Users.get(index_of_user).get_username() == given_username) {
                for (int index_of_commodity = 0; index_of_commodity < Commodities.size(); index_of_commodity++)
                    if (Commodities.get(index_of_commodity).get_id() == given_commodity_id) {
                        Commodities.get(index_of_commodity).add_user_rate(given_username, given_rate);
                        return;
                    }
                System.out.println("Commodity doesn't exists");
                return;
            }
        System.out.println("User doesn't exists");
    }

}