package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //User inputs
        int mortgagePrinciple = userLoanPrincipleAmount();
        double annualInterestRate = userMortgageInterestRate();
        int leanTermInYears = userMortgageLength();
        int numberOfPayments = leanTermInYears * 12;

        double mortgageMonthlyPayments = userMortgageMonthlyPayments(mortgagePrinciple, annualInterestRate, numberOfPayments);
        double annualMortgagePayment = userAnnualMortgagePayment(numberOfPayments, mortgageMonthlyPayments, mortgagePrinciple);

        System.out.printf("Your monthly mortgage payment is $%.2f",mortgageMonthlyPayments);
        System.out.println("");
        System.out.printf("You will have to pay $%.2f in total interest", annualMortgagePayment);
    }

    public static int userLoanPrincipleAmount(){
        System.out.print("What is your principle amount: ");
        int principleAmount = scanner.nextInt();
        return principleAmount;
    }

    public static double userMortgageInterestRate(){
        System.out.print("What is your mortgage interest rate: ");
        double interestRate = scanner.nextDouble();
        return interestRate;
    }

    public static int userMortgageLength(){
        System.out.print("What is your mortgage length: ");
        int mortgageLength = scanner.nextInt();
        return mortgageLength;
    }

    public static double userMortgageMonthlyPayments(int mortgagePrinciple, double annualInterestRate, int numberOfPayments){
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        double monthlyMortgageAmount = mortgagePrinciple * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,
                numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) -1);
        return monthlyMortgageAmount;
    }

    public static double userAnnualMortgagePayment(int numberOfPayments, double mortgageMonthlyPayments, int mortgagePrinciple){
        double interestAmount = mortgageMonthlyPayments * numberOfPayments;
        double totalInterestAmount = interestAmount - mortgagePrinciple;
        return totalInterestAmount;
    }
}