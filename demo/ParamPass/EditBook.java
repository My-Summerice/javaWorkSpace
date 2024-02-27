package ParamPass;

public class EditBook {
    public static void main(String[] args) {
        Book book = new Book("《Java 从入门到放弃》");
        System.out.println(book.getName());
        System.out.println(book.getObjectAddress());

        // 测试修改书名
        editBook(book);

        System.out.println(book.getObjectAddress());
        System.out.println(book.getName());
    }

    private static void editBook(Book book) {
        System.out.println(book.getObjectAddress());

//        book = new Book("真的吗？");
        book.setName("学不动了");

        System.out.println(book.getName());
        System.out.println(book.getObjectAddress());
    }
}
