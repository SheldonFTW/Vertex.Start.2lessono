package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = "Dima Sytnick";
        int start = 1;
        int finish = 10;
        for (int s = start; s <= finish; s++) {
            System.out.println(s + " " + name);

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yout name");

        String namee = scanner.nextLine();

        System.out.println("How much copyes?");

        int copy = scanner.nextInt();

        for (int c = 0;  c < copy; c++) {
            System.out.println(namee);

            scanner.close();

        }
    }
}



