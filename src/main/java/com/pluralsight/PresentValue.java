package com.pluralsight;

import java.util.Scanner;

//This function is calculating how much a user should invest to get a specific number in interest payments.
public class PresentValue {
    static Scanner scanner = new Scanner(System.in);
    public void main(){
        int monthlyPayment = userMonthlyPayment();
        double yearlyInterestRate = userMonthlyInterestRate();
        int numberOfYear = userNumberOfYear();

        double amountNeedsToBeInvested = userAmountNeedsToBeInvested(monthlyPayment, yearlyInterestRate, numberOfYear);
        System.out.printf("You will need to invest $%.2f today",amountNeedsToBeInvested);
    }

    //This is getting how much the user wants to get monthly.
    public int userMonthlyPayment(){
        System.out.print("What is your monthly payment: ");
        int monthlyPayment = scanner.nextInt();
        return monthlyPayment;
    }

    //This method is getting what is your expected interest return
    public double userMonthlyInterestRate(){
        System.out.print("What is your expected monthly interest rate: ");
        double interestRate = scanner.nextDouble();
        return interestRate;
    }

    //This method is getting how long the users wants to invest their money for.
    public int userNumberOfYear(){
        System.out.print("How many years do you intend on investing: ");
        int years = scanner.nextInt();
        return years;
    }

    //This method is calculating how much money someone needs to invest to make $3000 a month
    public double userAmountNeedsToBeInvested(int monthlyPayment, double yearlyInterestRate, int numberOfYear){
        double interest = (yearlyInterestRate / 100) / 12;
        double needToInvest = monthlyPayment * (1 - Math.pow(1 + interest, - numberOfYear * 12)) / interest;
        return needToInvest;
    }
}
