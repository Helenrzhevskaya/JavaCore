package homework4;

//Разбор кода

import java.util.ArrayList;
import java.util.HashMap;

public class Phone2 {
    private HashMap<String, ArrayList<String>> phone2 = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = phone2.getOrDefault(lastName, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        phone2.put(lastName, phonesForLastName);
    }

    public ArrayList<String> get(String lastName) {
        return phone2.get(lastName);
    }

    public static void main(String[] args) {
        Phone2 phone2 = new Phone2();
        phone2.add("Ivanov", "234234243");
        phone2.add("Ivanov1", "12345");
        phone2.add("Ivanov2", "25347254");
        phone2.add("Ivanov", "8888888");

        System.out.println(phone2.get("Ivanov"));
    }
}
