/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Aeronave{

    

    private Integer idAeronave;
    private String modelo;
    private int capacidade;
    private String fabricante;

    public Aeronave(){}

    public Aeronave(Integer idAeronave, String modelo, int capacidade, String fabricante) {
        this.idAeronave = idAeronave;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.fabricante = fabricante;
    }

    public Integer getIdAeronave() {
        return idAeronave;
    }

    public void setIdAeronave(Integer idAeronave) {
        this.idAeronave = idAeronave;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }



    @Override
    public String toString() {
        return "Aeronave{" +
                "idAeronave=" + idAeronave +
                ", modelo='" + modelo + '\'' +
                ", capacidade=" + capacidade +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }

}
