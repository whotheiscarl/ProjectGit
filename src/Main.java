import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 1876.05; //bitte mit dieser Variable arbeiten

        out.println("Welcome to your local ATM.");
        out.println("Please select an option: " + "available:" + "\n" + "1 - Balance" + "\n" +
                "2 - Withdraw money" + "\n" + "3 - Deposit money" + "\n" + "4 - Get Balance in other currency" + "\n" +
                "5 - Get new card" + "\n" + "6 - Block card");

        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                // get balance
                break;
            case 2:
                // withdraw money
                break;
            case 3:
                // deposit money
                break;
            case 4:
                // get Balance on other Currency
                double exchangeJPY = 139.15; String JPY = "JPY";
                double exchangeUSD = 1.08; String USD = "USD";
                double exchangeGBP = 0.89; String GBP = "GBP";
                double exchangeAUD = 1.55; String AUD = "AUD";
                double exchangeCAD = 1.45; String CAD = "CAD";
                int currrencySelection;
                double newBalance = 0;

                out.print("Please select the currency you want to convert in: ");
                currrencySelection = scanner.nextInt();

                switch (currrencySelection) {

                    case 1:
                        newBalance = balance * exchangeAUD;
                        out.println("Your Balance in " + AUD + " is " + newBalance + " Australian Dollar.");
                        break;
                    case 2:
                        newBalance = balance * exchangeCAD;
                        out.println("Your Balance in " + CAD + " is " + newBalance + " Canadian Dollar.");
                        break;
                    case 3:
                        newBalance = balance * exchangeUSD;
                        out.println("Your Balance in " + USD + " is " + newBalance + " US Dollar.");
                        break;
                    case 4:
                        newBalance = balance * exchangeJPY;
                        out.println("Your Balance in " + JPY + " is " + newBalance + " japanese Yen.");
                        break;
                    case 5:
                        newBalance = balance * exchangeGBP;
                        out.println("Your Balance in " + GBP + " is " + newBalance + " UK Pounds.");
                        break;
                    default: {
                        out.println("Error: Unknown currency.");
                    }
                }

                break;
            case 5: // get new Card
                break;
            case 6: // Block card
                break;
            default: {
                out.println("Wrong data was entered");
            }

            out.println("");
            out.println("Thank you for your visit.");

            scanner.close();

        }

    }

}