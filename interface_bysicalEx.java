import java.util.*;
interface bysical {
    void bysicalSpeed(int increment);
    void bysicalBrek(int decrement);
}
class AvonCycal implements bysical{
    public void bysicalSpeed(int increment){
    System.out.println("Speeed up");
    }

    public void bysicalBrek(int decrement) {
        System.out.println("breek the cycle");
        
    }
}

public class interface_bysicalEx {
    public static void main(String[] args) {
        AvonCycal A =new AvonCycal();
         A.bysicalBrek(2);
         A.bysicalSpeed(10);
    }
    
}
