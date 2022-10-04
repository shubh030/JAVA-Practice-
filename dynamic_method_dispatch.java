class phone {
    public void showTime(){
        System.out.println("Time");
    }
    public void call(){
        System.out.println("calling");

    }


}
class smartphone extends phone {
 public void showTime(){
    System.out.println("Time");
 }
 public void play(){
    System.out.println("music");
 }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj= new smartphone();

        obj.call();
        // obj.play(); // not Alloed
    }
    
}
