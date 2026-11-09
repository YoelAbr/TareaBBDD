package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class PrincipalGuay {

    public static void main(String[] args) {

        AlumnoDaoGuay daoGuay = new AlumnoDaoGuay();
        try (
                Connection conn = ConexionBD.getConnection();
        ){
            System.out.println("Conexión con la clase ConexionBD correcta");

            ArrayList<Alumno> alumnos = daoGuay.listarAlumnos(conn);
            for(Alumno a : alumnos){
                System.out.println(a);
            }


            Alumno alum = new Alumno("Cholo","2ºDAM","cholo@forever.com");
            daoGuay.insertarAlumno(conn,alum);
            System.out.println("-----");
            daoGuay.visualizarAlumnos(conn);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
