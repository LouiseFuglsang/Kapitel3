package Opgaver;

import java.util.Scanner;

public class Opgave3_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your guess (0 for heads or 1 for tails)");
        int Coinside = input.nextInt();

        // Generate a number between 1 and 2
        int number=(int)(Math.random()*2);

     if (number == Coinside) System.out.println("You guessed correct");
     else System.out.println("You didn´t guessed right");

    }
}