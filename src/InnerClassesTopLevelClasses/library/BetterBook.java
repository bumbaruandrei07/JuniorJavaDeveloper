package InnerClassesTopLevelClasses.library;

import java.util.ArrayList;

public class BetterBook {
    private ArrayList<Page> pages = new ArrayList<Page>();

    public BetterBook(int noPages) {
        // first, allocate the space for all pages because the (real)
        // number of pages is needed when initializing a book
        for (int i = 0; i < noPages; i++) {
            pages.add(null);
        }
        for (int i = 0; i < noPages; i++) {
            pages.set(i, new Page(i + 1));
        }
    }

    // Replace 'getPage(pageNo)' method with 'getPageContent(pageNo)'
    public String getPageContent(int pageNo) {
        if (pageNo < 1 || pageNo > pages.size()) {
            return "Page not found!";
        }
        return pages.get(pageNo - 1).getText(); //metoda din Page care returneaza textul
    }


    public IPage getPage(int pageNo) {
        if (pageNo < 1 || pageNo > pages.size()) {
            return null;
        }
        return pages.get(pageNo - 1);
    }

    // inner class definition. Now implementing IPage interface
    private class Page implements IPage {
        private int pageNo;
        private String text;

        public Page(int pageNo, String text) {
            this.pageNo = pageNo;
            this.text = text + "\nPage: " + pageNo + " of: " + BetterBook.this.pages.size();
        }

        public Page(int pageNo) {
            this(pageNo, "");
        }

        @Override
        public String getText() {
            return this.text;
        }

        @Override
        public void setText(String text) {
            this.text = text;
        }

        @Override
        public int getPageNo() {
            return this.pageNo;
        }
    }
}