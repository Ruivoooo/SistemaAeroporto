package controller;

import model.Passageiro;
import model.Passagem;
import model.Voo;
import util.DB;
import util.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PassagemController {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void create(Passagem passagem) {
        try {
            conn = DB.getConnection();
            ps = conn.prepareStatement("INSERT INTO Passagem(Assento,Classe,StatusPgto,VooId,IdPassageiro) VALUES(?,?,?,?,?)");

            ps.setString(1, passagem.getAssento());
            ps.setString(2, passagem.getClasse());
            ps.setString(3, passagem.getStatusPgto());
            ps.setInt(4, passagem.getVoo().getIdVoo());
            ps.setInt(5, passagem.getPassageiro().getIdPassageiro());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DbException("Exceção : " + e);
        }
    }

    public List<Passagem> read() {
        Passagem passagem = new Passagem();
        List<Passagem> lista = new ArrayList<>();
        try {
            conn = DB.getConnection();
            ps = conn.prepareStatement("SELECT * FROM Passagem");
            rs = ps.executeQuery();
            while (rs.next()) {
                passagem.setIdPassagem(rs.getInt(1));
                passagem.setAssento(rs.getString(2));
                passagem.setClasse(rs.getString(3));
                passagem.setStatusPgto(rs.getString(4));
                Voo voo = new Voo();
                voo.setIdVoo(rs.getInt(5));
                passagem.setVoo(voo);
                Passageiro passageiro = new Passageiro();
                passageiro.setIdPassageiro(rs.getInt(6));
                passagem.setPassageiro(passageiro);
                lista.add(passagem);
            }
            return lista;
        } catch (SQLException e) {
            throw new DbException("Exceção + " + e);
        }
    }


    public void update(Passagem passagem) {
        try {
            conn = DB.getConnection();
            ps = conn.prepareStatement("UPDATE Passagem SET Assento = ?,Classe = ?,StatusPgto = ?,VooId = ?,IdPassageiro = ? WHERE IdPassagem = ?");
            ps.setString(1, passagem.getAssento());
            ps.setString(2, passagem.getClasse());
            ps.setString(3, passagem.getStatusPgto());
            ps.setInt(4, passagem.getVoo().getIdVoo());
            ps.setInt(5, passagem.getPassageiro().getIdPassageiro());
            ps.setInt(6, passagem.getIdPassagem());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DbException("Exceção : " + e);
        }
    }

    public void delete(Passagem passagem) {
        try {
            conn = DB.getConnection();
            ps = conn.prepareStatement("DELETE FROM Passagem WHERE IdPassagem = ? ");
            ps.setInt(1, passagem.getIdPassagem());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new DbException("Exceção " + e);
        }
    }
}
