package com.pluralsight;

import java.util.Scanner;

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

    public static int userPrinciple(){
        System.out.print("What is your principle amount: ");
        int principle = scanner.nextInt();
        return principle;
    }

    public static double userAnnualInterestRate(){
        System.out.print("What is your interest rate: ");
        double interestRate = scanner.nextDouble();
        return interestRate;
    }

    public static int userNumberOfTimesInterestCompoundedPerYear(){
        System.out.print("How many times does your interest compound per year: ");
        int timesCompoundedPerYear = scanner.nextInt();
        return timesCompoundedPerYear;
    }

    public static int userNumberOfTimesMoneyInvestedInYear(){
        System.out.print("How many years did you invest your money for: ");
        int timeInYear = scanner.nextInt();
        return timeInYear;
    }

    public static double userCDEndingBalance(int principle, double annualInterestRate, int numberOfTimesMoneyInvestedInYear, int numberOfTimesInterestCompoundedPerYear){
        double balance = principle * (Math.pow(1 + (annualInterestRate / 100)/numberOfTimesInterestCompoundedPerYear, numberOfTimesMoneyInvestedInYear * numberOfTimesInterestCompoundedPerYear));
        return balance;
    }
}
