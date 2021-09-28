package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader
        Random rand = new Random(); // Create random class

        System.out.printf("What's your question? \n> ");
        String question = reader.nextLine();

        int randomNum = (rand.nextInt(4));

        // Didn't see the list instruction until after but this works
        switch(randomNum) {
            case 0:
                System.out.printf("\n" + "Ask again later. ");
                break;
            case 1:
                System.out.printf("\n" + "Yes. ");
                break;
            case 2:
                System.out.printf("\n" + "No. ");
                break;
            case 3:
                System.out.printf("\n" + "Maybe. ");
                break;
        }

    }
}