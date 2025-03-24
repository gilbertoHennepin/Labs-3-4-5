package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;
import static week4.ToDoList.containsIgnoreCase;

public class GuestList {
    public static void main(String[] args) {

        List<String> guestsList = new ArrayList<>();    // empty list

        while (true) {
            String name = stringInput("Enter your guest name: "); // ask user for names
            if (name.length() == 0) {
                break;   //stop while loop
            }
            if (containsIgnoreCase(guestsList, name)) {        //avoid the same input
                System.out.println("You are already in the guest list");
            }else{
                System.out.println("Adding " + name + " to the guest list");
                guestsList.add(name);
            }
        }
        Collections.sort(guestsList);    // sort names alphabetically
        printGuestNames(guestsList);

        //remove guests from list if needed
        while (yesNoInput("Do you want to remove any guests?")) {
            System.out.println("Here are all the guests");
            printGuestNames(guestsList);

            // Stop the loop if there are no more guests to remove
            if (guestsList.isEmpty()) {
                System.out.println("There are no more guests to remove");
                break;
            }
            int index = positiveIntInput("Enter the number of the guest to remove");
            index--;   // the guests are printed in a 1-based list, so 1, 2, 3 for three guests. Subtract 1 to get 0-based index
            if (index < guestsList.size()) {   // verify index is in range to avoid crash
                String removedGuest = guestsList.remove(index);
                System.out.println("Removed guest " + removedGuest);
            } else {
                System.out.println("Error - please enter a valid number of a guest");
            }
        }
        printGuestNames(guestsList);

        System.out.println("The number of guests in the guest list is " + guestsList.size());

        selectPrizeWinner(guestsList);
    }



    public static void selectPrizeWinner(List<String> guests) {

        if (guests.isEmpty()) {
            System.out.println("Warning - no guests - no-one to win the prize");
            return;
        }

        Random rng = new Random();
        int randomGuestIndex = rng.nextInt(guests.size());  // 0, 1, 2, 3

        String prizeWinner = guests.get(randomGuestIndex);

        System.out.println("Guest number " + (randomGuestIndex + 1) + " "
                + prizeWinner + " wins a prize!");
    }


    public static void printGuestNames(List<String> guests) {

        System.out.println("Your guest list is: \n");

        if (guests.isEmpty()) {
            System.out.println("There are no guests in the list.");
        } else {
            for (int i = 0; i < guests.size(); i++) {
                System.out.println((i + 1) + ": " + guests.get(i));
            }
        }
    }

    public static boolean containsIgnoreCase(List<String> list, String data) {
        for (String item : list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }
}
