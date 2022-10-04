class myEmployee{
    private int id;
    private String name;
   
    public myEmployee(){
    
        id=12;
         name="Shubham";

    
    // public void setId(int i){


    //     id =i;
    // }
    }

        public int getId(){
            return id;

        }
        public String getName(){
            return name;
        }
    
    }





public class constuctor {

    public static void main(String[] args) {
        
        myEmployee shubh = new myEmployee();
        System.out.println(shubh.getName());
        System.out.println(shubh.getId());

    }
    
}
