import java.util.Random;
import java.util.Scanner;
class Game{
    int inputNumber;
    int number;
    int noOfguesses;

    Game(){
        Random rand = new Random();
        this.number=rand.nextInt(100);

    }
    public int getnoOfguesses() {
        return noOfguesses;

    }
    public void setnoOfguesses(int noOfguesses)
    {
        this.noOfguesses=noOfguesses;
    }
    void takeInputNumber(){
        System.out.println("Guess the number:");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
    boolean iscorrectNumber(){
        noOfguesses++;

        if(inputNumber==number)
        {
            System.out.format(" Yes ypu guessed It ! in %d",noOfguesses+"Of guesses");
            return true;
        }
        else if(inputNumber<number)
        {
            System.out.println("You are low !");
        }
        else if(inputNumber>number){
            System.out.println("you are high !");
        }
        return false;
    }
}
public class gessTheNumber {
    public static void main(String[] args) {
    Game g=new Game();
    boolean b=true;
    while(!b){
        g.takeInputNumber();
        b=g.iscorrectNumber();
    }
    }
}
