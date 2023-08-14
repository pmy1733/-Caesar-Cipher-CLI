package com.meroka.java.main;

import java.util.Scanner;

public class Cipher  // create class CaesarCipherExample for encryption and decryption
{


    // main() method start
    public static void main(String[] args)
    {

        // take input from the user
        Scanner sc = new Scanner(System.in);

        CaecerCipher CaeserCipher= new CaecerCipher();
        System.out.println("Enter a string to encrypt: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter encryption shift key: ");
        int shiftKey = Integer.valueOf(sc.nextLine());

        System.out.println("Encrypted Data: "+CaeserCipher.encrypt(inputStr, shiftKey));
        System.out.println("Decrypted Data :"+CaeserCipher.decrypt(CaeserCipher.encrypt(inputStr, shiftKey), shiftKey));

        // close Scanner class object
        sc.close();
    }
}
