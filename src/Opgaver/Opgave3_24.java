package Opgaver;

public class Opgave3_24 {
    public static void main(String[] args) {

        // Generate a number between 1 and 13
        int number = (int) (Math.random() * 13 + 1);

        // Switch card number
        switch (number % 13) {
            case 1:
                System.out.println("The card you picked is Ace of");
                break;
            case 2:
                System.out.println("The card you picked is Two of");
                break;
            case 3:
                System.out.println("The card you picked is Three of");
                break;
            case 4:
                System.out.println("The card you picked is Four of");
                break;
            case 5:
                System.out.println("The card you picked is Five of");
                break;
            case 6:
                System.out.println("The card you picked is Six of");
                break;
            case 7:
                System.out.println("The card you picked is Seven of");
                break;
            case 8:
                System.out.println("The card you picked is Eight of");
                break;
            case 9:
                System.out.println("The card you picked is Nine of");
                break;
            case 10:
                System.out.println("The card you picked is Ten of");
                break;
            case 11:
                System.out.println("The card you picked is Jack of");
                break;
            case 12:
                System.out.println("The card you picked is Queen of");
                break;
            case 13:
                System.out.println("The card you picked is King of");
                break;
        }

            // Generate a number between 1 and 4
            int suit = (int) (Math.random() * 4 + 1);

            // Switch suit
            switch (suit % 4) {
                case 1:
                    System.out.println("Clubs");
                    break;
                case 2:
                    System.out.println("Diamonds");
                    break;
                case 3:
                    System.out.println("Hearts");
                    break;
                case 4:
                    System.out.println("Spades");
                    break;
            }
        }
    }
