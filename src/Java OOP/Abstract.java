package Exam;

public class Abstract{
    
    public static void main(String[] args)
    {
   
        Ananda x = new Shadin();
        x.print();
       
    }
    
}

class Shadin extends Ananda
{
    public Shadin()
    {
        System.out.println("The class is Shadin");
        
    }
    @Override
    public void print()
    {
        System.out.println("My Name is Ananda\n");
    }
    
    public void print2()
    {
        System.out.println("Print2() function");
    }
}

abstract class Ananda
{
    public Ananda()
    {
        System.out.println("Tha class Ananda");
    }
    public abstract void print();
}
