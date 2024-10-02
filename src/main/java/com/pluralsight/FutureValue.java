package com.pluralsight;

import java.util.Scanner;

//This is calculating future value of CD
public class FutureValue {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int principle = userPrinciple();
        double annualInterestRate = userAnnualInterestRate();
        int numberOfTimesInterestCompoundedPerYear = userNumberOfTimesInterestCompoundedPerYear();
        int numberOfTimesMoneyInvestedInYear = userNumberOfTimesMoneyInvestedInYear();

        double cdEndingBalance = userCDEndingBalance(principle, annualInterestRate, numberOfTimesMoneyInvestedInYear, numberOfTimesInterestCompoundedPerYear);
        System.out.printf("CD ending balance after %d years will be %.2f", numberOfTimesMoneyInvestedInYear, cdEndingBalance);
    }

    //This method is getting users principle amount
    public static int userPrinciple(){
        System.out.print("What is your principle amount: ");
        int principle = scanner.nextInt();
        return principle;
    }

    //This method is getting user interest rate.
    public static double userAnnualInterestRate(){
        System.out.print("What is your interest rate: ");
        double interestRate = scanner.nextDouble();
        return interestRate;
    }

    //This method is getting compounded interest per year
    public static int userNumberOfTimesInterestCompoundedPerYear(){
        System.out.print("How many times does your interest compound per year: ");
        int timesCompoundedPerYear = scanner.nextInt();
        return timesCompoundedPerYear;
    }

    //This method is getting how long the users wants to invest for
    public static int userNumberOfTimesMoneyInvestedInYear(){
        System.out.print("How many years did you invest your money for: ");
        int timeInYear = scanner.nextInt();
        return timeInYear;
    }

    //This method is calculating how much the user will have at the end of their investing period. 
    public static double userCDEndingBalance(int principle, double annualInterestRate, int numberOfTimesMoneyInvestedInYear, int numberOfTimesInterestCompoundedPerYear){
        double balance = principle * (Math.pow(1 + (annualInterestRate / 100)/numberOfTimesInterestCompoundedPerYear, numberOfTimesMoneyInvestedInYear * numberOfTimesInterestCompoundedPerYear));
        return balance;
    }
}
