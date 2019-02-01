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
        Scanner input = new Scanner(System.in);
        getMainInterface();
        int service = input.nextInt();

        System.out.println("**************************************************");
        switch (service){
            case 1:ciphering(input);break;
            case 2:deciphering(input);break;
            case 3:records();break;
            case 0:exit();break;
            default:
                System.out.println("Invalid input!");
                getMainMenu();
        }
    }

    private static void ciphering(Scanner input) {
        getSubMenuInterface();
        int service = input.nextInt();

        System.out.println("**************************************************");
        switch (service){
            case 1:
                Cipher_Helper.getCipheringAtbash();break;
            case 2:
                Cipher_Helper.getCipheringHex();break;
            case 3:
                Cipher_Helper.getCipheringVigenere();break;
            case 0:getMainMenu();break;
            default:
                System.out.println("Invalid input!");
                getMainMenu();
        }
    }

    private static void deciphering(Scanner input) {
        getSubMenuInterface();
        int service = input.nextInt();

        System.out.println("**************************************************");
        switch (service){
            case 1:
                Cipher_Helper.getDecipheringAtbash();break;
            case 2:
                Cipher_Helper.getDecipheringHex();break;
            case 3:
                Cipher_Helper.getDecipheringVigenere();break;
            case 0:getMainMenu();break;
            default:
                System.out.println("Invalid input!");
                getMainMenu();
        }
    }

    private static void records() {
        System.out.print(records.toString());
        System.out.println("**************************************************");
    }

    private static void getMainInterface(){
        System.out.print("Services Menu\n"
                + "\t1 - Ciphering text\n"
                + "\t2 - Deciphering text\n"
                + "\t3 - Records\n"
                + "\t0 - Exit\n"
                + "Please Enter the number of service needed: ");
    }

    private static void getSubMenuInterface(){
        System.out.print("Techniques Menu\n"
                + "\t1 - ATBASH\n"
                + "\t2 - HEXADECIMAL\n"
                + "\t3 - VIGENERE\n"
                + "\t0 - Return to Main Menu\n"
                + "Please Enter the number of service needed: ");
    }

    private static void exit() {
        System.out.println("---------------End of service---------------");
        System.exit(1);
    }

    public static void printAndRecord(String output) {
        System.out.print(output);
        System.out.println("**************************************************");
        records.append(++countRecords).append(" - ").append(output);
        getMainMenu();
    }
}
