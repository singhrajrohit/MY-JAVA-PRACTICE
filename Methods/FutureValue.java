// 8. Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
// Sample data (Monthly compounded) and Output:
// Input the investment amount: 1000
// Input the rate of interest: 10
// Input number of years: 5

package Methods;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Investment amount :- ");
        double principal =sc.nextDouble();
        System.out.print("Enter Rate of Interest :- ");
        double rate = sc.nextDouble();
        System.out.print("Enter duration in years :- ");
        double years =sc.nextDouble();
        sc.close();

        FutureValue obj = new FutureValue();
        System.out.println("Years     Future Value");
        for(int i=1;i<=years;i++){
            System.out.printf("%-9d %.2f",i,obj.amount(principal, rate/12, i));
            System.out.println();
        }


    }

    private double amount(double principal,double monthlyRate,double years){

        double amount = principal*(Math.pow((1+(monthlyRate/100)),(years*12)));

        return amount;
    }
}
