package TypeClass;

public class ClassLast {
    
    private Animal[] animals;
    public ClassLast(Animal[] animals)
    {
        this.animals = animals;
    }
    
    public void PrintDietsOfAerLlanimal()
    {
        for(Animal animal: animals)
        {
            String Diets = animal.getDiets();
            int leg = animal.getLeg();
            String name = animal.getClass().getSimpleName();
            System.out.println(name + "   eats   " + Diets + "Legs Num : " + leg);
        }
    }
    
    
}
