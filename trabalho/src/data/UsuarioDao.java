
package data;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UsuarioDao {
    //classe com conexão ao banco de dados 
    
    private Connection con;
    private PreparedStatement st; //cria uma junção de comandos java com sql
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
    
    public int salvar(Usuario usuario){
        int status;
        try {
            //indica o comando insert em sql para inserir os dados na tabela
            
            st = con.prepareStatement("INSERT INTO usuario VALUES (?,?,?,?)");
            st.setString(1, usuario.getEmail());
            st.setString(2, usuario.getNome());
            st.setString(3, usuario.getIdade());
            st.setString(4, usuario.getSenha());
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
            
    public Usuario consultar(String email){
        try {
            // comando SElECT de sql para consultar dados referente ao email digitado
            Usuario usuario = new Usuario();
            st = con.prepareStatement("SELECT * FROM usuario WHERE email = ?");
            st.setString(1, email);
            rs = st.executeQuery();
            
            if(rs.next()){
                //caso encontre dados vão ser armazenados na classe usuario
                usuario.setEmail(rs.getString("Email"));
                usuario.setNome(rs.getString("Nome"));
                usuario.setIdade(rs.getString("Idade"));
                usuario.setSenha(rs.getString("Senha"));
                return usuario;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }       
    }
    
    public boolean excluir(String email){
        try {
            st = con.prepareStatement("DELETE FROM usuario WHERE email = ?;");
            st.setString(1, email);
            //deleta o email que foi digitado
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
}
