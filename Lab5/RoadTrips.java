package week5;

import week2.WhileTrue;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.stringInput;

public class RoadTrips {
    public static void main(String[] args) {

        Map<Integer, String> RoadTrip = new HashMap<>();
        RoadTrip.put(154, "Duluth");
        RoadTrip.put(127, "Brainerd");
        RoadTrip.put(26, "Stillwater");
        RoadTrip.put(245, "Ely");
        RoadTrip.put(54, "Red Wing");

        int miles = positiveIntInput("How many miles are you willing to travel");


        System.out.println("These are the places you can go:");
        for (Map.Entry<Integer, String> entry : RoadTrip.entrySet()) { // loops through hashmap
            if (entry.getKey() <= miles) { // retrieves miles from hashmap adn checks if its within range of input
                System.out.println(entry.getValue() + " (" + entry.getKey() + " miles)");
            }
        }
        if (RoadTrip.isEmpty()) {
            System.out.println("There are no miles you can travel");
        }
    }
}
