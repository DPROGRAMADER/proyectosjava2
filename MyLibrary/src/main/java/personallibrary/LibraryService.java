package personallibrary;

import java.util.Scanner;

public class LibraryService {

    static Scanner sc = new Scanner(System.in);

    public static void createBook(){
        System.out.println("Ingrese el nombre del libro: ");
        String bookName = sc.nextLine();
        System.out.println("Ingrese el nombre del autor");
        String author = sc.nextLine();
        System.out.println("Ingrese el ISBN");
        String isbn = sc.nextLine();
        System.out.println("Ingrese el número de páginas");
        int pages = sc.nextInt();
        System.out.println("Ingrese la categoria");
        String category = sc.next();

        LibraryModel registerBook = new LibraryModel();

        registerBook.setBookName(bookName);
        registerBook.setAuthor(author);
        registerBook.setIsbn(isbn);
        registerBook.setPages(pages);
        registerBook.setCategory(category);

        LibraryDAO.registerBookDB(registerBook);


    }

    public static  void listBook(){

        LibraryDAO.listBookDB();

    }







}
