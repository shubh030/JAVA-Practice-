class base {
    public int x;
  base(){
    System.out.println("i am constructor");
  }

    base(int x) {
        System.out.println("this is value of x is " + x);

    }



}
class base2 extends base{

    base2(int x, int y) {
        super(x);
      
       System.out.println("value of y "+ y);
    }

}
public class constructor_withA_inheritance {
    public static void main(String[] args) {
        // base b= new base();
        base2 a=new base2(4,5);

        
        
    }
}
