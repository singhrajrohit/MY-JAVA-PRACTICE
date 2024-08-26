// Write a Java method to check whether a string is a valid password.
// Password rules:
// A password must have at least eight characters.
// A password consists of only letters and digits.
// A password must contain at least two digits.

package Methods;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("A password must have at least eight characters.");
        System.out.println("A password consists of only letters and digits.");
        System.out.println("A password must contain at least two digits.");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.) :- ");

        String password=sc.nextLine();
        sc.close();
        ValidPassword obj =new ValidPassword();
        if(obj.checkValidation(password))
            System.out.println(password +" is a valid password");
        else
            System.out.println(password +" is not a valid password");

    }

    private boolean checkValidation(String password){
        if(password.length()<8)
            return false;       
        int charCount=0, numCount=0;
        
        for(int i=0;i<password.length();i++){
            char c=password.charAt(i);
            if(isLetter(c))
                charCount++;
            else if(isNumber(c))
                numCount++;
            else
                return false;
        }
        return(charCount>=2 && numCount>=2);
    }

    private boolean isLetter(char c){
        c=Character.toLowerCase(c);
        return(c>='a' && c<='z');
    }
    private boolean isNumber(char c){
        return (c>='0' && c<='9');
    }
}
