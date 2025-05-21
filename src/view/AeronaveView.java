package view;

import controller.AeronaveController;
import model.Aeronave;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AeronaveView extends JFrame {



    public AeronaveView(){
        setTitle("Lista de Aeronaves");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Colunas da tabela
        String[] colunas = {"ID", "Modelo", "Capacidade", "Fabricante"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        // Instância da sua classe que tem o método ler
        AeronaveController aeronaveController = new AeronaveController(); // ou outro nome da sua classe
        List<Aeronave> lista = aeronaveController.ler();

        // Adiciona os dados na tabela
        for (Aeronave a : lista) {
            Object[] linha = {
                    a.getIdAeronave(),
                    a.getModelo(),
                    a.getCapacidade(),
                    a.getFabricante()
            };
            model.addRow(linha);
        }

        JTable tabela = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane, BorderLayout.CENTER);
    }
    }


