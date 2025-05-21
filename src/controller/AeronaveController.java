package controller;

import com.sun.jdi.ShortType;
import model.Aeronave;
import util.DB;
import util.DbException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AeronaveController {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void AeronaveInserir(Aeronave aeronave){
        try{
            conn = DB.getConnection();
            conn.setAutoCommit(false);

            ps = conn.prepareStatement("INSERT INTO aeronave"
                                   + "(Modelo,Capacidade,Fabricante)"
                                   + "VALUES "
                                   + "(?,?,?)"
                                   );
        ps.setString(1,aeronave.getModelo());
        ps.setInt(2,aeronave.getCapacidade());
        ps.setString(3,aeronave.getFabricante());

        ps.executeUpdate();
        conn.commit();

        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }
        finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }


    public List<Aeronave> ler(){
        List<Aeronave> lista = new ArrayList<>();
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("SELECT * FROM Aeronave");
            rs = ps.executeQuery();
           while (rs.next()){
               Aeronave aeronave = new Aeronave();
               aeronave.setIdAeronave(rs.getInt(1));
               aeronave.setModelo(rs.getString(2));
               aeronave.setCapacidade(rs.getInt(3));
               aeronave.setFabricante(rs.getString(4));
               lista.add(aeronave);
           }
           return lista;
        } catch (SQLException e){
            throw new DbException("Exceção : " + e);
        }finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }



    public void atualizar(Aeronave aeronave){
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("UPDATE Aeronave " +
                                           "SET modelo = ?, " +
                                           "capacidade = ?, " +
                                           "fabricante = ? " +
                                           "WHERE IdAeronave = ? "
            );

            ps.setString(1, aeronave.getModelo());
            ps.setInt(2,aeronave.getCapacidade());
            ps.setString(3, aeronave.getFabricante());
            ps.setInt(4,aeronave.getIdAeronave());

            ps.executeUpdate();
        }catch (SQLException e){
            throw new DbException("Exceção " + e);
        }
    }


    public void deletar(Aeronave aeronave){
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("DELETE FROM Aeronave WHERE IdAeronave = ?");
            ps.setInt(1,aeronave.getIdAeronave());
            ps.executeUpdate();
        }catch (SQLException e){
            throw new DbException("Exceção : " + e);
        }
    }












}
