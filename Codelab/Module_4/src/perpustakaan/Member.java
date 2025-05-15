package perpustakaan;

public class Member implements Lending {
    private String name;
    private String memberID;

    public Member(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
    }


    public void lendBook(String title) {
        System.out.println(name + " borrow a book: " + title);
    }

    public void lendBook(String title, int duration) {
        System.out.println(name + " borrow a book: " + title + " for " + duration + " days.");
    }

    @Override
    public void returnBook(String title) {
        System.out.println(name + " return a book: " + title);
    }

    public String getName() {
        System.out.println("Member: "  + name + " (ID :"  + memberID + ")");
        return name;
    }
}

