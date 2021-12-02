package oops;

public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThrones=new Book("George Martin","Game Of Thrones","fantasy",800);
        Book mathBook=new Book("James stewart","geometry","Math",780);
        Book javaBook=new Book("Joel Murach","Murach's java Programming","Programming",600);
        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();
    }
}
