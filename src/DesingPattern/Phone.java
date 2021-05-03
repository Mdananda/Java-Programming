package BuilderPattern;

public class Phone {
    
    private String name;
    private int ram;
    
    public Phone(String name, int ram)
    {
        super();
        this.name = name;
        this.ram = ram;
    }
    
    public void print()
    {
        System.out.print(name);
        System.out.println(" "+ram);
    }
    
}
