package perpustakaan;

public class Fiction extends Book {
    public Fiction(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("[Fiction] " + title + " by " + author);
    }
}
