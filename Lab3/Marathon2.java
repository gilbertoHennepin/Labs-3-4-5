package week3;

public class Marathon2 {
    public static void main(String[] args) {

        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.10; // increase by 10%

        marathonSchedule(currentDistance, targetDistance, percentIncrease);
    }
        public static void marathonSchedule(double currentDistance, double targetDistance, double percentIncrease) {
            int week = 1;
//          loop until current distance is greater than the target
//        the loop will count the number of weeks
            while (currentDistance < targetDistance) {
                System.out.println(week + " " + currentDistance);
                currentDistance = currentDistance * percentIncrease; // increase by 10%
                week++; // count number of weeks
            }
//      need to print one more line - the distance that is greater
//        than the marathon distance
            System.out.println(week + " " + currentDistance);

        }
    }
