
package br.com.projetoDAO.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexao {
    static  final private String USER = "root";
    static final private String PASS = "!@#Abc123";
    static final private String URL = "jdbc:mysql://localhost:3306/projetoDAO?useTimezone=true&serverTimezone=UTC";
    
    
    public static Connection conectar(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            return conn;
        } catch (SQLException ex) {
            System.out.println("Não foi possivel conectar."+ex);
            return null;
        }
    }
    public static void desconectar(Connection conexao){
        try {
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Não foi possivel desconectar."+ex);
        }
    }
}
