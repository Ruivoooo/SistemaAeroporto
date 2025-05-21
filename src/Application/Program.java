package Application;

import controller.AeronaveController;
import model.Aeronave;

public class Program{
    public static void main(String[] args) {
        AeronaveController aeronaveController = new AeronaveController();
        Aeronave aeronave = new Aeronave();

        aeronave.setModelo("BoeingRuim");
        aeronave.setFabricante("Marden");
        aeronave.setIdAeronave(2);


        aeronaveController.atualizar(aeronave);

    }
}
