package Interface;

public class Main {
    public static void main(String[] args) {
        Circle draw = new Circle(1.2);

        draw.draw();

        double area = draw.calculateArea();
        System.out.println("Area: " + area);
        System.out.println(draw.A);
    }
}
