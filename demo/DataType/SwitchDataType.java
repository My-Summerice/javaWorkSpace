package DataType;

public class SwitchDataType {
    void funcSwitchSuccess(String s) {
        switch (s) {
            case "a":
                System.out.println("aaa");
                break;
            case "b":
                System.out.println("bbb");
                break;
        }
    }

    // 可以看出，switch不支持Long/long类型
//    void funcSwitchFail(Long l) {
//        switch (l) { // Incompatible types. Found: 'long', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
//            case 111:
//                System.out.println(111);
//                break;
//            case 222:
//                System.out.println(222);
//                break;
//        }
//    }
}
