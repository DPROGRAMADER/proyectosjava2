package personallibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static  Connection get_connection(){

        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mylibrary","root","");
            if(connection!= null){

                System.out.println("Conexion Exitosa");
            }

        }catch(SQLException e){
            System.out.println(e);
        }

        return connection;


    }
}
