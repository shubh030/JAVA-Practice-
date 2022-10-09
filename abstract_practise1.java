
class monkey{
    void jump(){
        System.out.println("Jumpingg............");

    }
    void bite(){
        System.out.println("Biting...........");
    
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class humman extends monkey implements BasicAnimal{
  void spick(){
    System.out.println("hello sir.......");
  }
  @Override
   public void eat()
   {
      System.out.println("Eating...........");
   }
   @Override
  public void sleep(){

    System.out.println("Sleeping...........");

   }

}
public class abstract_practise1 {

    public static void main(String[] args) {

        humman shubh = new humman();

        shubh.sleep();
        shubh.jump();

        monkey m1 = new humman();
        m1.jump();
        
    }
    
}
