package com.mincalculator;

import java.util.Scanner;

public class Main {

    static int addition(int a, int b){return a+b;}
    static int subtraction(int a, int b){return a-b;}
    static int multiplication(int a, int b){return a*b;}
    static int division(int a, int b){return a/b;}

    public static void main(String[] args) {
        float num1, num2;
        System.out.println("Enter your first number:");
        Scanner input_1 = new Scanner(System.in);
        num1 = input_1.nextFloat();

        System.out.println("Enter your second number:");
        Scanner input_2 = new Scanner(System.in);
        num2 = input_2.nextFloat();

        System.out.println("You have entered " + num1 + " And " + num2);
        String prompt = "Enter 0 for addition, 1 for subtraction, 2 for multiplication, and 3 for division.";
        System.out.println(prompt);

        Scanner promptAnsInput = new Scanner(System.in);
        int input = promptAnsInput.nextInt();
        switch (input){
            case 0: System.out.print("Adding these numbers.");
                System.out.println(" The result is:");
                System.out.println(num1 + num2);break;

            case 1: System.out.print("Subtracting these numbers.");
                System.out.println(" The result is: ");
                System.out.println(num1 - num2);break;

            case 2: System.out.print("Multiplying these numbers.");
                System.out.println(" The result is:");
                System.out.println(num1*num2);break;

            case 3: System.out.print("Dividing these numbers.");
                System.out.println(" The result is:");
                System.out.println(num1/num2);break;

            default:
                System.out.println("Invalid input.");
        }

    }
}
