/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ppostinho;

import Postinho.DAO.UsuarioDAO;
import Postinho.gui.TelaPacientes;
import Postinho.gui.TelaLogin;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author emellyv
 */
public class LoginController {

    public void logarUsuario(TelaLogin telaL) throws SQLException {
        UsuarioDAO usuario = new UsuarioDAO();
        boolean loginValido = usuario.validarlogin(telaL.getTxtNome().getText(), telaL.getTxtSenha().getText());
        
        if (loginValido) {
            JOptionPane.showMessageDialog(telaL, "Login realizado com sucesso");
            // Abre a TelaClientes
            TelaPacientes telaPacientes = new TelaPacientes();
            telaPacientes.setVisible(true);
            telaL.dispose(); // Fecha a tela de login após login bem-sucedido
        } else {
            JOptionPane.showMessageDialog(telaL, "ERRO! Verifique se os campos estão corretos");
        }
    }
} 

