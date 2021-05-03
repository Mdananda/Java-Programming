package StringType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class srvr {
    
    public static void main(String[] args) throws IOException{  
        ServerSocket ss = new ServerSocket(2000);
        Socket soc = ss.accept();
        
        FileInputStream fis = new FileInputStream("");
        File f = new File("");
        
        int ln = (int)f.length();
        byte[] bos = new byte[ln];
        fis.read(bos, 0, ln);
        
        OutputStream os = soc.getOutputStream();
        os.write(bos); 
        os.close();    
    }
    
}
