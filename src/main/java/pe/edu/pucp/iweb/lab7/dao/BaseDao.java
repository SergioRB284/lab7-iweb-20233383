package pe.edu.pucp.iweb.lab7.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Ejercicio 2a: DAO base.
 *
 *  - Esta clase debe ser ABSTRACTA.
 *  - SedeDao y EquipoDao deben heredar de ella y obtener la conexión
 *    únicamente con getConnection().
 */
public abstract class BaseDao { // TODO 2a: convertir en clase abstracta

    public Connection getConnection() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }

        String USER = "root";
        String PASS = "12345678";
        String URL = "jdbc:mysql://localhost:3306/telecom_andina";

        return DriverManager.getConnection(URL, USER, PASS);
    }

}
