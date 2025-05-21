package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Voo implements Serializable {

    private static final long serialVersionUID = 1l;

    private Integer idVoo;
    private String origem;
    private String destino;
    private String dataHoraPartida;
    private String dataHoraChegada;
    private String status;
    private Aeronave idAeronave;


    public Voo(Integer idVoo, String origem, String destino, String dataHoraPartida, String dataHoraChegada, String status,Aeronave idAeronave) {
        this.idVoo = idVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
        this.dataHoraChegada = dataHoraChegada;
        this.status = status;
        this.idAeronave = idAeronave;
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

    public String getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(String dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

    public String getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(String dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Aeronave getIdAeronave() {
        return idAeronave;
    }

    public void setIdAeronave(Aeronave idAeronave) {
        this.idAeronave = idAeronave;
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
                ", idAeronave=" + idAeronave +
                '}';
    }
}
