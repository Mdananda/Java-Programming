package TypeClass;

public class Class01 {
    
    public static void main(String args[])
    {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog(4);
        animals[1] = new Dog(2);
        ClassLast abc = new ClassLast(animals);
        abc.PrintDietsOfAerLlanimal();
    }
    
}