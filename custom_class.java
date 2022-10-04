class Employe{
    int id;
    String name;
    int salary;


public void getingprint(){
    System.out.println( " my name is"+name);
    System.out.println( " my id is"+id);
    System.out.println( " my salary is"+salary);

}
}

public class custom_class {

    public static void main(String[] args) {
        
        Employe shubh =new Employe();
        Employe viju = new Employe();

        viju.id=13;
        shubh.id=12;
        shubh.name="Shubham";
        shubh.salary=43;
        shubh.getingprint();
        viju.getingprint();    
    }
}
