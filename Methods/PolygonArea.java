// 14. Write a Java method to create a polygon area.

// Expected Output:

// Input the number of sides: 5                             
// Input the side: 6                                        
// The area of the pentagon is 61.93718642120281

package Methods;

import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Input number of sides :- ");
        int numSide=sc.nextInt();
        System.out.print("Input the side :- ");
        double side =sc.nextDouble();
        sc.close();

        if(numSide<3)
            System.out.println("A polygon must have at leat 3 sides.");
        else{
            PolygonArea obj =new PolygonArea();
            System.out.printf("Area of Polygon :- %.2f",obj.areaPolygon(numSide, side));
        }
    }
    private double areaPolygon(int numSide, double side){
        // if(numSide<3)
        //     throw new IllegalArgumentException("Invalid Polygon");
        //formula 1
        double appothem=(side/(2*(Math.tan(Math.PI/numSide))));

        return (numSide*side*appothem)/2;

        //formula 2
        //return  (n * s * s) / (4 * Math.tan(Math.PI/n));

    }
}
