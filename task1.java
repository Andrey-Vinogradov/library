 import java.util.Scanner;
 import java.util.Arrays;
 public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input your name: ");
        String myname = in.nextLine();
        System.out.println("Hello " + myname + "!!!");
        System.out.println(myname + " enter the number. What do you want to do? ");
        //System.out.println("1. Show a list of books");
        //System.out.println("2. Add book to library");
        //System.out.println("3. Remove book from library");
        //System.out.println("4. Exit");
        //System.out.print(">- ");
        //int num = in.nextByte();

        String[] author = new String[20];
        String[] book = new String[20];
        author[0] = "Turgenev";
        author[3] = "Puskin";
        book[0] = "Mumu";
        book[3] = "Ruslan i Ludmila";
        //System.out.println(Arrays.toString(author));
        //System.out.println(Arrays.toString(book));
        loop:for (; ;)
         {
            System.out.println("******************************|");
            System.out.println("| 1. Show a list of books     |");
            System.out.println("| 2. Add book to library      |");
            System.out.println("| 3. Remove book from library |");
            System.out.println("| 4. Exit                     |");
            System.out.println("|*****************************|");
            System.out.println();
            System.out.print(">- ");
            int num = in.nextByte();
            if (num != 1 && num != 2 && num != 3 && num != 4) {
                System.out.println("error");
            }

            if (num == 4) {
                in.nextLine(); //перевод курсора в начало строки
                System.out.print("Do you really want to exit?: ");
                String answer = in.nextLine();
                if (answer == "y" || answer == "yes") {
                    System.out.print("Bye...");
                    break;
                }
              break loop;
            }

            if (num == 1) {
                for (int i = 0; i < author.length; i++) {
                    if (author[i] != null) {
                        System.out.println(book[i] + " - " + author[i]);
                    }
                }
                System.out.println();
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
            if (num == 3) {
                in.nextLine(); //перевод курсора в начало строки
                System.out.print("Choose a number, what book do you want to delete?: ");
                for (int i = 0; i < author.length; i++) {
                    if (book[i] != null) {
                        System.out.println(i + "." + book[i] + " - " + author[i]);
                    }
                }
                System.out.println();
                System.out.print(">- ");
                int dellbook = in.nextByte();
                book[dellbook] = null;
                author[dellbook] = null;
            }
            //System.out.println(Arrays.toString(author));
            //System.out.println(Arrays.toString(book));

        }
    }
 }