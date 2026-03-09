import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args)
    {
        Student student1 = new Student("Maksym", "EN74097", 2);
        Student student2 = new Student("Ivan", "EN74096", 0);
        Student student3 = new Student("Dmytro", "EN71610", 3);

        Teacher teacher1 = new Teacher("Omar", "11111", 3);
        Teacher teacher2 = new Teacher("Tariq", "01011", 5);
        Teacher teacher3 = new Teacher("Edip", "00001", 0);


        System.out.println("1. Log in");
        System.out.println("2. Exit");
        System.out.print("Your option: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("\n1. Student");
                System.out.println("2. Teacher");
                System.out.print("Your option: ");
                int roleChoice = scanner.nextInt();

                System.out.print("Enter userID: ");
                String userId = scanner.next();

                System.out.println();

                if (roleChoice == 1)
                {
                    if (userId.equals(student1.userID))
                    {
                        System.out.println(student1.name + " has number of borrowed books: " + student1.borrovedBooks);
                    } else if (userId.equals(student2.userID))
                    {
                        System.out.println(student2.name + " has number of borrowed books: " + student2.borrovedBooks);
                    } else if (userId.equals(student3.userID))
                    {
                        System.out.println(student3.name + " has number of borrowed books: " + student3.borrovedBooks);
                    } else
                    {
                        System.out.println("Student with such userID is not found!");
                    }
                }
                else if (roleChoice == 2)
                {
                    if (userId.equals(teacher1.userID))
                    {
                        System.out.println(teacher1.name + " has number of borrowed books: " + teacher1.borrovedBooks);
                    }
                    else if (userId.equals(teacher2.userID))
                    {
                        System.out.println( teacher2.name + " has number of borrowed books: " + teacher2.borrovedBooks);
                    }
                    else if (userId.equals(teacher3.userID))
                    {
                        System.out.println(teacher3.name + " has number of borrowed books: " + teacher3.borrovedBooks);
                    }
                    else
                    {
                        System.out.println("Teacher with such userID is not found!");
                    }
                }
                else
                {
                    break;
                }
            case 2:
                break;

            default:
                System.out.println("Unknown command, choose 1 or 2 only!");
                break;
        }
    }
};