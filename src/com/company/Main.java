package com.company;

public class Main {

    public static void main(String[] args) {

        String st = "The quick brown fox jumps over the lazy dog.";

        //replacing
        String new_st = st.replace('d', 'f');

        System.out.println("Original string: " + st);
        System.out.println("New String: " + new_st);

    }
}
