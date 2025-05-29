/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Passagem {
    private Integer idPassagem;
    private String assento;
    private String classe;
    private String statusPgto;
    private Voo voo;
    private Passageiro passageiro;

    public Passagem(Integer idPassagem, String assento, String classe, String statusPgto, Voo voo, Passageiro passageiro) {
        this.idPassagem = idPassagem;
        this.assento = assento;
        this.classe = classe;
        this.statusPgto = statusPgto;
        this.voo = voo;
        this.passageiro = passageiro;
    }

    public Passagem() {

    }

    public Integer getIdPassagem() {
        return idPassagem;
    }

    public void setIdPassagem(Integer idPassagem) {
        this.idPassagem = idPassagem;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getStatusPgto() {
        return statusPgto;
    }

    public void setStatusPgto(String statusPgto) {
        this.statusPgto = statusPgto;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    @Override
    public String toString() {
        return "Passagem{" +
                "idPassagem=" + idPassagem +
                ", assento='" + assento + '\'' +
                ", classe='" + classe + '\'' +
                ", statusPgto='" + statusPgto + '\'' +
                ", voo=" + voo.getIdVoo()+
                ", passageiro=" + passageiro.getIdPassageiro() +
                '}';
    }
}