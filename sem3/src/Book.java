public class Book extends Product{
    String author;

    public Book(String name, double price, String author){
        super(name, price);
        this.author=author;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author:"+author);
    }

}
