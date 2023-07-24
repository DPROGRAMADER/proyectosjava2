package personallibrary;

public class LibraryModel {

    private int id_book;
    private String bookName;
    private String author;
    private String isbn;
    private int pages;
    private String category;

    public LibraryModel(){


    }

    public LibraryModel(String bookName, String author, String isbn, int pages, String category) {

        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.category = category;
    }

    public int getId_book() {
        return id_book;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
