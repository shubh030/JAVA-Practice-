class ekclass{
ekclass(int a)
{
    this.a = a;
    System.out.println("a is ");
}
}
class doclass extends ekclass{

    doclass(int c){
           super(c);
        System.out.println("i am constructor");

    }

}

public class practice_super {
    public static void main(String[] args) {
        ekclass e=new ekclass(4);
    }
    
}
