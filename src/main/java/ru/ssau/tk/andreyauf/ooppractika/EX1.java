package ru.ssau.tk.andreyauf.ooppractika;

import java.util.Scanner;

public class EX1{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String string = in.next();
        System.out.printf("String: %s \n", string);
        in.close();
    }
}
