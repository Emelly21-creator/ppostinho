/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexaoBD;

import ConexaoBD.Conexao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author emellyv
 */
public class testeConexao {
    public static void main(String[] args) throws SQLException {
        Connection conexao = Conexao.getConnection();
        if (conexao != null) {
            System.out.println("✅ Conexão bem-sucedida!");
            conexao.close();
        } else {
            System.out.println("❌ Erro ao conectar.");
        }
    }
}

