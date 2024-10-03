public class Rectangle extends Shape {
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    public void calculateArea() {
        double area = length*width;
        System.out.println("Area:"+area);

    }
}
