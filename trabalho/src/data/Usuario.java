
package data;


public class Usuario {
    private String Email;
    private String Nome;
    private String Idade;
    private String Senha;
    
    // criaçao do construtor

    public Usuario() {
    }
    
    // metedo get e set 

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNome() {
        return Nome;
        
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
}
