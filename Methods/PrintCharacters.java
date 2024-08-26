// Write a Java method to print characters between two characters (i.e. A to P).
// Note: Prints 20 characters per line

package Methods;

import java.util.Scanner;

public class PrintCharacters {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter starting charracter :- ");
        char start=sc.next().charAt(0);
        System.out.print("Enter ending charracter :- ");
        char end =sc.next().charAt(0);
        sc.close();
        PrintCharacters obj = new PrintCharacters();
        obj.printChar(start,end);

    }
    private void printChar(char start, char end){
        for(int count=1;start<=end;count++,start++){
            System.out.print(start+" ");
            if(count%20==0)
                System.out.println();
        }
    }
}
