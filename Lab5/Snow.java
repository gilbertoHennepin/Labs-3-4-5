package week5;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static input.InputUtils.*;

public class Snow {
    public static void main(String[] args) {

        Map<String, Double> snowfall = new TreeMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        System.out.println(snowfall);

        double total = 0;
        for (double snow : snowfall.values()) {
            total += snow;
        }

        for (String month : snowfall.keySet()) {
            double snow = snowfall.get(month);
            System.out.println("The snow in " + month + " was " + snow + " inches");
            System.out.printf("The snow in %s was %.2f inches\n", month, snow);
        }

        snowfall.put("February", 12.4);

        System.out.println(snowfall);

        System.out.println("The snow in January is " + snowfall.get("January") + " inches");
        System.out.println("The snow in July is " + snowfall.get("July") + " inches");

        if (snowfall.containsKey("July")) {
            System.out.println("There was snow in July!");
        } else {
            System.out.println("There was snow in July!");
        }

        System.out.println("\n" + snowfall);


        String newMonth = stringInput("Enter name of month");
        double newSnow = positiveDoubleInput("Enter amount of snow for " + newMonth);

        snowfall.put(newMonth,newSnow);

        System.out.println(snowfall);

        if(snowfall.containsKey(newMonth)) {
        // ask if overwrite
            double snow = snowfall.get(newMonth);
            System.out.println("The hashmap already containt that month " + newMonth + " snow =v " + snow + " Inches");
            boolean overwrite = yesNoInput("Overwrite data?");
            if (overwrite) {
                snowfall.put(newMonth, newSnow);
            } else {
                System.out.println("Data was not added");
            }
        } else {
            snowfall.put(newMonth, newSnow);
        }
        System.out.println(snowfall);


    }
}
