package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    int numberOfTransactions;
    ArrayList<Double> transactions = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        Main driver = new Main();
        driver.enterDetails(scanner);
    }

    private void enterDetails(Scanner scanner){
        System.out.println("Enter the size of transaction array");
        numberOfTransactions = scanner.nextInt();

        System.out.println("Enter the values of array");

        for (int i=1; i <= numberOfTransactions; i++){
            double value  = scanner.nextDouble();
            transactions.add(value);
        }

        System.out.println("Enter the total no of targets that needs to be achieved");
        int targets  = scanner.nextInt();

        for (int i=1; i <= targets; i++){
            System.out.println("Enter the value of target");
            double targetValue  = scanner.nextDouble();
            int afterTransactions = findTarget(targetValue);

            if (afterTransactions == 0-1) {
                System.out.println("Given target is not achieved ");
            } else {
                System.out.println("Target achieved after " + afterTransactions + " transactions ");
            }

        }
    }

    private int findTarget(double targetValue){
        double totalTillThisTransaction = 0;
        for(int i=0; i < transactions.size(); i++){
            totalTillThisTransaction = totalTillThisTransaction + transactions.get(i);

            if(totalTillThisTransaction > targetValue){
                return i+1;
            }
        }

        return -1;
    }
}

