
/**
 * Escreva uma descrição da classe MenuSobremesa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MenuSobremesa extends MenuComponentSobremesa 
{
   ArrayList<MenuComponentSobremesa> menuComponents = new ArrayList<MenuComponentSobremesa>();
    
   public MenuSobremesa(){
       
   }
    
   public void add(MenuComponent menuComponent){
       menuComponents.add(menuComponent);
   }
    
   /*
   public void remove(MenuComponent menuComponent){
       menuComponents.remove(menuComponent);
   }
   */
    
   public MenuComponentSobremesa getChild(int i){
        return menuComponents.get(i);
   }
          
   public String toString(){
       String res = "\n"+getName()+",  "+getDescription()+(isVegetarian()?"(V)":"")+"---------------------";
       for(MenuComponentSobremesa m:menuComponents){
           res += m.toString();
       }
       return res;
   }
    
   public void print(){
       System.out.print("\n"+getName()+ (isVegetarian() ? " (V)": "") );
       System.out.print(",  "+getDescription());
       System.out.print("---------------------");
       for(MenuComponentSobremesa m:menuComponents){
           m.print();
       }
   }
   
   public boolean isVegetarian(){
       boolean veg = true;
       for(MenuComponentSobremesa m:menuComponents){
           veg = veg && m.isVegetarian();
       }
       return veg;
   } 
}
