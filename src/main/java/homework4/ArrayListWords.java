package homework4;

import java.util.*;

public class ArrayListWords {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>(100);
        stringArrayList.add("Питер");
        stringArrayList.add("Апельсин");
        stringArrayList.add("Булочка");
        stringArrayList.add("Кот");
        stringArrayList.add("Булочка");
        stringArrayList.add("Небо");
        stringArrayList.add("Кафе");
        stringArrayList.add("Питер");
        stringArrayList.add("Снег");
        stringArrayList.add("Погода");
        stringArrayList.add("Кот");
        stringArrayList.add("Шоколад");
        stringArrayList.add("Молоко");
        stringArrayList.add("Машина");
        stringArrayList.add("Яблоко");

        System.out.println(stringArrayList);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(stringArrayList);
        System.out.println(linkedHashSet);

        TreeSet<String> stringTreeSet = new TreeSet<>(stringArrayList);
        System.out.println(stringTreeSet);


    }
}
