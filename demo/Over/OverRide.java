package Over;


public class OverRide extends ParentClass {
    public OverRide(String field) {
        super(field);
    }

    @Override
    public void Print() {
        System.out.println("this is override");
    }
}
