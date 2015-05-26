package com.company;

import java.util.Scanner;

public class Ugadaika {
    public static void main(String[] args) {
        String data = new String();
        int i = 1;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Input number from 0 to 10: ");
            data = in.nextLine();
            if (data.equals("5")) {
                System.out.println("You win! After " + i + " attempt(s)");
            } else i++;
        } while (!data.equals("5"));
    }
}
