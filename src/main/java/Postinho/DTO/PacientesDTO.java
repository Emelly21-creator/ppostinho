/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Postinho.DTO;

/**
 *
 * @author emellyv
 */
public class PacientesDTO {

    private int id;
    private String nome;
    private String SUS;
    private String horaAtendimento;
    private String telefone;
    

    public PacientesDTO( String nome, String SUS, String horaAtendimento, String telefone) {
        this.nome = nome;
        this.SUS = SUS;
        this.horaAtendimento = horaAtendimento;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSUS() {
        return SUS;
    }

    public void setSUS(String SUS) {
        this.SUS = SUS;
    }

    public String setHararioDeAtendimento() {
        return horaAtendimento;
    }

    public void setHararioDeAtendimento(String horaAtendimento) {
        this.horaAtendimento = horaAtendimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getHorarioDeAtendimento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }