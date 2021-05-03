package Exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import javax.net.ssl.SSLServerSocket;

public class Server {
    
    public static void main(String[] args)
    {
        try{
           ServerSocket ss = new ServerSocket(2000);
           Socket s = ss.accept();
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            dout.writeUTF("sss"); 
            dout.flush();
            dout.close();
            
            
        }catch(Exception e)
        {
            
        }
    }
    
}
