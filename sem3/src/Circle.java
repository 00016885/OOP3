public class Circle extends Shape {
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }


    public void calculateAre(){
        double area = Math.PI*radius*radius;
        System.out.println("Area:"+area);
    }


}
