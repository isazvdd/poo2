
public abstract class Duck
{
    protected QuackBehavior quackBehavior;
    
    public abstract void display();
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void setQuackBehavior(QuackBehavior q){
        quackBehavior = q;
    }
}
