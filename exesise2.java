class cyener{
    private int radius;
    private int height;

public int getHeight(){
    return height;
}
public void setHeight(int height)
{
  this.height=height;
}
public int getRadius(){
    return radius;
}
public void setRadius(int radius)
{
    this.radius=radius;
}
public double getsurfacearea(){
    return 2*3.142* radius * radius+2*3.142*radius  * height;
} 

public cyener(int radius ,int height){
    this.radius=radius;
    this.height=height;
}
}
public class exesise2 {
 public static void main(String[] args) {

    cyener s=new cyener(9,12);
    // s.setHeight(56);
    // s.setRadius(25);
    System.out.println(s.getHeight());
    System.out.println(s.getRadius()); 
System.out.println(s.getsurfacearea());

 }

    
}

