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
public class Guilda{
        ArrayList<Personagem> guilda;
        
        public Guilda() {
                    guilda = new ArrayList<Personagem>();
                } 
        public void adicionar(Personagem p){
                    guilda.add(p);
}
        public void remover (int i){
                    guilda.remove(i); 
        }
        public ArrayList<Personagem> conteudo (){
                    return this.guilda;
        }
        public Personagem getelemento(int i){
                    return guilda.get(i);
        }
        public void printar_guilda(){
                    for (int i=0; i<guilda.size();i++){
                            Personagem p = guilda.get(i);
                            System.out.println(p.toString());                                    
                    }
        }
}