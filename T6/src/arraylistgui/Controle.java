package arraylistgui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import arraylistgui.ArrayListGUI;
import arraylistgui.Personagem;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Pedro
 */
public class Controle {

    ArrayListGUI view;
    Guilda guilda;
    ArrayList<Grupo> grupo;
    TableModelPersonagem table;
    public Controle (ArrayListGUI view){
            this.view = view;
            this.guilda = new Guilda();
            this.grupo = new ArrayList<Grupo>();
            this.table = new TableModelPersonagem();
    }
        
    public void salvar (Personagem p){ 
            guilda.adicionar(p);
    }
    public void apagar(int indice){
            guilda.remover(indice);
    }
   public Personagem getelemento(int i){
            return guilda.getelemento(i);
   }
   public void printar (int i){
            System.out.println("Lista de elementos no grupo!!!\n");
            grupo.get(i).printar_guilda();
   }
    
}