package br.com.banco.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://sql301.infinityfree.com/if0_39857911_bank_database?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
