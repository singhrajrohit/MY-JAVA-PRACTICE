package Methods;

import java.util.Scanner;

class AverageThreeNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers :- ");
        System.out.print("1st number :-");
        float a=sc.nextFloat();
        System.out.print("2nd number :-");
        float b=sc.nextFloat();
        System.out.print("3rd number :-");
        float c=sc.nextFloat();
        sc.close();

        AverageThreeNumbers obj =new AverageThreeNumbers();
        System.out.printf("Average = %.2f" ,obj.average(a, b, c));

    }

    public float average(float a, float b, float c){
        //method 1
        return (a+b+c)/3;
    }
}
