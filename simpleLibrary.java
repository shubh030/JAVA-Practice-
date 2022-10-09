class Library{
    String[] books;
    int no_of_book;

    Library(){
     this.books=new String[100];
     this.no_of_book=0;
    }

    void addbooks(String book)
    {
      this.books[no_of_book]=book;
      no_of_book++;
      System.out.println(book+" has been added");

       
    }
    void Showbook(){

        for(String book :this.books){
            if(book==null){
                continue;
            }
            System.out.println("*"+book);
        }
    }
    void issubook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                this.books[i]=null;
                System.out.println("The book is issued");
                return;
            }
        }
          System.out.println("the book is not Exist");

        
    }

}
      
    

public class simpleLibrary {
    public static void main(String[] args) {

        Library L= new Library();
        L.addbooks("The Alchemest");
        L.addbooks("Aotoimic Habbits");
        L.addbooks("Power Of Subconsies Mind");
        L.Showbook();
      
        L.issubook("The Alchemest");
        L.Showbook();
        
    }
    
}
