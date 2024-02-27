package Generics;

public class GenericMethodExample {
    // 该泛型方法可以接受一个泛型数组的参数，并根据不同类型返回对应相加的结果
    // Number 数组：将数组的元素转为 double 类型相加后返回
    // String 数组：将数组的元素逐个拼接后返回
    public static <T> String processArray(T[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        if (array[0] instanceof Number) {
            double sum = 0.0;
            for (T element : array) {
                if (element instanceof Number) {
                    sum += ((Number) element).doubleValue();
                } else {
                    throw new IllegalArgumentException("Array contains non-numeric elements");
                }
            }
            return Double.toString(sum);
        } else if (array[0] instanceof String) {
            StringBuilder sb = new StringBuilder();
            for (T element : array) {
                if (element instanceof String) {
                    sb.append((String) element);
                } else {
                    throw new IllegalArgumentException("Array contains non-string elements");
                }
            }
            return sb.toString();
        } else {
            throw new IllegalArgumentException("Unsupported array type");
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Double[] decimalNumbers = {1.5, 2.5, 3.5};
        String[] strings = {"Hello", " ", "World"};

        String sum = processArray(numbers);
        System.out.println("Sum of numbers: " + sum);

        sum = processArray(decimalNumbers);
        System.out.println("Sum of decimalNumbers: " + sum);

        String concatenatedString = processArray(strings);
        System.out.println("Concatenated string: " + concatenatedString);
    }
}
