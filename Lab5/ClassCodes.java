package week5;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {
    public static void main(String[] args) {

        Map<Integer, String> classcode = new HashMap<>();


        classcode.put(2545, "Java");
        classcode.put(1425, "Datacom");
        classcode.put(2560, "Web");

        // print "ITEC 2560 Java"
        for (Integer classCodes : classcode.keySet()) {
            String className = classcode.get(classCodes);
            System.out.println("ITEC " + classcode + " " + className);
        }

        Map<String, Integer> fullnameclass = new HashMap<>();

        // print the nu ber of classes you are taking
        System.out.println("You have " + classcode.size()+ " classes");

        int searchCode = 2417;

        // if statement to check if the code is in the hashmap
        if (classcode.containsKey(searchCode)) {
            System.out.println(" This class is found in the Hashmap." + classcode.get(searchCode));
            //print not found if the code is not there
        } else {
            System.out.println(classcode.get(searchCode)+ " This class is not found in the Hashmap.");
        }

        int searchCode2 = 2545;

        // another if statement to see if the code is in the hashmap
        String classname = classcode.get(searchCode2);
        if (classname == null) {
            System.out.println(searchCode2+ " This class is not found in the Hashmap.");
        } else {
            System.out.println(searchCode2+ " This class is found in the Hashmap. Its name is " + classname);
        }

    }
}
