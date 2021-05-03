package StringType;
import java.lang.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class STRING {
    
    public static void main(String[] args){
        
       Scanner input = new Scanner(System.in);
       String nm = "My Name is Ananda";
       StringTokenizer tk = new StringTokenizer(nm);
       System.out.println(tk.countTokens());
       
       while(tk.hasMoreTokens())
       {
           System.out.println(tk.nextToken()+"\n");
       }
    }           
}
