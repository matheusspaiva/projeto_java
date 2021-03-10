package data;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;       
import java.sql.ResultSet;


public class AtendimentoDao {
     Connection con;
    PreparedStatement st; //cria uma junção de comandos java com sql
    private ResultSet rs;
    
        public boolean conectar(){
       //tentará realizar a conexão 
       
        try {
            Class.forName("com.mysql.jdbc.Driver"); //mostra o drive que fará o caminho
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto","root","");  
           //indica onde está localizado a tabela
            return true;
        } catch (ClassNotFoundException ex) {
            return false;
        } catch (SQLException ex) {
            return false;
        }
        
    }
        
        public int salvar(Atendimento atendimento){
        int status;
        try {
            //indica o comando insert em sql para inserir os dados na tabela
            
            st = con.prepareStatement("INSERT INTO sac VALUES (?,?)");
            st.setString(1, atendimento.getEmail());
            st.setString(2, atendimento.getMensagem());
            
          status =  st.executeUpdate();
            return 1; // retorna 1
        } catch (SQLException ex) {
            //retornará erro referente a primary key(E-mail)
            return ex.getErrorCode();
        }
    }
        
         public void desconectar(){
        try {
            con.close();            
        } catch (SQLException ex) {
            
        }
    } 
    
}
