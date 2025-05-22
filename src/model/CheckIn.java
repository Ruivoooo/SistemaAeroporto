package model;

import java.sql.Time;
import java.sql.Timestamp;

public class CheckIn {

    private Integer idCheckIn;
    private int qtdBagagensDesp;
    private Timestamp dataHora;
    private Passagem passagem;

    public CheckIn(Integer idCheckIn, int qtdBagagensDesp, Timestamp dataHora, Passagem passagem) {
        this.idCheckIn = idCheckIn;
        this.qtdBagagensDesp = qtdBagagensDesp;
        this.dataHora = dataHora;
        this.passagem = passagem;
    }

    public CheckIn(){}

    public Integer getIdCheckIn() {
        return idCheckIn;
    }

    public void setIdCheckIn(Integer idCheckIn) {
        this.idCheckIn = idCheckIn;
    }

    public int getQtdBagagensDesp() {
        return qtdBagagensDesp;
    }

    public void setQtdBagagensDesp(int qtdBagagensDesp) {
        this.qtdBagagensDesp = qtdBagagensDesp;
    }

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }
}
