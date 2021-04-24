package WithInheritance;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10.5);
        Triangle triangle = new Triangle(10,10,10);
        Rectangle rectangle = new Rectangle(1.5,2.5,1.5,2.5);

        Paint paint = new Paint();

        paint.addShape(circle);
        paint.addShape(triangle);
        paint.addShape(rectangle);

        paint.printAll();
        System.out.println("--------");
        paint.drawAll();
        System.out.println("*************************************************");
        if (triangle.isEquilateral()) System.out.println("Triangle is Equilateral");
        else System.out.println("Triangle isn't Equilateral");

        if (rectangle.isSquare()) System.out.println("Rectangle is Square");
        else System.out.println("Rectangle isn't Square");

    }
}
