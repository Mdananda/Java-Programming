package StringType;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class clnt {
    
    public static void main(String[] args) throws IOException{
        try{
            Socket soc = new Socket("localhost", 2000);
            DataInputStream din = new DataInputStream(soc.getInputStream());
            DataOutputStream dout = new DataOutputStream(soc.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String str = "";
            
            while(true)
            {
                str = din.readUTF();
                System.out.println("Client Says : "+str);
                String sr = br.readLine();
                dout.writeUTF(sr);
                dout.flush();
                
            }
            
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
