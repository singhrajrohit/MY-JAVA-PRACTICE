package Methods;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :- ");
        String str =sc.nextLine();
        sc.close();
        CountVowels obj= new CountVowels();

        System.out.println("Total vowels in the string are :- "+obj.countVowels(str));
    }

    private int countVowels(String str){
        str=str.toLowerCase();
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}
