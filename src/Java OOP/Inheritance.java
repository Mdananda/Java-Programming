package Exam;

public class Inheritance {
   public static void main(String[] args){ 
       
       Jishan p = new Dipta();
       p.print();
       System.out.println(p.x);
               
       
   }
}

class Jishan{
    static int x = 10;
    
    public void print()
    {
        System.out.println("The Class Jishan");
        System.out.println(x);
    }
}

class Dipta extends Jishan{
    
    static int x = 100;
    @Override
    public void print(){
        System.out.println("The Class Dipta");
        System.out.println("The Class Dipta : "+x);
    }
    
}
