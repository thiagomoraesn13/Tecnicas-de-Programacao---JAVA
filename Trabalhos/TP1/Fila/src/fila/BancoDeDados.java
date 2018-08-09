
package fila;
import java.sql.*;

public class BancoDeDados {
    private static String url = "jdbc:mysql://localhost:3306/Cadastrar";
    private static String user = "root";
    private static String pass = "admin";
    protected static Connection conexao = null;
    
    public BancoDeDados(){       
        if(conexao == null) conecta();
    }
    private static boolean conecta(){
        try{
            conexao = DriverManager.getConnection(url,user,pass);
            return true;    
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public static boolean desconecta(){
        try {
            conexao.close();
            return true;
        }catch (SQLException e){
            return false;
        }
    }    
}
 