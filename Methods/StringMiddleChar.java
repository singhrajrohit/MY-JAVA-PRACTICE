package Methods;

import java.util.Scanner;

public class StringMiddleChar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter string :-");
        String str=sc.nextLine();
        sc.close();

        StringMiddleChar obj= new StringMiddleChar();

        System.out.println("Middle characters are :- " +obj.middleCharracter(str));
    }

    private String middleCharracter(String str) {
        //My Method
        // String result=new String();
        // //int n=str.length();
        // if(str.length()%2 == 0){
        //     result= result+str.charAt((str.length()/2)-1)+" & "+str.charAt(str.length()/2);
        // }
        // else{
        //     result=result+str.charAt(str.length()/2);
        // }
        // return result;

        //Internet Method
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}
