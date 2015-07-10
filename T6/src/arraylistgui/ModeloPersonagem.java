/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistgui;

import java.util.Random;

/**
 *
 * @author Pedro
 */
public class ModeloPersonagem {
            public String personagemaleatorio(){
                        Random rand = new Random();
                        String[] nomes = {"Pheryus", "Aragorn","Angrod","Arahad I","Arathorn I","Balin","Bofur","Bombur","Barahir",
                            "Barbárvore","Dáin I","Dori","Faramir","Gandalf","Galadriel","Hador","Kíli","Legolas","Náin","Radagast","Sauron",
                            "Thorin I", "Thorin II Escudo de Carvalho","Thorin III Elmo-de-Ferro","Tom Bombadil"};
                        return nomes[rand.nextInt(nomes.length)];
                        }
            
            public String jogadoraleatorio(){
                        Random rand = new Random();
                        String[] nomes = {"Otávio","Rafael","Cassiano","Vinnie","Candia","Jvlima","Pitthan","Marquinhos Dornellas","Iara","Andrea","Pedro Lima","Tia do RU","Tia da Biblioteca","Tia da Biblioteca II","Guilherme","Tio do Faixa Velha", "Tio do Faixa Nova", "Tio do T.Neves","Cara de SI","Tio Amputado"};
                        return nomes[rand.nextInt(nomes.length)];
                        }
           public String raçaaleatorio(){
                        Random rand = new Random();
                        String[] raças = {"Anão", "Draconato", "Elfo", "Gnomo", "Halfling", "Humano"};
                        return raças[rand.nextInt(raças.length)];
           }
           public String classealeatorio(){
                        Random rand = new Random();
                        String[] classe = {"Bárbaro", "Bruxo", "Clérigo", "Guerreiro", "Ladino", "Mago", "Paladino", "Ranger"};
                        return classe[rand.nextInt(classe.length)];
           }
           public String habilidadealeatorio(){
                        Random rand = new Random();
                        String[] hab = {"Adestrar Animais", "Acrobacia", "Furtividade", "História", "Religião", "Percepção", "Blefe", "Identificar Magia"};
                        return hab[rand.nextInt(hab.length)];
           }
           public String especialidadealeatorio(){
                        Random rand = new Random();
                        String[] esp = {"Agressor","Defensor","Líder","Controlador"};
                        return esp[rand.nextInt(esp.length)];
           }
           public int levelaleatorio(){
                        Random rand = new Random();
                        return rand.nextInt(99)+1;
           }
           public boolean[][] trabalhoaleatorio(){
                        Random rand = new Random();
                        boolean[][] dias= new boolean[7][3];
                        for (int i=0;i<7;i++)
                                for(int j=0;j<3;j++)
                                        dias[i][j] = rand.nextBoolean();
                        boolean teste=false;
                        for (int i=0; i<7;i++)
                                for (int j=0;j<3;j++)
                                        teste = teste || dias[i][j];
                        if (teste)
                                return dias;
                        else
                                return null;
           }

           
}
