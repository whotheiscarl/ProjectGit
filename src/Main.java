import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 1876.05; //bitte mit dieser variable arbeiten

        out.println("Welcome to your local Bankomat.");
        out.println("Please select an option: " + "available:" + "\n" + "1 - Balance" + "\n" +
                "2 - Withdraw money" + "\n" + "3 - Deposit money" + "\n" + "4 - Get Balance in other currency" + "\n" +
                "5 - Get new card" + "\n" +  "6 - Block card");

        int selection = scanner.nextInt();

        switch(selection){
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
                break;
            case 5: // get new Card
                break;
            case 6: // Block card
                break;
            default: {
                System.out.println("Wrong data was entered");
            }

        }

    }



}