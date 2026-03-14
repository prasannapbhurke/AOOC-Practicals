package LibraryManagement;

public class LibraryDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", "ISBN12345");
        Member member1 = new Member("Prasanna", 101);

        System.out.println("=== Library System ===\n");

        book1.displayBook();
        System.out.println();
        member1.displayMember();
    }
}