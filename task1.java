import java.util.Scanner;
import java.util.Arrays;
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
        if (num != 1 && num !=2 && num !=3) {
            System.out.println("error");
        }
        String [] author = new String[20];
        String [] book = new String[20];
        author[0] = "Turgenev";
        author[3] = "Puskin";
        book[0] = "Mumu";
        book[3] = "Ruslan i Ludmila";
        //System.out.println(Arrays.toString(author));
        //System.out.println(Arrays.toString(book));
        if (num == 1) {
            for (int i = 0; i < author.length; i++) {
                if (author[i] != null) {
                    System.out.print(book[i] + " - " + author[i]);
                    System.out.println();

                }
            }
        }
        if (num == 2) {
            in.nextLine(); //перевод курсора в начало строки
            System.out.print("Please input name of book: ");
            String newbook = in.nextLine();
            System.out.print("Please input name of author: ");
            String newauthor = in.nextLine();
            for (int i = 0; i < author.length; i++) {
                if (author[i] == null) {
                    book[i] = newbook;
                    author[i] = newauthor;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(author));
        System.out.println(Arrays.toString(book));
    }
}