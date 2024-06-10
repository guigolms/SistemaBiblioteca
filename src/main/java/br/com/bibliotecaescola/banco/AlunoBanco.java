package br.com.bibliotecaescola.banco;

import br.com.bibliotecaescola.construtores.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoBanco {
    
    private final Connection connection;

    public AlunoBanco(Connection connection) {
        this.connection = connection;
    }
     
    public void insert(Aluno aluno) throws SQLException{
                   
            String sql = "insert into aluno(nome,serie,turma) values ('"+aluno.getNome()+"','"+aluno.getSerie()+"','"+aluno.getTurma()+"')";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
            
        
    }
}
