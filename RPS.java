import java.util.Random;
import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        
    
    Scanner scan =new Scanner(System.in);
    System.out.println("0 for rock , 1 for pepper , 2 for sessor");
    int userInput=scan.nextInt();
    Random random= new Random();
    int computerInput= random.nextInt(3);
     
    if(userInput==0&&computerInput==2||userInput==1&&computerInput==0||userInput==2&&computerInput==1)
    {
        System.out.println("You Win!");

    }
    else if(userInput==computerInput)
    {
        System.out.println("Draw");
    }
    else
    {
      System.out.println("You Lost");


    }

    System.out.println("Computer Input is"+computerInput);



}
}
