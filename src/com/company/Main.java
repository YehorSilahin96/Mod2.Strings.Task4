package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "The stupid yellow duck every day jumps over the lazy dog.";

        //replacing
        String newstr = str.replace('d', 'f');

        System.out.println("Original string: " + str);
        System.out.println("New String:      " + newstr);

    }
}
