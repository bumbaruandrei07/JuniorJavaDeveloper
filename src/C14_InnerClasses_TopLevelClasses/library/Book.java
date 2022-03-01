package C14_InnerClasses_TopLevelClasses.library;

import java.util.ArrayList;


//Page exista doar daca exista un obiect de tip book
//fiecare obiect are implementare de page
//clasa interna depinde de obiectul din care face parte si nu poate exista in afara obiectului
//daca acesta def a clasei o sa exista in obiecte de tip book, daca vrem sa fol. un cosntructor, trebuie sa-l accesam printr-un obiect de tip book
// book site sa creeze , toate metodele lui page, o sa creem un obiect de acest tip
//page un exista in alt context, decat in contextul unui obiect book
//la mostenire putea sa existe stand-alone, aici nu, depinde direct de alt obiect (book)
//daca o declaram publica -> putem accesa

public class Book {
    private ArrayList<Page> pages = new ArrayList<Page>();

    public Book(int noPages) {
        // first, allocate the space for all pages because the (real)
        // number of pages is needed when initializing a book
        for (int i=0; i<noPages; i++) {
            pages.add(null);
        }
        for (int i=0; i<noPages; i++) {
            pages.set(i, new Page(i + 1));
        }
    }

    public Page getPage(int pageNo) {
        if (pageNo < 1 || pageNo > pages.size()) {
            return null;
        }
        return pages.get(pageNo - 1);
    }

    // inner class definition:
    // daca e interna e super specifica obiectului -> in mod normal ar trebui sa fie PRIVATE !
    public class Page {
        private int pageNo;
        private String text;

        public Page(int pageNo, String text) {
            this.pageNo = pageNo;
            this.text = text + "\nPage: " + pageNo + " of: " + Book.this.pages.size();
        }

        public Page(int pageNo) {
            this(pageNo, "");
        }

        public String getText() {
            return this.text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getPageNo() {
            return this.pageNo;
        }
    }
}