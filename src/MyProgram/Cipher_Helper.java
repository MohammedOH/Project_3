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
        String result = cipheringAtbash(input);
        String output = (input + " has been deciphered Using ATBASH to " + result + "\n");
        Main.printAndRecord(output);
        Main.getMainMenu();
    }

    public static void getDecipheringHex() {
        System.out.print("Enter the text to be deciphered: ");
        String input = getInput();
        String result = decipheringHex(input);
        String output = (input + " has been deciphered Using HEXADECIMAL to " + result + "\n");
        Main.printAndRecord(output);
        Main.getMainMenu();

    }

    public static void getDecipheringVigenere() {
        System.out.print("Enter the text to be deciphered: ");
        String input = getInput();
        String result = decipheringVigenere(input);
        String output = (input + " has been deciphered Using VIGENERE to " + result + "\n");
        Main.printAndRecord(output);
        Main.getMainMenu();
    }

    /* Method to get a strin from user*/
    private static String getInput() {
        Scanner input = new Scanner(System.in);
        return (input.nextLine().toUpperCase());
    }

    /* Ciphering methods */
    public static String cipheringAtbash(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i))) {
                result.append(input.charAt(i));
                continue;
            }
            result.append((char) (26 - (input.charAt(i) - 'A' + 1) + 'A'));
        }
        return result.toString();
    }

    public static String cipheringHex(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append(decToHex(input.charAt(i))).append(" ");
        }
        return result.toString().trim();
    }

    public static String decToHex(int i) {
        StringBuilder result = new StringBuilder();
        while (i > 0) {
            if (i % 16 > 9)
                result.append((char) (i % 16 - 10 + 'A'));
            else
                result.append(i % 16);
            i /= 16;
        }
        return result.reverse().toString();
    }

    public static String cipheringVigenere(String input) {
        final String KEY = "SECRET";
        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                result.append(c);
                continue;
            } else if (c < 'A' || c > 'Z')
                continue;
            result.append((char) ((c + KEY.charAt(j) - 2 * 'A') % 26 + 'A'));
            j = ++j % KEY.length();
        }
        return result.toString();
    }

    /* Deciphering methods */
    public static String decipheringHex(String input) {
        StringBuilder result = new StringBuilder();
        input = clean(input);
        for (int i = 0; i < input.length(); i += 2) {
            result.append((char) hexToDec(input.substring(i, i + 2)));
        }
        return result.toString();
    }

    public static String clean(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') continue;
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public static int hexToDec(String s) {
        String digits = "0123456789ABCDEF";
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            int d = digits.indexOf(s.charAt(i));
            val = 16 * val + d;
        }
        return val;
    }

    public static String decipheringVigenere(String input) {
        StringBuilder result = new StringBuilder();
        final String KEY = "SECRET";
        for (int i = 0, j = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                result.append(c);
                continue;
            } else if (c < 'A' || c > 'Z') {
                continue;
            }
            result.append((char) ((c - KEY.charAt(j) + 26) % 26 + 'A'));
            j = ++j % KEY.length();
        }
        return result.toString();
    }

}