package DesingPattern;

public class Factory {
    
    public static void main(String[] args){
        
        SystemOs st = new SystemOs();
        OS ob =  st.getInstance("Sequre");
        ob.show();
        
    }
}
