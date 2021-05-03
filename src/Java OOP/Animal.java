package TypeClass;

public abstract class Animal {
    
    public int legs;
    
    public Animal(int legs)
    {
        this.legs = legs;
    }
    
    public abstract String getDiets();
    public abstract int getLeg();
}
