// Write a Java method (takes n as input) to display an n-by-n matrix.

package Methods;

import java.util.Scanner;

public class RandomMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("input the number");
        int n=sc.nextInt();
        sc.close();
        RandomMatrix obj=new RandomMatrix();
        obj.printMatrix(n);

    }

    private void printMatrix(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((int)(Math.random() *2)+" ");
            }
            System.out.println();
        }
    }
}
