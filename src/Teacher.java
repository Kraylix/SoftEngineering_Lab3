public class Teacher extends LibraryUser {

    public Teacher (String name, String userID, int borrovedBooks){
        super(name, userID, borrovedBooks);
    }


    @Override
    public void BorrovBook(String bookName){
        if (this.borrovedBooks < 5){
            System.out.println(this.name + this.userID + "has borroved " + bookName + "\nCurrent Borroved Books" + borrovedBooks);
            this.borrovedBooks++;
        }
        else{
            System.out.println(this.name + this.userID + "You've reached a limit!\nCurrent borroved Books: " + borrovedBooks);
        }
    }
}
