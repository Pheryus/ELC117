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
    public Controle (ArrayListGUI view){
            this.view = view;
            this.guilda = new Guilda();
            this.grupo = new ArrayList<Grupo>();
    }
        
    public void salvar (Personagem p){ 
            guilda.adicionar(p);
    }
    public void apagar(int indice){
            guilda.remover(indice);
    }
    public void trocar (int i, Personagem p){
            guilda.trocar(i, p);
    }
   public Personagem getelemento(int i){
            return guilda.getelemento(i);
   }
   public void atualizapersonagem(int i, int j, int indice){
            guilda.getelemento(indice).trabalho[i][j] = false;
   }
    
}