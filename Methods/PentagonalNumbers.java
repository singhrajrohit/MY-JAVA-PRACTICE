package Methods;

import java.util.Scanner;

public class PentagonalNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter rhe number of pentagonal desired :- ");
        int n=sc.nextInt();
        sc.close();
        PentagonalNumbers obj =new PentagonalNumbers();
        System.out.println("First "+n+" Pentagonal numbers are :-");
        for(int count=1,i=1;i<=n;i++){
            System.out.printf("%-6d",obj.pentagonal(i));
            if(count%10==0)
                System.out.println();
            count++;
        }
    }

    private int pentagonal(int n){

        return ((3*n*n)-n)/2;
    }
}
