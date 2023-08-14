package com.meroka.java.main;

import java.util.Scanner;

public class Cipher  // create class CaesarCipherExample for encryption and decryption
{
    // ALPHABET string denotes alphabet from a-z
    public static  String ALPHABET1 = "abcdefghijklmnopqrstuvwxyz";
    public static  String ALPHABET2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String ALPHABET = ALPHABET1 + ALPHABET2 ;

    // create encryptData() method for encrypting user input string with given shift key
    public static String encrypt(String inputStr, int shiftKey)
    {
        String encryptStr = "";

        // use for loop for traversing each character of the input string
        for (int i = 0; i < inputStr.length(); i++)
        {
            // get position of each character of inputStr in ALPHABET
            int pos = ALPHABET.indexOf(inputStr.charAt(i));

            // get encrypted char for each char of inputStr
            int encryptPos = (shiftKey + pos) % 52;
            char encryptChar = ALPHABET.charAt(encryptPos);

            // add encrypted char to encrypted string
            encryptStr += encryptChar;
        }

        // return encrypted string
        return encryptStr;
    }

    // create decryptData() method for decrypting user input string with given shift key
    public static String decrypt(String inputStr, int shiftKey)
    {
        // decryptStr to store decrypted data
        String decryptStr = "";

        // use for loop for traversing each character of the input string
        for (int i = 0; i < inputStr.length(); i++)
        {

            // get position of each character of inputStr in ALPHABET
            int pos = ALPHABET.indexOf(inputStr.charAt(i));

            // get decrypted char for each char of inputStr
            int decryptPos = (pos - shiftKey) % 52;

            // if decryptPos is negative
            if (decryptPos < 0){
                decryptPos = ALPHABET.length() + decryptPos;
            }
            char decryptChar = ALPHABET.charAt(decryptPos);

            // add decrypted char to decrypted string
            decryptStr += decryptChar;
        }
        // return decrypted string
        return decryptStr;
    }

    // main() method start
    public static void main(String[] args)
    {
        // create an instance of Scanner class
        Scanner sc = new Scanner(System.in);

        // take input from the user
        System.out.println("Enter a string to encrypt: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter encryption shift key: ");
        int shiftKey = Integer.valueOf(sc.nextLine());

        System.out.println("Encrypted Data: "+encrypt(inputStr, shiftKey));
        System.out.println("Decrypted Data :"+decrypt(encrypt(inputStr, shiftKey), shiftKey));

        // close Scanner class object
        sc.close();
    }
}
