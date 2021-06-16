package com.company;

public class Main {

    public static void main(String[] args) {

        String st = "The quick brown fox jumps over the lazy dog.";

        String new_st = st.replace('d', 'f'); // do not use "_" in naming
        // what if the string is "The stupid yellow duck every day jumps over the lazy dog."? Please, implement it. (Always think about universal solutions)
        System.out.println("Original string: " + st);
        System.out.println("New String: " + new_st);

    }
}
