package controller;

import model.Bagagem;
import model.CheckIn;
import util.DB;
import util.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BagagemController {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void create(Bagagem bagagem){
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("INSERT INTO Bagagem (PesoKg,DestinoFinal,Status,IdCheckIn) VALUES (?,?,?,?)");
            ps.setDouble(1,bagagem.getPesoKg());
            ps.setString(2,bagagem.getDestinoFinal());
            ps.setString(3,bagagem.getStatus());
            ps.setInt(4,bagagem.getCheckIn().getIdCheckIn());
            ps.executeUpdate();
        }catch (SQLException e){
            throw new DbException("Exceção: " + e);
        }
    }

    public List<Bagagem> read(){
        List<Bagagem> lista = new ArrayList<>();
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("SELECT * FROM Bagagem");
            rs = ps.executeQuery();
            while (rs.next()){
                Bagagem bagagem = new Bagagem();

                bagagem.setIdBagagem(rs.getInt(1));
                bagagem.setPesoKg(rs.getDouble(2));
                bagagem.setDestinoFinal(rs.getString(3));
                bagagem.setStatus(rs.getString(4));
                CheckIn checkIn = new CheckIn();
                checkIn.setIdCheckIn(rs.getInt(5));
                bagagem.setCheckIn(checkIn);
                lista.add(bagagem);
            }
            return lista;
        }catch (SQLException e){
            throw new DbException("Exceção : " + e);
        }
    }




}
