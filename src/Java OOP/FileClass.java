package Exam;

import java.io.*;
import java.util.logging.Formatter;
import java.util.*;
import java.util.logging.LogRecord;

public class FileClass {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        try{
         String nm;   
         FileWriter fl = new FileWriter("And.txt");
         
         for(int i = 1; i < 3; ++i)
         {
             nm = input.nextLine();
             fl.write(nm+"\n"); 
             
         }
         
         fl.close();
         
         
         FileReader fr = new FileReader("And.txt");
         
         int name;
         
         while((name = fr.read()) != -1)
         {
             System.out.print((char)name);
         }
               
        }catch(Exception e)
        {
            
        }
    }
    
}
