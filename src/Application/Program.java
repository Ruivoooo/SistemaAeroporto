package Application;

import controller.AeronaveController;
import controller.PassageiroController;
import controller.PassagemController;
import controller.VooController;
import model.Aeronave;
import model.Passageiro;
import model.Passagem;
import model.Voo;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program{
    public static void main(String[] args) throws ParseException {

            /*
        VooController vooController = new VooController();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date partidaUtil = sdf.parse("25/12/2025 09:00");
        Date chegadaUtil = sdf.parse("25/12/2025 13:00");
        Timestamp partida = new Timestamp(partidaUtil.getTime());
        Timestamp chegada = new Timestamp(chegadaUtil.getTime());
        Aeronave aeronave = new Aeronave();
        aeronave.setIdAeronave(2);
        Voo voo = new Voo(1,"Santa catarina","São Paulo",partida,chegada,"Finalizado",aeronave);
        vooController.create(voo);
             */
        Voo voo = new Voo();
        voo.setIdVoo(2);
        Passageiro passageiro = new Passageiro();
        passageiro.setIdPassageiro(2);

        PassagemController passagemController = new PassagemController();
        Passagem passagem = new Passagem(3,"2A","Padrão","Pix",voo,passageiro);

        passagemController.delete(passagem);





    }
}
