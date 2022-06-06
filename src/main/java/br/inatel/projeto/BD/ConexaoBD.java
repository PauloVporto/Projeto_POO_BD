package br.inatel.projeto.BD;

import java.sql.*;

public abstract class ConexaoBD {

    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    String database = "locadoraDeJogos";
    String url = "jdbc:mysql://127.0.0.1:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    String user = "root";
    String password = "root";

    public void connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão deu certo!");
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }
}
