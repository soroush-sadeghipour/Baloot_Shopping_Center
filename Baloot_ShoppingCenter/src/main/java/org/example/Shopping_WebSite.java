package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;

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
    public void get_Commodities_List(){
        List<String> commodities_properties = new ArrayList<>();
        for (int index_of_Commodity = 0; index_of_Commodity < Commodities.size(); index_of_Commodity++) {
            commodities_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_id()));
            commodities_properties.add(Commodities.get(index_of_Commodity).get_name());
            commodities_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_provider_id()));
            commodities_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_price()));
            commodities_properties.add(Commodities.get(index_of_Commodity).get_categories().get(0));
            commodities_properties.add(Commodities.get(index_of_Commodity).get_categories().get(1));
            commodities_properties.add(Float.toString(Commodities.get(index_of_Commodity).get_rating()));
            commodities_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_inStock()));
        }
        print_outputs("print all commodities", commodities_properties);
    }
    public void get_Commodity_by_id(int id){
        List<String> commodity_properties = new ArrayList<>();
        for (int index_of_Commodity = 0; index_of_Commodity < Commodities.size(); index_of_Commodity++)
            if (Commodities.get(index_of_Commodity).get_id() == id) {
                commodity_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_id()));
                commodity_properties.add(Commodities.get(index_of_Commodity).get_name());
                commodity_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_provider_id()));
                commodity_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_price()));
                commodity_properties.add(Commodities.get(index_of_Commodity).get_categories().get(0));
                commodity_properties.add(Commodities.get(index_of_Commodity).get_categories().get(1));
                commodity_properties.add(Float.toString(Commodities.get(index_of_Commodity).get_rating()));
                print_outputs("print single commodity", commodity_properties);
                return;
            }
        System.out.println("Commodity doesn't exists");
    }

    public void get_Commodity_by_category(List<String> category){
        List<String> commodities_properties = new ArrayList<>();
        for (int index_of_Commodity = 0; index_of_Commodity < Commodities.size(); index_of_Commodity++)
            if (Commodities.get(index_of_Commodity).get_categories() == category) {
                commodities_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_id()));
                commodities_properties.add(Commodities.get(index_of_Commodity).get_name());
                commodities_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_provider_id()));
                commodities_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_price()));
                commodities_properties.add(Commodities.get(index_of_Commodity).get_categories().get(0));
                commodities_properties.add(Commodities.get(index_of_Commodity).get_categories().get(1));
                commodities_properties.add(Float.toString(Commodities.get(index_of_Commodity).get_rating()));
                commodities_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_inStock()));
                print_outputs("print list of commodities", commodities_properties);
                return;
            }
    }
    public void get_Buy_List(String username){
        List<String> commodities_properties = new ArrayList<>();
        for (int index_of_User = 0; index_of_User < Users.size(); index_of_User++)
            if (Users.get(index_of_User).get_username().equals(username)) {
                List<Buy_List> User_Buy_List = Users.get(index_of_User).get_User_Buy_List();
                for (int index_of_Buy_List = 0; index_of_Buy_List < User_Buy_List.size(); index_of_Buy_List++)
                    for (int index_of_Commodity = 0; index_of_Commodity < Commodities.size(); index_of_Commodity++)
                        if (Commodities.get(index_of_Commodity).get_id() == User_Buy_List.get(index_of_Buy_List).Commodity) {
                            commodities_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_id()));
                            commodities_properties.add(Commodities.get(index_of_Commodity).get_name());
                            commodities_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_provider_id()));
                            commodities_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_price()));
                            commodities_properties.add(Commodities.get(index_of_Commodity).get_categories().get(0));
                            commodities_properties.add(Commodities.get(index_of_Commodity).get_categories().get(1));
                            commodities_properties.add(Float.toString(Commodities.get(index_of_Commodity).get_rating()));
                            commodities_properties.add(Integer.toString(Commodities.get(index_of_Commodity).get_inStock()));
                            break;
                        }
                print_outputs("print list of commodities", commodities_properties);
                return;
            }
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

    public void add_to_buy_list(String given_username, int given_commodity_id){
        for (int index_of_user = 0; index_of_user < Users.size(); index_of_user++)
            if (Users.get(index_of_user).get_username() == given_username) {
                for (int index_of_commodity = 0; index_of_commodity < Commodities.size(); index_of_commodity++)
                    if (Commodities.get(index_of_commodity).get_id() == given_commodity_id) {
                        if(Commodities.get(index_of_commodity).get_inStock() > 0){
                            Users.get(index_of_user).add_commodity_to_user_buy_list(given_commodity_id);;
                            return;
                        }
                        System.out.println("There is no Commodity available in stock");
                        return;
                    }
                System.out.println("Commodity doesn't exists");
                return;
            }
        System.out.println("User doesn't exists");
    }

    public void remove_from_buy_list(String given_username, int given_commodity_id){
        for (int index_of_user = 0; index_of_user < Users.size(); index_of_user++)
            if (Users.get(index_of_user).get_username() == given_username) {
                for (int index_of_commodity = 0; index_of_commodity < Commodities.size(); index_of_commodity++)
                    if (Commodities.get(index_of_commodity).get_id() == given_commodity_id) {
                        Users.get(index_of_user).remove_commodity_from_user_buy_list(given_commodity_id);
                        return;
                    }
                System.out.println("Commodity doesn't exists");
                return;
            }
        System.out.println("User doesn't exists");
    }
    public User convert_input_to_User(String console_input){
        try{
            ObjectMapper mapper = new ObjectMapper();
            User user = mapper.readValue(console_input, User.class);
            return user;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public void print_outputs(String print_type, List<String> outputs){
        if(print_type == "print single commodity"){
            System.out.println("data: {\"id\": " + outputs.get(0) +
                    ", \"name\": \"" + outputs.get(1) + '\"' +
                    ", \"provider\": " + outputs.get(2) +
                    ", \"price\": "+ outputs.get(3) +
                    ", \"categories\": [\"" + outputs.get(4) + "\", \"" + outputs.get(5) + "\"]" +
                    ", \"rating\": " + outputs.get(6) + '}');
        }
        if(print_type == "print all commodities"){
            System.out.print("\"data\": {\"commoditiesList\": [");
            for (int i = 0; i < outputs.size(); i += 8){
                System.out.print("{\"id\": " + outputs.get(i) +
                                 ", \"name\": \"" + outputs.get(i + 1) + '\"' +
                                 ", \"providerId\": " + outputs.get(i + 2) +
                                 ", \"price\": "+ outputs.get(i + 3) +
                                 ", \"categories\": [\"" + outputs.get(i + 4) + "\", \"" + outputs.get(i + 5) + "\"]" +
                                 ", \"rating\": " + outputs.get(i + 6) +
                                 ", \"inStock\": "+ outputs.get(i + 7) + '}');
            }
            System.out.println("]}");
        }
        if(print_type == "print list of commodities"){
            System.out.print("\"data\": {\"commoditiesList\": [");
            for (int i = 0; i < outputs.size(); i += 8){
                System.out.print("{\"id\": " + outputs.get(i) +
                        ", \"name\": \"" + outputs.get(i + 1) + '\"' +
                        ", \"providerId\": " + outputs.get(i + 2) +
                        ", \"price\": "+ outputs.get(i + 3) +
                        ", \"categories\": [\"" + outputs.get(i + 4) + "\", \"" + outputs.get(i + 5) + "\"]" +
                        ", \"rating\": " + outputs.get(i + 6) +
                        ", \"inStock\": "+ outputs.get(i + 7) + '}');
            }
            System.out.println("]}");
        }
    }
}