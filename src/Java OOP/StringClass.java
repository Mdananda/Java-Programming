package Exam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringClass {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String sr = input.nextLine();
        
        if(s.equals(sr))
            System.out.println("Yes");
    }
    
}
