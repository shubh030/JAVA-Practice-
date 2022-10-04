import java.util.*;
import java.util.Scanner;
public class string1{

  
    public static void main(String[] args) {
        
        String name="Shubham";
        String sname;
        sname="kale";
        String n;
       Scanner scan= new Scanner(System.in);
    
        System.out.println("Hii my name is " + name+ " and my sir name is "+sname);
        System.out.println("Whats Your name:");
         n =scan.nextLine();
        System.out.println("my name is "+n);
        System.out.println(n.indexOf('v'));

    }
}