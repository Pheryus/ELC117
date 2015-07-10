/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistgui;

import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class Grupo {
        ArrayList<Personagem> grupo;
        public Grupo() {
                    grupo = new ArrayList<Personagem>();
                } 
        public void adicionar(Personagem p){
                    grupo.add(p);
}
        public void remover (int i){
                    grupo.remove(i); 
        }
        public Personagem getelemento(int i){
                    return grupo.get(i);
        }
        public void deletar(){
                    grupo.clear();
        }
}
