import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input your name: ");
        String myname = in.nextLine();
        System.out.println("Hello " + myname + "!!!");
        System.out.println(myname + " enter the number. What do you want to do? ");
        System.out.println("1. Show a list of books");
        System.out.println("2. Add book to library");
        System.out.println("3. Remove book from library");
        System.out.print(">- ");
        int num = in.nextByte();

    }
}