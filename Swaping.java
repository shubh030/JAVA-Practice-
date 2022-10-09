public class Swaping {

public static void main(String[] args) {
    
//LOGIC 1   THIRD VARIABLE
int a, b;
a=10;
b=20;
System.out.println("Before swaping"+a+" "+b);
int t;
t=a;
a=b;
b=t;
System.out.println("After swaping"+a+" "+b);


//LOGIC 2  use + -      without using third variable

 a=a+b;
 b=a-b;
 a=a-b;
 System.out.println("2 After swaping"+a+" "+b);

 //LOGIC 3  use * /      without using third variable

 a=a*b;
 b=a/b;
 a=a/b;

 System.out.println("3 After swaping "+ a+" "+b);



}
}
