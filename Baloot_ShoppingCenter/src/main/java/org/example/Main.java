package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User a = new User("user1" , "1234", "user@gmail.com", "1977-09-15", "address1", 1500);
        /*
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
        */
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
        site.add_commodity(1 , "Headphone", 3, 35000, categories, 8.8f, 50);
        site.add_commodity(2 , "mobile", 3, 35000, categories, 8.8f, 50);
        site.add_commodity(3 , "laptop", 5, 35000, categories, 8.8f, 50);
        site.get_Commodity(2).increase_inStock(12);
        System.out.println(site.get_Commodity(2).get_name());
        site.add_commodity(2 , "laptop", 3, 35000, categories, 8.8f, 50);

        site.rate_commodity("user1", 2, 7);
        site.rate_commodity("user2", 2, 6);
        site.rate_commodity("user3", 2, 5);
        site.rate_commodity("user4", 2, 3);

        System.out.println(site.get_Commodity(2).get_rating());

        site.rate_commodity("user4", 2, 7);

        System.out.println(site.get_Commodity(2).get_rating());
    }
}