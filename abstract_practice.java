abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountainPen extends pen{
    void write(){
        System.out.println("Write");

    }
    void refill(){
        System.out.println("Rifill");

    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }

}

public class abstract_practice {
    
    public static void main(String[] args) {

        fountainPen fn= new fountainPen();
        
        fn.write();
        fn.changeNib();
    }
}
