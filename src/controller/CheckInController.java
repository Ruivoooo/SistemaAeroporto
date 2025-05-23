package controller;

import model.CheckIn;
import model.Passagem;
import util.DB;
import util.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CheckInController {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void create(CheckIn checkIn){
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("INSERT INTO CheckIn (qtdDespachadaBgm,DataHora,IdPassagem) VALUES(?,?,?)");
            ps.setInt(1,checkIn.getQtdBagagensDesp());
            ps.setTimestamp(2,checkIn.getDataHora());
            ps.setInt(3,checkIn.getPassagem().getIdPassagem());
            ps.executeUpdate();
        }catch (SQLException e){
            throw new DbException("Exceção " + e);
        }
    }

    public List<CheckIn> read(){
        List<CheckIn> lista = new ArrayList<>();
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("SELECT * FROM CheckIn");
            rs = ps.executeQuery();

            while(rs.next()){
                CheckIn checkIn = new CheckIn();

                checkIn.setIdCheckIn(rs.getInt(1));
                checkIn.setQtdBagagensDesp(rs.getInt(2));
                checkIn.setDataHora(rs.getTimestamp(3));
                Passagem passagem = new Passagem();
                passagem.setIdPassagem(rs.getInt(4));
                checkIn.setPassagem(passagem);
                lista.add(checkIn);
            }
            return lista;
        }catch (SQLException e){
            throw new DbException("Exceção : " + e);
        }
    }

    public void update(CheckIn checkIn){
        try {
            conn = DB.getConnection();
            ps = conn.prepareStatement("UPDATE CheckIn SET qtdDespachadaBgm = ?,DataHora = ?, IdPassagem = ? WHERE IdCheckIn = ?");
            ps.setInt(1,checkIn.getQtdBagagensDesp());
            ps.setTimestamp(2,checkIn.getDataHora());
            ps.setInt(3,checkIn.getPassagem().getIdPassagem());
            ps.setInt(4,checkIn.getIdCheckIn());
            ps.executeUpdate();

        }catch (SQLException e){
            throw new DbException("Exceção + " + e);
        }
    }

    public void delete(CheckIn checkIn){
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("DELETE FROM CheckIn WHERE IdCheckIn = ?");
            ps.setInt(1,checkIn.getIdCheckIn());
            ps.executeUpdate();

        }catch (SQLException e){
            throw new DbException("Exceção : " + e);
        }
    }
}
