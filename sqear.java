class sqe{
int side;
public int area(){
    return side*side;
}
public int parameter(){
    return 4*side;
}

}
public class sqear {
    public static void main(String[] args) {
        sqe s=new sqe();

        s.side=3;
        System.out.println(s.area());
        System.out.println(s.parameter());
    }
}
