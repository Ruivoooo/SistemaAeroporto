package model;

import java.io.Serializable;
import java.util.Objects;
import java.sql.Timestamp;


public class Voo implements Serializable {

    private static final long serialVersionUID = 1l;

    private Integer idVoo;
    private String origem;
    private String destino;
    private Timestamp dataHoraPartida;
    private Timestamp dataHoraChegada;
    private String status;
    private Aeronave aeronave;


    public Voo(Integer idVoo,String origem, String destino, Timestamp dataHoraPartida, Timestamp dataHoraChegada, String status, Aeronave aeronave) {
        this.idVoo = idVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
        this.dataHoraChegada = dataHoraChegada;
        this.status = status;
        this.aeronave = aeronave;
    }

    public Voo(){}

    public Integer getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(Integer idVoo) {
        this.idVoo = idVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Timestamp getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(Timestamp dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

    public Timestamp getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(Timestamp dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voo voo = (Voo) o;
        return Objects.equals(idVoo, voo.idVoo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idVoo);
    }

    @Override
    public String toString() {
        return "Voo{" +
                "idVoo=" + idVoo +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", dataHoraPartida=" + dataHoraPartida +
                ", dataHoraChegada=" + dataHoraChegada +
                ", status='" + status + '\'' +
                ", idAeronave=" + aeronave.getIdAeronave() +
                '}';
    }
}
