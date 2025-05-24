package Application;

import controller.*;
import model.*;

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

        /*
        Voo voo = new Voo();
        voo.setIdVoo(2);
        Passageiro passageiro = new Passageiro();
        passageiro.setIdPassageiro(2);

        PassagemController passagemController = new PassagemController();
        Passagem passagem = new Passagem(3,"2A","Padrão","Pix",voo,passageiro);

        passagemController.delete(passagem);

         */


        /*
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date dataCheckIn  = sdf.parse("25/12/2025 09:00");
        Timestamp partida = new Timestamp(dataCheckIn.getTime());

        Passagem passagem = new Passagem();
        passagem.setIdPassagem(1);

        CheckIn checkIn = new CheckIn(1,10,partida,passagem);
        CheckInController checkInController = new CheckInController();

        checkInController.delete(checkIn);

         */

        CheckIn checkIn = new CheckIn();
        checkIn.setIdCheckIn(2);

       Bagagem bagagem = new Bagagem(1,8.0,"Formiga","Aguardando voo",checkIn);
       BagagemController bagagemController = new BagagemController();

        bagagemController.delete(bagagem);



    }
}
