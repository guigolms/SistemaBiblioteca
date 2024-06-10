package br.com.bibliotecaescola.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao{

    
    public Connection getConnection() throws SQLException, ClassNotFoundException{      
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","");
        return conexao;
    }

}
