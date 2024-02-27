package Super_Test;

public abstract class ParentClass {
    int a;
    int b;

    public ParentClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void PrintChild() {
        System.out.println("This is ParentClass");
    }
}

