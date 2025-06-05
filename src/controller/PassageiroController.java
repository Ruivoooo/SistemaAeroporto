/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import model.Passageiro;
import util.DB;
import util.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PassageiroController {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void create(Passageiro passageiro){
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("Insert into Passageiro (Nome,CPFOUPassaport,contato) VALUES (?,?,?)");

            ps.setString(1, passageiro.getNome());
            ps.setString(2,passageiro.getCpfOuPassaport());
            ps.setString(3,passageiro.getContato());

            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("Exceção" + e);
        }
    }


    public List<Passageiro> read(){
        List<Passageiro> lista = new ArrayList<>();
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("SELECT * FROM Passageiro");
            rs = ps.executeQuery();
            while (rs.next()){
                Passageiro passageiro = new Passageiro();
                passageiro.setIdPassageiro(rs.getInt(1));
                passageiro.setNome(rs.getString(2));
                passageiro.setCpfOuPassaport(rs.getString(3));
                passageiro.setContato(rs.getString(4));
                lista.add(passageiro);
            }
            return lista;

        } catch (SQLException e) {
            throw new DbException("Exceção " + e);
        }
    }

    public void update(Passageiro passageiro){
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("UPDATE Passageiro SET Nome = ?,CPFOUPassaport = ?,contato = ? WHERE IdPassageiro = ? ");
            ps.setString(1,passageiro.getNome());
            ps.setString(2,passageiro.getCpfOuPassaport());
            ps.setString(3,passageiro.getContato());
            ps.setInt(4,passageiro.getIdPassageiro());

            ps.executeUpdate();
        }catch (SQLException e){
            throw new DbException("Exceção " + e);
        }
    }

    public void delete(Passageiro passageiro){
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("DELETE FROM Passageiro WHERE IdPassageiro = ? ");
            ps.setInt(1,passageiro.getIdPassageiro());
            ps.executeUpdate();
        }catch (SQLException e){
            throw new DbException("Exceção " + e);
        }
    }
    
    public int getLastId(){
       
        int id = 0;
        
        try{
            
            
            
            conn = DB.getConnection();
            ps = conn.prepareStatement("SELECT MAX(IdPassageiro) from Passageiro");
                    rs = ps.executeQuery();
                   
            if(rs.next()){
                id = rs.getInt(1);
            }      
            
        }catch (SQLException e){
            throw new DbException("Exceção " + e);
        }
        
        return id;
    }



}

