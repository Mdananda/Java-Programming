package TypeClass;

public class Dog extends Animal{

    public Dog(int legs) {
        super(legs);
    }

    @Override
    public String getDiets() {
        return "HH";
    }

    @Override
    public int getLeg() {
        return legs;
    }
    
    
    
    
}
