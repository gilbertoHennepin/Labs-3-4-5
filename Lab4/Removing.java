package week4;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server ");
        classNames.add("Info Technology");
        classNames.add("Java");


        System.out.println(classNames);

        boolean wasRemoved = classNames.remove("Lalalal");  //object
        System.out.println(classNames + " " + wasRemoved);

        classNames.remove("Info Technology");  // object
        System.out.println(classNames);

        classNames.remove(0); // int primitive type - index are primitive int type
        System.out.println(classNames);

        classNames.set(1, "REPLACING CLASS");
        System.out.println(classNames);


        String search = "C++ Programming Logic";
        if (classNames.contains(search)) {
            System.out.println("The list does contain " + search);
        }else{
            System.out.println("The list does not contain " + search);
        }

        System.out.println(classNames.size());

        classNames.clear();
    }
}
