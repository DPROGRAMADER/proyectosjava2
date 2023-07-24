package personallibrary;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main( String [] args){

        Menu menu = new Menu();

        menu.menuApp();
        /*
        try(Connection cnx = Conexion.get_connection()){

        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
        |*/
    }
}
