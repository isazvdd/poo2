import java.util.*;


public class MousseMaracuja extends MenuComponentSobremesa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public MousseMaracuja(){        
    }
    
    public String getName(){
        return "Mousse de Maracujá";
    }
    
    public String getDescription(){
        return "Dona Zefinha";
    }
    
    public double getPrice(){
        return 15;
    }
    
    public boolean isVegetarian(){
        return true;
    }
    
    public String toString(){
        return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        
        System.out.print(", "+getPrice());
        System.out.print("     --  "+getDescription());
    }
}
