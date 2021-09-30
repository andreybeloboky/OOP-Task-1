package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number cat(s)");
        int catNumber = scanner.nextInt();
        System.out.println("Enter number dog(s)");
        int dogNumber = scanner.nextInt();
        System.out.println("Enter number caw(s)");
        int cowNumber = scanner.nextInt();
        if (catNumber >= 0 && dogNumber >= 0 && cowNumber >= 0) {
            System.out.println("Number cats: " + catNumber);
            System.out.println("Number dogs: " + dogNumber);
            System.out.println("Number caws: " + cowNumber);
            Cat[] cats = new Cat[catNumber];
            Dog[] dogs = new Dog [dogNumber];
        }
    }
}
