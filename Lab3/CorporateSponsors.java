package week3;

import java.util.Arrays;

public class CorporateSponsors {
    public static void main(String[] args) {

//      modify array to make strings uppercase
        String[] sponsors = { "ikea", "at&t", "cvs", "3m"};

        for (int i = 0; i < sponsors.length; i++) {
//            System.out.println(sponsors[i]);
            String sponsor = sponsors[i];
            sponsor = sponsor.toUpperCase();
            sponsors[i] = sponsor;
//            shorter way of writing code above
//            sponsors[i] = sponsors[i],toUpperCase();
        }

        System.out.println(Arrays.toString(sponsors));
    }
}
