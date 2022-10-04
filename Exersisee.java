class circal{
public int Radius;
circal(int r){

    this.Radius =r;
}

public double area(){
    return Math.PI*this.Radius*this.Radius;
}
}
class Contaner extends circal
{
public int height;

Contaner(int r, int h)
{
    super(r);
    this.height = h;
}
public double volume(){
    return Math.PI*this.Radius*this.Radius*height;
}

}
public class Exersisee{
    public static void main(String[] args) {

        // circal ck= new circal(6);
        Contaner Co=new Contaner(5,6);


        // System.out.println(ck.area());
        System.out.println(Co.volume());

        

        
    }
}