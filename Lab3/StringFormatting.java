package week3;

import java.sql.SQLOutput;

public class StringFormatting {
    public static void main(String[] args) {


        String college = "MCTC";
        String className = "Java Programming";
        int classCode = 2545;
        int credits = 6;
        double averageGrade = 84.545345;
        boolean isOnline = true;

        System.out.println("This class is " + college + " " + className + ". It is taight at " + college + "" +
                ". It is : " + credits + " credits, the average grade is " + averageGrade + "%. It is online?" + isOnline + ".");


        System.out.printf("This class is %d %s. It is taight at %s. It is %d credits, the average " +
                        "grade is %f%%. Is it online? %s.\n", classCode, className, college, credits,averageGrade,isOnline);

        System.out.printf("The average grade is %.0f\n", averageGrade);
    }
}
