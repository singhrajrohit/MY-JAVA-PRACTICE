//Write a Java method to check whether a year (integer) entered by the user is a leap year or not.

package Methods;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year :-");
        int year=sc.nextInt();
        sc.close();

        CheckLeapYear obj=new CheckLeapYear();
        if(obj.checkLeap(year)==true)
            System.out.println(year +" is a Leap year");
        else
            System.out.println(year +" is not a Leap year");
    }

    public boolean checkLeap(int year){

        boolean x=year%4 ==0;
        boolean y=year%100 !=0;
        boolean z=year%100==0 && year%400==0;

        return x&&(y||z);
    }
}
