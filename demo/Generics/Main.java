package Generics;

public class Main {
    public static void main(String[] args) {
        AddNumber.addNumber(1.014697, 2);

        StringBuilder str = AddNumber.addString(new String[]{"a", "b"});
        AddNumber.addString(new String[]{String.valueOf(str), "再加一点", "试试还行不"});
    }
}
