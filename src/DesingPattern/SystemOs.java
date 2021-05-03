package DesingPattern;

public class SystemOs {
    
    public OS getInstance(String nm)
    {
        if(nm.equals("Open"))
            return new Android();
        else if(nm.equals("Sequre"))
        {
            return new IOS();
        }
        else
           return null;
    }
    
}
