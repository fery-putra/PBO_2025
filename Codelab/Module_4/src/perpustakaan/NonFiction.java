package perpustakaan;

public class NonFiction extends Book {
    public NonFiction(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("[Non-Fiction] Title: " + title + ", Author: " + author);
    }
}

