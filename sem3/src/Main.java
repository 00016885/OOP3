//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //////////////Task1
        Book book = new Book("Something", 500.50, "Someone");

        book.displayInfo();


        //////////Task2
        Engineer engineer = new Engineer(
                "Tom",
                "IT",
                "NA"
        );

        engineer.displayInfo();
//////////////Task3

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(10, 20);

        for (Shape shape:shapes){
            shape.calculateArea();
        }


/////////////////Task4

        PremiumMobileApp premiumMobileApp = new PremiumMobileApp(
                "Intranet",
                "1.01",
                "Adnroid",
                5
        );

        premiumMobileApp.displayDetails();
    }
}