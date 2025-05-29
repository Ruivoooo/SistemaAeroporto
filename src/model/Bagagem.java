/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Bagagem {

    private Integer idBagagem;
    private double pesoKg;
    private String destinoFinal;
    private String status;
    private CheckIn checkIn;

    public Bagagem(Integer idBagagem, double pesoKg, String destinoFinal, String status,CheckIn checkIn) {
        this.idBagagem = idBagagem;
        this.pesoKg = pesoKg;
        this.destinoFinal = destinoFinal;
        this.status = status;
        this.checkIn = checkIn;
    }

    public Bagagem(){}

    public Integer getIdBagagem() {
        return idBagagem;
    }

    public void setIdBagagem(Integer idBagagem) {
        this.idBagagem = idBagagem;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getDestinoFinal() {
        return destinoFinal;
    }

    public void setDestinoFinal(String destinoFinal) {
        this.destinoFinal = destinoFinal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CheckIn getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(CheckIn checkIn) {
        this.checkIn = checkIn;
    }

    @Override
    public String toString() {
        return "Bagagem{" +
                "idBagagem=" + idBagagem +
                ", pesoKg=" + pesoKg +
                ", destinoFinal='" + destinoFinal + '\'' +
                ", status='" + status + '\'' +
                ", checkIn=" + checkIn.getIdCheckIn() +
                '}';
    }
}

