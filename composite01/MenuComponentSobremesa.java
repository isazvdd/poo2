
/**
 * Escreva uma descrição da classe MenuComponentSobremesa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class MenuComponentSobremesa
{
    public void add (MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    
    /* 
    public void remove (MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    */
    
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    
    public String getName(){
        throw new UnsupportedOperationException();
    }
    
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
            
    public void print(){
    }
    
    public boolean isVegetarian(){
        return false;
    }
}
