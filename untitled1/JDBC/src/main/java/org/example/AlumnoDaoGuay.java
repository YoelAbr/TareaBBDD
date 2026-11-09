package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlumnoDaoGuay {

    /// /////////////////////////////////////////////////////////////////////////////////////////////
    public void insertarAlumno(Connection conn, Alumno alumno) {

        String sqlPreparada1 = """
                INSERT INTO alumnos VALUES (null,?,?,?)
                """;
        try(
                PreparedStatement insertPreparado = conn.prepareStatement(sqlPreparada1);
        ){
            insertPreparado.setString(1, alumno.getNombre());

            insertPreparado.setString(2, alumno.getCurso());

            insertPreparado.setString(3, alumno.getEmail());


            insertPreparado.executeUpdate();
            System.out.println("Inserción correcta");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    /// /////////////////////////////////////////////////////////////////////////////////////
    public ArrayList<Alumno> listarAlumnos(Connection conn) {
        String sqlPreparada4 = """
                SELECT * 
                FROM alumnos
                """;
        //Instanciamos el array que vamos a devovolver
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try(PreparedStatement selectPreparada = conn.prepareStatement(sqlPreparada4);
            ResultSet cursor = selectPreparada.executeQuery();)
        {
            while (cursor.next()){

                Alumno alumno = new Alumno(
                        cursor.getInt("id"),
                        cursor.getString("nombre"),
                        cursor.getString("curso"),
                        cursor.getString("email")
                );
                alumnos.add(alumno);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return alumnos;
    }

    /// ///////////////////////////////////////////////////////////////////////////////////

    public void visualizarAlumnos(Connection conn) {
        String sqlPreparada4 = """
                SELECT * 
                FROM alumnos
                """;
        try(PreparedStatement selectPreparada = conn.prepareStatement(sqlPreparada4);
            ResultSet cursor = selectPreparada.executeQuery();)
        {
            while (cursor.next()){
                Alumno alumno = new Alumno(
                        cursor.getInt("id"),
                        cursor.getString("nombre"),
                        cursor.getString("curso"),
                        cursor.getString("email")
                );
                System.out.println(alumno);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}