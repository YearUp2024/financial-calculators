package com.pluralsight;

import java.util.Scanner;

public class main {
    static MortgageCalculator mortgageCalculator = new MortgageCalculator();
    static FutureValue futureValue = new FutureValue();
    static PresentValue presentValue = new PresentValue();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        calculators();
    }

    public static void calculators(){
        System.out.println("We have three calculators: ");
        System.out.println("Mortgage");
        System.out.println("Future");
        System.out.println("Present");
        System.out.print("Which calculator do you want to use: ");
        System.out.println("");

        String options = scanner.nextLine();

        if(options.equalsIgnoreCase("Mortgage")){
            mortgageCalculator.main();
        }
        if(options.equalsIgnoreCase("Future")){
            futureValue.main();
        }
        if(options.equalsIgnoreCase("Present")){
            presentValue.main();
        }
    }
}
