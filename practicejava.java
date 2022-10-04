class emp{
    int id;
    String name;
    int salary;
    public void getname(String n)
    {
        name=n;
    }
    public int getid(){
        return id;
    }
    public int getsalary(){
        return salary;
    }
}

public class practicejava {

    public static void main(String[] args)
    {
      emp shubh=new emp();
      shubh.id=20;
      shubh.salary=46;
      shubh.getname("Shubham");
      shubh.getid();
      shubh.getsalary();

      System.out.println(shubh.salary);
      System.out.println(shubh.id);
      System.out.println(shubh.name);

    }
    
}
