package Exam;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThread {
    
    public static void main(String[] args)
    {
        Thread p = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("My Name is Ananda Mia\n");
            }
        });
      
        p.start();
        
        
//        try {
//            A p = new A();
//            Thread t = new Thread(new A(), "Thread Ananda");
//            t.start();
//            t.join();
//            System.out.println(p.x);
//            System.out.println("Inside The Main Part: "+Thread.currentThread().getName());
//        } catch (InterruptedException ex) {
//            Logger.getLogger(MultiThread.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
    
}

class A implements Runnable
{
    static int x;
    public void run()
    {
        System.out.println("Inside The other Part: "+Thread.currentThread().getName());
        for(int i = 0; i < 10; ++i)
        {
            x++;
            try{
                Thread.sleep(50);
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}