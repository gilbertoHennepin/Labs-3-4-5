package week3;

import static input.InputUtils.intInput;

public class Count {
    public static void main(String[] args) {

        int smallNumber = intInput("Enter a small number");
        int largeNUmber = intInput("Enter a large number");

        System.out.println("I will count from " + smallNumber + " to " + largeNUmber);

        count(smallNumber, largeNUmber);
    }
//  methods that don't return anything - return type is void
    public static void count(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }

    }
}
