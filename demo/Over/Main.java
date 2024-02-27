package Over;

public class Main {
    public static void main(String[] args) {
        OverRide overRide = new OverRide("override");
        overRide.Print();   // this is override

        ParentClass overLoad = new ParentClass("overload");
        overLoad.Print();   // this is parent
        overLoad.Print("overload"); // this is overload
    }
}
