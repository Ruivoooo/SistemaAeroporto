/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Passageiro {

    private Integer idPassageiro;
    private String nome;
    private String CpfOuPassaport;
    private String contato;

    public Passageiro(Integer idPassageiro, String nome, String contato, String cpfOuPassaport) {
        this.idPassageiro = idPassageiro;
        this.nome = nome;
        this.contato = contato;
        this.CpfOuPassaport = cpfOuPassaport;
    }

    public Passageiro(){}

    public Integer getIdPassageiro() {
        return idPassageiro;
    }

    public void setIdPassageiro(Integer idPassageiro) {
        this.idPassageiro = idPassageiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfOuPassaport() {
        return CpfOuPassaport;
    }

    public void setCpfOuPassaport(String cpfOuPassaport) {
        CpfOuPassaport = cpfOuPassaport;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "idPassageiro=" + idPassageiro +
                ", nome='" + nome + '\'' +
                ", CpfOuPassaport='" + CpfOuPassaport + '\'' +
                ", contato='" + contato + '\'' +
                '}';
    }
}
