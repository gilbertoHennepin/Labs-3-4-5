package week5;

import java.util.HashMap;
import java.util.Map;

public class States {
    public static void main(String[] args) {

        Map<String, String> stateAbbreviations = new HashMap<>();
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Texas", "TX");
        stateAbbreviations.put("California", "CA");

        System.out.println(stateAbbreviations);

        System.out.println(stateAbbreviations.get("Minnesota"));
        System.out.println(stateAbbreviations.get("Iowa"));

        String texasAbbreviaton = stateAbbreviations.get("Texas");
        System.out.println(texasAbbreviaton);


        // how about looking up abbreviations for states ?

        for (String stateName : stateAbbreviations.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }
        // one way - loop over key-value pairs unitl value is found

        for (String abbreviation : stateAbbreviations.values()) { // not useful if you want to get key for the value ( cant relate value to key)
            System.out.println(abbreviation);
        }

        // one way - loop over key-value pairs until value is found

        String searchAbbreviation = "MI";

        for (String stateName : stateAbbreviations.keySet()) {
            System.out.println(stateName);
            String abbreviation = stateAbbreviations.get(stateName);
            if (abbreviation.equals(searchAbbreviation)) {
                System.out.println("Found it! The state for " + searchAbbreviation + "is " + stateName);
            }
        }
        Map<String, String> abbreviationsStateNames = new HashMap<>();

        for (Map.Entry<String, String> entry : stateAbbreviations.entrySet()) {
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationsStateNames.put(abbreviation, state);
        }

        System.out.println(stateAbbreviations);
        System.out.println(abbreviationsStateNames);
        // another way - create a new hashmap - each key becomes a value, each value becomes a key

        System.out.println("THere are " +  stateAbbreviations.size() + " states listed");
    }
}
