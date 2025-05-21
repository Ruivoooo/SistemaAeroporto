package model;

import java.io.Serializable;
import java.util.Objects;

public class Aeronave implements Serializable {

    private static final long serialVersionUID = 1l;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aeronave aeronave = (Aeronave) o;
        return Objects.equals(idAeronave, aeronave.idAeronave);
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(idAeronave);
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
