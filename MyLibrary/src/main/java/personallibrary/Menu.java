package personallibrary;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);


    public void menuApp(){

        int opc;

        do{

            System.out.println("------------------------------");
            System.out.println("Sistema Personal de Biblioteca");
            System.out.println("<<<<<<Menú>>>>>");
            System.out.println("1. Registrar libro\n" +
                    "2. Actualizar Libro\n" +
                    "3. Listar libros\n" +
                    "4. Borrar registro de Libro\n" +
                    "5. Salir de la aplicación\n");
            System.out.println("------------------------------------");

            System.out.println("Seleccione una Opción: ");

            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("1. Registrar libro\n");
                    LibraryService.createBook();
                    break;
                case 2:
                    System.out.println("2.Actualizar datos del libro\n");
                    break;
                case 3:
                    System.out.println("Listar registro de libros\n");
                    LibraryService.listBook();
                    break;
                case 4:
                    System.out.println("Eliminar registro de libro\n");
                    break;
                case 5:
                    System.out.println("Salir de la aplicación\n");
                    break;
                default:
                    System.out.println("Seleccion una opción valida");
            }
        }while(opc!= 5);
    }
}
