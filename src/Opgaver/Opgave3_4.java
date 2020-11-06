package Opgaver;

public class Opgave3_4 {
        public static void main(String[] args) {

            // Generate a number between 1 and 20
            int number1 = (int)(Math.random() * 13 + 1);

             // Hvis nummeret er en måned
            switch (number1 % 12) {
                case 1: System.out.println("1. month: January"); break;
                case 2: System.out.println("2. month: February"); break;
                case 3: System.out.println("3. month: March"); break;
                case 4: System.out.println("4. month: April"); break;
                case 5: System.out.println("5. month: May"); break;
                case 6: System.out.println("6. month: June"); break;
                case 7: System.out.println("7. month: July"); break;
                case 8: System.out.println("8. month: August"); break;
                case 9: System.out.println("9. month: September"); break;
                case 10: System.out.println("10. month: October"); break;
                case 11: System.out.println("11. month: November"); break;
                case 12: System.out.println("12. month: December"); break;

            }
        }
}