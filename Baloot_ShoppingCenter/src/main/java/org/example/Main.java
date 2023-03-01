package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Shopping_WebSite site = new Shopping_WebSite();

        site.add_user("user1" , "1234", "user@gmail.com", "1977-09-15", "address1", 1500);
        site.add_user("user2" , "1234", "user@gmail.com", "1977-09-15", "address1", 1600);
        site.add_user("user3" , "1266", "user@gmail.com", "1977-09-15", "address1", 1700);

        site.add_provider(1 , "provider1", "2023-09-15");
        site.add_provider(2 , "provider2", "2023-10-15");
        site.add_provider(3 , "provider3", "2023-11-15");

        List<String> categories = new ArrayList<String>();
        categories.add("Technology");
        categories.add("phone");
        List<String> categories2 = new ArrayList<String>();
        categories2.add("Technology");
        categories2.add("TV");
        List<String> categories3 = new ArrayList<String>();
        categories2.add("Technology");
        categories2.add("Computer");

        site.add_commodity(1 , "Headphone", 1, 35000, categories, 8.8f, 50);
        site.add_commodity(2 , "mobile", 2, 35000, categories2, 8.8f, 50);
        site.add_commodity(3 , "laptop", 3, 35000, categories3, 8.8f, 50);

        Scanner console_scanner = new Scanner(System.in);
        String console_input = console_scanner.nextLine();

        if(console_input.contains("addUser")){

            String a = console_input.substring(8, console_input.length() -1 );
            System.out.println(console_input.substring(8, console_input.length() -1 ));
            User New_User = site.convert_input_to_User(a);
            site.add_user(New_User.get_username(), New_User.get_password(), New_User.get_email(), New_User.get_birthDate(), New_User.get_address(), New_User.get_credit());
            System.out.println(site.get_User(New_User.get_username()).get_credit());
        }

        User a = new User("user1" , "1234", "user@gmail.com", "1977-09-15", "address1", 1500);

        a.increase_credit((200));
        System.out.println(a.get_credit());
        Provider b = new Provider(1 , "provider1", "2023-09-15");
        b.change_id(5);
        System.out.println(b.get_credit());
        String phone = "Phone";
        List<String> categories = new ArrayList<String>();
        categories.add("Technology");
        categories.add("phone");
        Commodity c = new Commodity(1 , "Headphone", 3, 35000, categories, 8.8f, 50);
        List<String> new_categories = new ArrayList<String>();
        new_categories.add("Technology");
        new_categories.add("Laptop");
        c.change_categories(new_categories);
        System.out.println(c.get_categories());

        Shopping_WebSite site = new Shopping_WebSite();
        site.add_user("user1" , "1234", "user@gmail.com", "1977-09-15", "address1", 1500);
        site.add_user("user2" , "1234", "user@gmail.com", "1977-09-15", "address1", 1600);
        site.add_user("user3" , "1266", "user@gmail.com", "1977-09-15", "address1", 1700);
        site.add_user("user4" , "1266", "user@gmail.com", "1977-09-15", "address1", 1700);

        System.out.println(site.get_User("user1").get_password());
        System.out.println(site.get_User("user1").get_credit());
        site.add_provider(1 , "provider1", "2023-09-15");
        site.add_provider(2 , "provider2", "2023-10-15");
        site.add_provider(3 , "provider3", "2023-11-15");
        site.get_Provider(2).increase_credit(12);
        site.add_provider(2 , "provider2", "2023-11-15");
        System.out.println(site.get_Provider(2).get_registryDate());

        List<String> categories = new ArrayList<String>();
        categories.add("Technology");
        categories.add("phone");
        List<String> categories2 = new ArrayList<String>();
        categories2.add("Technology");
        categories2.add("TV");
        site.add_commodity(1 , "Headphone", 3, 35000, categories, 8.8f, 50);
        site.add_commodity(2 , "mobile", 3, 35000, categories2, 8.8f, 50);
        site.add_commodity(3 , "laptop", 5, 35000, categories, 8.8f, 50);
        site.get_Commodity(2).increase_inStock(12);
        System.out.println(site.get_Commodity(2).get_name());

        site.rate_commodity("user1", 2, 7);
        site.rate_commodity("user2", 2, 6);
        site.rate_commodity("user3", 2, 5);
        site.rate_commodity("user4", 2, 3);

        System.out.println(site.get_Commodity(2).get_rating());

        site.rate_commodity("user4", 2, 7);

        System.out.println(site.get_Commodity(2).get_rating());

        site.add_to_buy_list("user1", 2);
        site.add_to_buy_list("user2", 2);
        site.get_Commodity(2).decrease_inStock(5);
        site.add_to_buy_list("user2", 2);
        site.remove_from_buy_list("user3", 1);
        site.get_Commodity_by_id(2);
        site.get_Commodities_List();
        site.get_Commodity_by_category(categories);
        site.add_to_buy_list("user2", 2);
        site.get_Buy_List("user1");*/
    }
}