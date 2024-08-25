package Methods;

import java.util.Scanner;

class SmallestAmongThree {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter numbers:- ");
        System.out.print("1st number :- ");
        double a=sc.nextDouble();
        System.out.print("2nd number :- ");
        double b=sc.nextDouble();
        System.out.print("3rd number :- ");
        double c=sc.nextDouble();
        sc.close();

        SmallestAmongThree obj= new SmallestAmongThree();
        double result=obj.smallest(a, b, c);

        System.out.println("smallest number is :- "+result);

    }

    public double smallest(double a, double b, double c)
    {
        //Method 1
        // if(a<b){
        //     if(a<c){
        //         return a;
        //     }
        //     else{
        //         return c;
        //     }
        // }
        // else{
        //     if(b<c){
        //         return b;
        //     }
        //     else{
        //         return c;
        //     }
        // }

        //2nd method

        return Math.min(Math.min(a,b),c);
    }
    
}