package Exam;

import com.sun.org.apache.bcel.internal.util.ByteSequence;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

public class Client {
    
    public static void main(String[] args)
    {
        try{
            Socket s = new Socket("localhost", 2000);
            DataInputStream din = new DataInputStream(s.getInputStream());
            String str = din.readUTF();
            System.out.println(str);
            
        }catch(Exception e)
        {
            
        }
    }
    
}
