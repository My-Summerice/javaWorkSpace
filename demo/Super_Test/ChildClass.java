package Super_Test;

public class ChildClass extends ParentClass {
    public ChildClass(int a, int b) {
        super(a, b);
    }

    @Override
    public void PrintChild() {
        super.PrintChild();
        System.out.println("This is ChildClass");
//        System.out.println(super.a + super.b);
    }
}
