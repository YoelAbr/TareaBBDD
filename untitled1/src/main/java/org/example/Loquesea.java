package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Loquesea {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3308/dam_api";//siempre es así solo cambia el sitio y el puerto
        String user = "root";
        String password = "ChuckNorris2026";
        Connection con = DriverManager.getConnection(url, user, password);

       /* String sqlPreparada = """
               INSERT INTO alumnos VALUES (null,?,?,?)
                               """;
        PreparedStatement insertPreparado = con.prepareStatement(sqlPreparada);

        //Aquí hay que rellenar la sentencia preparada
        // Datos que pedimos a la usuarios
        // Datos de un formulario...
        insertPreparado.setString(1,"Álvaro");
        // INSERT INTO alumnos VALUES (null,"Álvaro",?,?)
        insertPreparado.setString(2,"1ºASIR");
        // INSERT INTO alumnos VALUES (null,"Álvaro","1ºASIR",?)
        insertPreparado.setString(3,"alvaro@damiansu.com");
        // INSERT INTO alumnos VALUES (null,"Álvaro","1ºASIR","alvaro@damiansu.com")

        insertPreparado.executeUpdate();




    }*/
        String sqlPreparada = """
                UPDATE alumnos SET nombre=? WHERE email ='alvaronuñes@damiansu.com'
                """;

        PreparedStatement updatePreparado = con.prepareStatement(sqlPreparada);
        updatePreparado.setString(1,"Rosa");
        updatePreparado.executeUpdate();
    }

}
