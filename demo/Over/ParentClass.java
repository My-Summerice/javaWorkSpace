package Over;

public class ParentClass {
    private String field;

    public ParentClass(String field) {
        this.field = field;
    }

    public void Print() {
        System.out.println("this is parent");
    }

    public void Print(String str) {
        System.out.printf("this is %s", str);
    }
}
