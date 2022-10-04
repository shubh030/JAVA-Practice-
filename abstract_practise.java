abstract class Parant{
public Parant(){
    System.out.println("i am abstract constructot=r");

} 
public void helo(){
    System.out.println("Hello");
}

abstract public void greet();

}

class child extends Parant{
    public void greet(){
        System.out.println("helo shubh");
    }
}

public class abstract_practise {
    public static void main(String[] args) {
        
    

    child c=new child();

    c.greet();
}
}