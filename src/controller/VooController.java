package controller;

import model.Aeronave;
import model.Voo;
import util.DB;
import util.DbException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VooController {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void create(Voo voo){
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("INSERT INTO Voo(origem,destino,dataHoraPartida,dataHoraChegada,status,AeronaveId)"
                    + "VALUES (?,?,?,?,?,?)");

            ps.setString(1,voo.getOrigem());
            ps.setString(2, voo.getDestino());
            ps.setTimestamp(3,voo.getDataHoraPartida());
            ps.setTimestamp(4,voo.getDataHoraChegada());
            ps.setString(5,voo.getStatus());
            ps.setInt(6,voo.getAeronave().getIdAeronave());

            ps.executeUpdate();

        }catch (SQLException e){
            throw  new DbException("Exceção : " + e);
        }
    }


    public List<Voo> read(){
        List<Voo> lista = new ArrayList<>();
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("SELECT * FROM Voo");
            rs = ps.executeQuery();
            while (rs.next()){
                Voo voo = new Voo();
                voo.setIdVoo(rs.getInt(1));
                voo.setOrigem(rs.getString(2));
                voo.setDestino(rs.getString(3));
                voo.setDataHoraPartida(rs.getTimestamp(4));
                voo.setDataHoraChegada(rs.getTimestamp(5));
                voo.setStatus(rs.getString(6));

                Aeronave aeronave = new Aeronave();
                aeronave.setIdAeronave(rs.getInt(7));
                voo.setAeronave(aeronave);
                lista.add(voo);


            }
            return lista;
        }catch (SQLException e){
            System.out.println("Exceção : " + e);
        }finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
        return lista;
    }


    public void update(Voo voo){
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("UPDATE Voo "
                                      + "SET origem = ?,"
                                      + "Destino = ?,"
                                      + "DataHoraPartida = ?,"
                                      + "DataHoraChegada = ?,"
                                      + "Status = ?,"
                                      + "AeronaveId = ?"
                                      + " WHERE IdVoo = ?"
            );
            ps.setString(1, voo.getOrigem());
            ps.setString(2,voo.getDestino());
            ps.setTimestamp(3,voo.getDataHoraPartida());
            ps.setTimestamp(4,voo.getDataHoraChegada());
            ps.setString(5,voo.getStatus());
            ps.setInt(6,voo.getAeronave().getIdAeronave());
            ps.setInt(7,voo.getIdVoo());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new DbException("Exceção " + e);
        }
    }


    public void delete(Voo voo){
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("DELETE FROM Voo WHERE IdVoo = ? ");
            ps.setInt(1,voo.getIdVoo());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("Exceção : " + e);
        }
    }

}
