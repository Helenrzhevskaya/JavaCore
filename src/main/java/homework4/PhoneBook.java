package homework4;

//второй (мой) способ

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Иванова", 2324423);
        phoneBook.put("Петрова", 2325523);
        phoneBook.put("Иванова", 2326623);
        phoneBook.put("Васильевна", 2327723);
        phoneBook.put("Гречкина", 2328823);
        phoneBook.put("Петрушкина", 2323323);
        phoneBook.put("Сливочная",2329923);
        phoneBook.put("Петрова", 2321123);
        phoneBook.put("Самсонова", 2320023);
        phoneBook.put("Соловьева", 2323453);
        phoneBook.put("Сорокина", 2323000);


        System.out.println(phoneBook);


        for (Map.Entry<String, Integer> o : phoneBook.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        phoneBook.put("Васильевна", 2329900);
        System.out.println("Васильевна: " + phoneBook.get("Васильевна"));








    }
}
