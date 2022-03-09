package InnerClassesTopLevelClasses.main;

import InnerClassesTopLevelClasses.library.BetterBook;
import InnerClassesTopLevelClasses.library.Book;
import InnerClassesTopLevelClasses.library.IPage;

public class Bookkepper {

    public static void main(String[] args) {
        //page exista doar cu un context de tipul book -> referinta va fi  masterOfTheGame !
        Book masterOfTheGame = new Book(463);

        // Book - este referinta
        // masterOfTheGame este obiectul

        //creez un obiect de tipul page, ne trebuie contextul de tipul Book


        Book.Page page23 = masterOfTheGame.new Page(23);
        Book.Page page3 = masterOfTheGame.getPage(3);

        // The following 4 attempts to (wrongly) initialize a page will produce errors:
//    Book.Page page2 = new Page(23);
//    Book.Page page100 = new masterOfTheGame.Page(23);
//    Book.Page page1 = Book.new Page(23);
//    Book.Page page1 = new Book.Page(23);
//        System.out.println(page3.getText());


        BetterBook masterOfTheGame2 = new BetterBook(463);

        // methods called only on Book instances
        System.out.println(page3.getText());
        System.out.println(masterOfTheGame2.getPageContent(3));


        //There are always two ways to implement:

        // 1.  Using encapsulation:
        BetterBook masterOfTheGame3 = new BetterBook(463);
        System.out.println(masterOfTheGame3.getPageContent(3));

        // 2. Using an Interface to refer the internal object:
        IPage page4 = masterOfTheGame3.getPage(3);
        System.out.println(page4.getText());

    }
}
