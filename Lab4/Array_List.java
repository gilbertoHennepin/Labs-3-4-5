package week4;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Gilberto");



        for (String s: arrayList) {
            System.out.println(s);
            System.out.println(s.toUpperCase()); // uppercase
        }

        System.out.println(arrayList);   // for class brackets
        System.out.println(arrayList.toArray().length); //length
    }
}
