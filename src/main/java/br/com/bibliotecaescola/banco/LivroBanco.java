package br.com.bibliotecaescola.banco;

import br.com.bibliotecaescola.construtores.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class LivroBanco {
    
    private final Connection conexao;
    
    public LivroBanco(Connection connection){
        this.conexao = connection;    
    }
    
    public void insert(Livro livro) throws SQLException{
        String sql = "insert into livro(nome,genero,autor,editora) values ('"+livro.getNome()+"','"+livro.getGenero()+"','"+livro.getAutor()+"','"+livro.getEditora()+"')";
        
    PreparedStatement statement = conexao.prepareStatement(sql);
            statement.execute();
            
            conexao.close();
    }
    
}
