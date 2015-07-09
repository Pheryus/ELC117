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
    TableModelPersonagem table;
    public Controle (ArrayListGUI view){
            this.view = view;
            this.guilda = new Guilda();
            this.table = new TableModelPersonagem();
    }
    
    public void salvar (Personagem p){ 
            guilda.adicionar(p);
    }
    public void apagar(int indice){
            guilda.remover(indice);
    }
   public void printa(){
            System.out.println("Guilda string:"+guilda.guilda.toString()+"\n");
   }
    
}