package Opgaver;

import java.util.Scanner;

public class Opgave3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's number (0 for Sunday, 1 for Monday...) :");
        int day = input.nextInt();

        System.out.println("Enter the number of days elapsed since today:");
        int elapsed = input.nextInt();

        int futureDay = (day + elapsed) % 7;

        String day_of_week = "";

        switch (day) {
            case 0: day_of_week = "Sunday"; break;
            case 1: day_of_week = "Monday"; break;
            case 2: day_of_week = "Tuesday"; break;
            case 3: day_of_week = "Wednesday"; break;
            case 4: day_of_week = "Thursday"; break;
            case 5: day_of_week = "Friday"; break;
            case 6: day_of_week = "Saturday";
        }

        switch (futureDay) {
            case 0: System.out.println("Today is " + day_of_week + " and the future day is Sunday."); break;
            case 1: System.out.println("Today is " + day_of_week + " and the future day is Monday."); break;
            case 2: System.out.println("Today is " + day_of_week + " and the future day is Tuesday."); break;
            case 3: System.out.println("Today is " + day_of_week + " and the future day is Wednesday."); break;
            case 4: System.out.println("Today is " + day_of_week + " and the future day is Thursday."); break;
            case 5: System.out.println("Today is " + day_of_week + " and the future day is Friday."); break;
            case 6: System.out.println("Today is " + day_of_week + " and the future day is Saturday.");
        }
}
}