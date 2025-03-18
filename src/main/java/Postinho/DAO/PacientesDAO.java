/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Postinho.DAO;

import Postinho.DTO.PacientesDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PacientesDAO {
    private Connection connection;

    public PacientesDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadastrar(PacientesDTO pacientes) throws SQLException {
        String sql = "INSERT INTO pacientes (SUS, nome, horaAtendimento, telefone) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, pacientes.getSUS());
            stmt.setString(2, pacientes.getNome());
            stmt.setString(3, pacientes.getHorarioDeAtendimento());
            stmt.setString(4, pacientes.getTelefone());
            stmt.executeUpdate();
        }
    }

    public void atualizar(PacientesDTO pacientes) throws SQLException {
        String sql = "UPDATE pacientes SET nome=?, horaAtendimento=?, telefone=? WHERE SUS=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, pacientes.getNome());
            stmt.setString(2, pacientes.getHorarioDeAtendimento());
            stmt.setString(3, pacientes.getTelefone());
            stmt.setString(6, pacientes.getSUS()); // Usando SUS como chave primária
            stmt.executeUpdate();
        }
    }

public boolean excluir(String SUS) throws SQLException {
    String sql = "DELETE FROM pacientes WHERE SUS=?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setString(1, SUS);
        int linhasAfetadas = stmt.executeUpdate();
        return linhasAfetadas > 0; // Retorna true se pelo menos uma linha foi excluída
    }
}

    public List<PacientesDTO> listarTodos() {
        List<PacientesDTO> paciente = new ArrayList<>();
        String sql = "SELECT * FROM pacientes";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                paciente.add(new PacientesDTO(
                    rs.getString("nome"),
                    rs.getString("SUS"),
                    rs.getString("horaAtendimento"),
                    rs.getString("telefone")
                ));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar pacientes: " + e.getMessage());
        }

        return paciente;
    }
}