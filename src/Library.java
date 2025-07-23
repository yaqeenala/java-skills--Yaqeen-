public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 208);
        Book book2 = new Book("1984", "George Orwell", 328);
        Textbook textBook = new Textbook("Introduction to Java", "Herbert Schildt", 720, "Computer Science", 8);
        book1.borrowBook();
        book2.borrowBook();
        textBook.borrowBook();
        book1.returnBook();
        book2.returnBook();
        textBook.returnBook();
        book1.displayInfo();
        book2.displayInfo();
        textBook.displayInfo();
    }
}
