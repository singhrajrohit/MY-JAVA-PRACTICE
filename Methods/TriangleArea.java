// Write Java methods to calculate triangle area.

// Expected Output:

// Input Side-1: 10                                                                               
// Input Side-2: 15                                                                               
// Input Side-3: 20                                                                              
// The area of the triangle is 72.6184377413890

package Methods;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sides of Triangle :-");
        System.out.print("1st side :- ");
        double side1=sc.nextDouble();
        System.out.print("2nd side :- ");
        double side2=sc.nextDouble();
        System.out.print("3rd side :- ");
        double side3=sc.nextDouble();
        sc.close();
        TriangleArea obj =new TriangleArea();
        if(obj.isValid(side1, side2, side3))
            System.out.printf("Area of Triangle is :- %.2f ",obj.calculateArea(side1, side2, side3));
        else
            System.out.println("Invalid Triangle");
    }

    private boolean isValid(double side1, double side2,double side3){

        return (side1+side2>side3 && side1+side3>side2 && side2+side3>side1);
        //     return true;
        // else
        //     return false;
    }

    private double calculateArea(double side1,double side2,double side3){
        double s=(side1+side2+side3)/2;

        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));


    }
}
