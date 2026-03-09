public abstract class LibraryUser {
    String name;
    String userID;
    int borrovedBooks = 0;

    public LibraryUser(String name, String userID, int borrovedBooks) {
        this.name = name;
        this.userID = userID;
        this.borrovedBooks = borrovedBooks;
    }

    public abstract void BorrovBook(String bookName);
}
