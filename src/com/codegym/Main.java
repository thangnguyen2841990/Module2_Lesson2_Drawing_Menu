package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("4. Exit");
            System.out.println("Enter Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Draw the triangle");
                    String str = "";
                    for (int i = 6; i >= 1; i--) {
                        str += "\n";
                        for (int j = 1; j < i + 1; j++) {
                            str += "*";
                        }
                    }
                    System.out.println(str);
                    break;
                }
                case 2: {
                    System.out.println("Draw the square");
                    String str = "";
                    for (int i = 0; i < 6; i++) {
                        str += "*" + "  ";
                        for (int j = 0; j < 5; j++) {
                            str += "*" + "  ";
                        }
                        str += "\n";
                    }
                    System.out.println(str);
                    break;
                }
                case 3: {
                    System.out.println("Draw the rectangle");
                    String str = "";
                    for (int i = 0; i < 3; i++) {
                        str += "*" + "  ";
                        for (int j = 0; j < 5; j++) {
                            str += "*" + "  ";
                        }
                        str += "\n";
                    }
                    System.out.println(str);
                    break;
                }
            }

        } while (choice == 4);
    }
}

