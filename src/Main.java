import java.util.*;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 1876.05; //bitte mit dieser variable arbeiten

        out.println("Welcome to your local Bankomat.");
        out.println("Please select an option: " + "available:" + "\n" + "1 - Balance" + "\n" +
                "2 - Withdraw money" + "\n" + "3 - Deposit money" + "\n" + "4 - Get Balance in other currency" + "\n" +
                "5 - Get new card" + "\n" + "6 - Block card");

        int auswahl = scanner.nextInt();

        switch (auswahl) {
            case 1:
                // get balance
                break;
            case 2:
                double result;
                if (balance > 0) {
                    out.println("You are in the withdrawal option " + "\n" + "How much money do you want to withdraw?");
                    double betrag = scanner.nextDouble();
                    result = balance - betrag;
                    balance = result;
                    out.println("Okay. Transaction has been proceeded" + "\n" + "Your new balance is " + result + "\n" + "Have a nice day!");
                } else {
                    throw new RuntimeException("Your balance is 0 or lower. Please select another option or contact your bank");

                }
                break;
            case 3:
                // deposit money
                break;
            case 4:
                // get Balance on other Currency
                break;
            case 5: // get new Card

                out.println("Please select an option for your new card - " + "available:" + "\n" + "1 - Visa Card" + "\n" +
                        "2 - MasterCard" + "\n" + "3 - American Express" + "\n" + "4 - Girocard");
                int cardNo = scanner.nextInt();
                if (cardNo == 1) {
                    out.println("You would like to get a Visa Card? " + "\n" + "Okay " + "\n" + "You will get a letter to activate your card within the next days - please follow the next described steps, thank you!");
                    break;
                }
                if (cardNo == 2) {
                    out.println("You would like to get a MasterCard? " + "\n" + "Okay " + "\n" + "You will get a letter to activate your card within the next days - please follow the next described steps, thank you!");
                    break;
                }
                if (cardNo == 3) {
                    out.println("You would like to get an American Express? " + "\n" + "Okay " + "\n" + "You will get a letter to activate your card within the next days - please follow the next described steps, thank you!");
                    break;
                }
                if (cardNo == 4) {
                    out.println("You would like to get a Girocard? " + "\n" + "Okay " + "\n" + "You will get a letter to activate your card within the next days - please follow the next described steps, thank you!");
                    break;
                } else {
                    throw new RuntimeException("Wrong data was entered. Please get another try. Thank you!");

                }


            case 6: // Block card
                break;
            default: {
                System.out.println("Wrong data was entered. Please try another time.");
            }

        }

    }


}