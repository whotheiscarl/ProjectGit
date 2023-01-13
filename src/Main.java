import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 1876.05; //bitte mit dieser Variable arbeiten

        out.println("Welcome to your local ATM.");

        int Christoph = 1;
        int Mohammad = 2;
        int Franzi = 3;
        int Carl = 4;

        //Abfrage nach IBAN

        Scanner z = new Scanner(System.in);
        int p;
        out.println("Bitte gebe deine Kundennummer ein damit wir weitere Schritte einleiten können");
        p = z.nextInt();

        out.println("Code ist: " + p);

        if (p==1){
            out.println("Willkommen Christoph " );}

        else if (p==2){
            out.println("Willkommen Mohammad " );}

        else if (p==3){
            out.println("Willkomen Franzi ");}

        else if (p==4){
            out.println("Willkommen Carl ");}


        // Abfrage ach Pin
        Scanner s = new Scanner(System.in);
        int x;
        out.println("Bitte gebe deinen PIN ein um auf dein Bankkonto zuzugreifen");
        x = s.nextInt();

        if (x==2023) {
            out.println("Der Pin war erfolgreich ");
            out.println("");

            out.println("Please select an option: " + "available:" + "\n" + "1 - Balance" + "\n" +
                    "2 - Withdraw money" + "\n" + "3 - Deposit money" + "\n" + "4 - Get Balance in other currency" + "\n" +
                    "5 - Get new card" + "\n" + "6 - Block card");

            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    // get balance
                    out.println("Your balance is: " + balance);
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

                    Scanner Input = new Scanner((System.in));

                    out.println("Möchten Sie eine Überweisung durchführen? (y/n)");

                    char Answer = Input.next().charAt(0);
                    if (Answer == ('y') ) {
                        out.println("In Bearbeitung!!!");
                        out.println("Geben Sie den gewünschte Betrag:");
                        int Ueberweisung = Input.nextInt();
                        out.println("");
                        if (Ueberweisung < balance) {
                            out.println("Überweisung durchgeführt");
                            out.println("");
                        } else if (Ueberweisung > balance) {
                            out.println("Das von Ihnen gespeicherte Girokonto ist nicht ausreichend" +
                                    "gedeckt um ie Lastschrift auszuführen.");
                        } else if (Ueberweisung == balance) {
                            out.println("Achtung! Ihr Kontostand wird nach diesem Vorgang 0 € sein");

                        } else {
                            out.println("Bitte geben Sie den gewünschten Betrag in Ziffern an.");
                        }
                    }
                    break;
                case 4:
                    // get Balance on other Currency
                    double exchangeJPY = 139.15;
                    String JPY = "JPY";
                    double exchangeUSD = 1.08;
                    String USD = "USD";
                    double exchangeGBP = 0.89;
                    String GBP = "GBP";
                    double exchangeAUD = 1.55;
                    String AUD = "AUD";
                    double exchangeCAD = 1.45;
                    String CAD = "CAD";
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
                    out.println("Your card has been succesfully blocked.");
                    break;
                default: {
                    out.println("Wrong data was entered. Please try another time.");
                }
            }
        }
        else {
                out.println("Das war leider nicht der richtige Pin"); }

        out.println("");
        out.println("Thank you for your visit.");

        scanner.close();

    }

}