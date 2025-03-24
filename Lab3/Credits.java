package week3;

import static input.InputUtils.intInput;
import static input.InputUtils.positiveDoubleInput;

public class CREDITS {
    public static void main(String[] args) {
     int required = intInput("How many credits does your program require?");
     int earned = intInput("How many credits have you earned?");
     int needed = howManyCreditsToGraduate(required, earned);
     System.out.println("You need " + needed + " credits to graduate your program.");

    }

    public static int howManyCreditsToGraduate(int creditsNeeded, int creditsEarned) {
        int creditsToGraduate = creditsNeeded - creditsEarned;
        return creditsToGraduate;
    }
}

   // public static void main(String[] args) {

     //   double totalcredits = positiveDoubleInput("How many do you need to Graduate ");

       // double howmanycredits = positiveDoubleInput ("How many credits do you have");

        //System.out.println("You need " + (totalcredits - howmanycredits) + " to Graduate ");
    //}
//}
