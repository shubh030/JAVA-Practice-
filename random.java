import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random= new Random();
        int computerInput= random.nextInt(1,9);

        System.out.println(computerInput);
        
    }
}
