import java.sql.SQLOutput;
import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance; //bitte mit dieser variable arbeiten

        out.println("Welcome to your local Bankomat.");
        out.println("Please select an option: " + "available:" + "\n" + "1 - Login" + "\n" +
                "2 - Balance" + "\n" + "3 - Withdraw money" + "\n" + "4 - Deposit money" + "\n" +
                "5 - Get Balance in other currency " + "\n" +  "6 - Get new card" + "\n" + "7 - Block card");

        int auswahl = scanner.nextInt();

        switch(auswahl){
            case 1:
                // login / personal data
                break;
            case 2:
                // get Balance
                break;
            case 3:
                // withdraw money
                break;
            case 4:
                // deposit money
                break;
            case 5: // get balance in other curency
                break;
            case 6: // get new card
                break;
            case 7: //block card
                break;
            default: {
                System.out.println("Wrong data was entered");
            }

        }

    }



}