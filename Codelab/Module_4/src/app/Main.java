package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Fiction("Howl's Moving Castle", "Diana Wynne Jones");
        Book book2 = new NonFiction("Atomic Habits", "James Clear");

        book1.displayInfo();
        book2.displayInfo();
        System.out.println();

        Member member1 = new Member("Fery", "A013");
        Member member2 = new Member("Fera", "H426");
        member1.getName();
        member2.getName();
        System.out.println();

        member1.lendBook("Howl's Moving Castle");
        member2.lendBook("Atomic Habits", 7);
        System.out.println();
        member1.returnBook("Howl's Moving Castle");
        member2.returnBook("Atomic Habits");
    }
}
