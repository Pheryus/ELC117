/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistgui;

/**
 *
 * @author Pedro
 */
public class Personagem {

    public String getNomep() {
        return nomep;
    }

    public String getNomej() {
        return nomej;
    }

    public String getRaça() {
        return raça;
    }

    public String getClasse() {
        return classe;
    }

    public String getHabilidade() {
        return habilidade;
    }
    public String getEspecialidade() {
        return this.especialidade;
    }
    
    public int getLevelH() {
        return levelh;
    }

    public int getLevel() {
        return levelp;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    @Override
    public String toString() {
        return "Personagem{" + "nomep=" + nomep + ", nomej=" + nomej + ", ra\u00e7a=" + raça + ", classe=" + classe + ", especialidade=" + especialidade + ", habilidade=" + habilidade + ", levelh=" + levelh + ", levelp=" + levelp + '}';
    }

    public void setNomej(String nomej) {
        this.nomej = nomej;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
    public void setEspecialidade(String esp) {
        this.especialidade = esp;
    } 

    public void setLevelH(int level) {
        this.levelh = level;
    }

    public void setLevelP(int levelp) {
        this.levelp = levelp;
    }
    
    public void setTrabalho(int i, int j, boolean conteudo){
            trabalho[i][j] = conteudo;
    }
    public boolean getTrabalho(int i, int j){
            return trabalho[i][j];
    }
    
    public String verhorario(int i){
            String aux = "";
            if (trabalho[i][0])
                   aux+= "m";
            if (trabalho[i][1])
                   aux+= "t";
            if (trabalho[i][2])
                   aux+="n";
            return aux;
    }
    public String vertrabalho(){
            String aux = "";
            String dias[] = {"Seg:","Ter:","Qua:","Qui:","Sex:","Sab:","Dom:"};
            for (int i=0; i<7;i++){
                if (this.verhorario(i) != ""){
                    aux += dias[i];
                    aux += this.verhorario(i)+"|";
                }
            }
            return aux;
       }
    
    public String nomep,nomej, raça,classe,especialidade,habilidade;
    public int levelh,levelp;
    public boolean trabalho[][] = new boolean[7][3];

    
}
