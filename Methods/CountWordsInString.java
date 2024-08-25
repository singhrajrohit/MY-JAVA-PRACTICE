package Methods;

import java.util.Scanner;

public class CountWordsInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence :- ");
        String str=sc.nextLine();
        sc.close();

        CountWordsInString obj = new CountWordsInString();
        System.out.println("Total words in sentence :-" +obj.countWords(str));
    }

    private int countWords(String str){
        int count=0;
        if(str.charAt(0)==' ' || str.charAt(str.length()-1)== ' ')
            return 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
}
