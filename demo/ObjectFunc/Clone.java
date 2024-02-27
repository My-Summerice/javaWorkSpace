package ObjectFunc;

public class Clone implements Cloneable {
    private String name;
    private int age;

    public Clone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.printf("name is : %s\nage is : %d\n", name, age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
