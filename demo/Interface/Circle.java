package Interface;

public class Circle implements Drawable {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        // 实现绘制圆的逻辑
        System.out.println("Drawing a circle");
    }

    @Override
    public double calculateArea() {
        // 实现计算圆面积的逻辑
        return Math.PI * radius * radius;
    }
}
