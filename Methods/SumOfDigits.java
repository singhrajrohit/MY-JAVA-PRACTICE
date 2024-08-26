package Methods;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the Number :- ");
        int number=sc.nextInt();
        sc.close();

        SumOfDigits obj = new SumOfDigits();
        System.out.println("sum of digits is :- "+obj.digitSum(number));


    }
    
    private int digitSum(int number){
        int sum=0;
        while(number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
