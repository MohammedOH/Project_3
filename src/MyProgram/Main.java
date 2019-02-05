package MyProgram;

import java.util.Scanner;

public class Main {
    public static StringBuilder records = new StringBuilder();
    public static int countRecords = 0;

    /* Main Method */
    public static void main(String[] args) {
        System.out.println("===============SECURITY SERVICES===============");
        /* Running Program */
        getMainMenu();
    }

    public static void getMainMenu() {
        // Scanner to read input
        Scanner input = new Scanner(System.in);
        // Printing interface
        getMainInterface();
        // Getting an input from user
        int service = input.nextInt();
        // Running the service needed
        System.out.println("**************************************************");
        switch (service) {
            case 1:
                ciphering(input);
                break;
            case 2:
                deciphering(input);
                break;
            case 3:
                records();
                break;
            case 0:
                exit();
                break;
            default:
                System.out.println("Invalid input!");
                System.out.println("**************************************************");
                getMainMenu();
        }
    }

    private static void ciphering(Scanner input) {
        // Printing sub-menu interface
        getSubMenuInterface();
        int service = input.nextInt();
        // Running the service needed
        System.out.println("**************************************************");
        switch (service) {
            case 1:
                Cipher_Helper.getCipheringAtbash();
                break;
            case 2:
                Cipher_Helper.getCipheringHex();
                break;
            case 3:
                Cipher_Helper.getCipheringVigenere();
                break;
            case 0:
                getMainMenu();
                break;
            default:
                System.out.println("Invalid input!");
                System.out.println("**************************************************");
                getMainMenu();
        }
    }

    private static void deciphering(Scanner input) {
        // Printing sub-menu interface
        getSubMenuInterface();
        int service = input.nextInt();
        // Running the service needed
        System.out.println("**************************************************");
        switch (service) {
            case 1:
                Cipher_Helper.getDecipheringAtbash();
                break;
            case 2:
                Cipher_Helper.getDecipheringHex();
                break;
            case 3:
                Cipher_Helper.getDecipheringVigenere();
                break;
            case 0:
                getMainMenu();
                break;
            default:
                System.out.println("Invalid input!");
                System.out.println("**************************************************");
                getMainMenu();
        }
    }

    private static void records() {
        System.out.print(records.toString());
        System.out.println("**************************************************");
    }

    private static void getMainInterface() {
        // Main menu interface
        System.out.print("Services Menu\n"
                + "\t1 - Ciphering text\n"
                + "\t2 - Deciphering text\n"
                + "\t3 - Records\n"
                + "\t0 - Exit\n"
                + "Please Enter the number of service needed: ");
    }

    private static void getSubMenuInterface() {
        // Sub-menu interface
        System.out.print("Techniques Menu\n"
                + "\t1 - ATBASH\n"
                + "\t2 - HEXADECIMAL\n"
                + "\t3 - VIGENERE\n"
                + "\t0 - Return to Main Menu\n"
                + "Please Enter the number of service needed: ");
    }

    private static void exit() {
        // Exit program
        System.out.println("---------------End of service---------------");
        System.exit(1);
    }

    public static void printAndRecord(String output) {
        // Printing result
        System.out.print(output);
        System.out.println("**************************************************");
        // Recording result
        records.append(++countRecords).append(" - ").append(output);
        // Back to main menu
        getMainMenu();
    }
}
