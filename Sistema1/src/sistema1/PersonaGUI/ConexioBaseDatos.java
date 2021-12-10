/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema1.PersonaGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hector Murillo
 */
public class ConexioBaseDatos {

    //Cadena que contiene la direccion de la base de datos
    String stringConexionBD = "jdbc:sqlite:/home/hector/Desktop/trabajo/db/Sistema.s3db";
    //Variable que establecera la conexion a la base de datos
    Connection conn = null;

    /**
     * constructor que inicializa la conexion de a la base de datos
     */
    public ConexioBaseDatos() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(stringConexionBD);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("Error de conexion" + e);
        }
    }

    /**
     * Este metodo se encarga de ejecutar una sentencia SQL
     *
     * @param strSentenciaSQL recibe una sentencia sql
     * @return 1 si la sentencia es ejecutada o 0 si no se ejecuta mas una
     * exception de tipo sql
     */
    public int ejecutarSentenciaSQl(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    /**
     * Este metodo recopita los datos de la base de datos
     * 
     * @param strSentenciaSQL recibe la sentencia sql
     * @return los datos que se encuentren en la base de datos 
     * si no hay datos regresa nulo.
     */
    public ResultSet consularRegistro(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
