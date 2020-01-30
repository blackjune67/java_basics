package object;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class ToStringTest {
    public static void main(String[] args) {
        Book book = new Book("영웅대전", "홍서방");
        System.out.println(book);

        String str = new String("빠밤");
        System.out.println(">>>>>>"+str.toString());
    }
}
