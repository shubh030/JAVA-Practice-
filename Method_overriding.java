class A{
    public void meth1(){
        System.out.println(" i am method 1 of class A");
    }
    public void meth2() {
        System.out.println("i am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth1(){
        System.out.println("i am method 1 of class b");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
         A a=new A();
         B b=new B();
         a.meth1();
         b.meth1();
         b.meth2();
    }
    
}
