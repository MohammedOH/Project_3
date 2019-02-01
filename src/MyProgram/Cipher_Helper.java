package MyProgram;

import java.util.Scanner;

public class Cipher_Helper {
    /* Ciphering*/
    public static void getCipheringAtbash() {
        System.out.print("Enter the text to be ciphered: ");
        String input = getInput();
        String result = cipheringAtbash(input);
        String output = (input + " has been ciphered Using ATBASH to " + result + "\n");
        Main.printAndRecord(output);
        Main.getMainMenu();
    }

    public static void getCipheringHex() {
        System.out.print("Enter the text to be ciphered: ");
        String input = getInput();
        String result = cipheringHex(input);
        String output = (input + " has been ciphered Using HEXADECIMAL to " + result + "\n");
        Main.printAndRecord(output);
        Main.getMainMenu();
    }

    public static void getCipheringVigenere() {
        System.out.print("Enter the text to be ciphered: ");
        String input = getInput();
        String result = cipheringVigenere(input);
        String output = (input + " has been ciphered Using VIGENERE to " + result + "\n");
        Main.printAndRecord(output);
        Main.getMainMenu();
    }

    /* Deciphering */
    public static void getDecipheringAtbash() {
        System.out.print("Enter the text to be deciphered: ");
        String input = getInput();
        String result = cipheringHex(input);
        String output = (input + " has been deciphered Using ATBASH to " + result + "\n");
        Main.printAndRecord(output);
        Main.getMainMenu();
    }

    public static void getDecipheringHex() {
        System.out.print("Enter the text to be deciphered: ");
        String input = getInput();
        String result = cipheringHex(input);
        String output = (input + " has been deciphered Using HEXADECIMAL to " + result + "\n");
        Main.printAndRecord(output);
        Main.getMainMenu();

    }

    public static void getDecipheringVigenere() {
        System.out.print("Enter the text to be deciphered: ");
        String input = getInput();
        String result = cipheringHex(input);
        String output = (input + " has been deciphered Using VIGENERE to " + result + "\n");
        Main.printAndRecord(output);
        Main.getMainMenu();
    }

    /* Method to get a strin from user*/
    private static String getInput(){
        Scanner input = new Scanner(System.in);
        return (input.nextLine());
    }

    /* Ciphering methods */
    public static String cipheringAtbash(String input) {
        String result = null;

        return result;
    }

    public static String cipheringHex(String input) {
        String result = null;

        return result;
    }

    public static String cipheringVigenere(String input) {
        String result = null;

        return result;
    }

    /* Deciphering methods */
    public static String decipheringAtbash(String input) {
        String result = null;

        return result;
    }

    public static String decipheringHex(String input) {
        String result = null;

        return result;
    }

    public static String decipheringVigenere(String input) {
        String result = null;

        return result;
    }

}