package arraylistgui;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrea
 */

class TableModelPersonagem extends AbstractTableModel {

    // Lista de disciplinas
    private ArrayList<Personagem> p;

    // Array com os nomes das colunas da tabela
    private static final String[] columnNames = {"Nome do Jogador", "Nome do Personagem", "Level", "Classe"};

    // Construtor default
    public TableModelPersonagem() {
        p = new ArrayList<Personagem>();
        // COMPLETE-ME: inicialize a lista com algumas disciplinas
        
    }

    // Metodo chamado pela GUI para remover um elemento
    public void remove(int index) {
        // COMPLETE-ME: remova o elemento de indice index da lista
	fireTableRowsDeleted(index, index);
        p.remove(index);
    }
  
    // Metodo chamado pela GUI para selecionar um elemento
    public Personagem select(int index) {
        // COMPLETE-ME: retorne o elemento de indice index da lista
        return p.get(index);
    }

    // Metodo chamado pela GUI para inserir um elemento
    public void add(Personagem d) {
        // COMPLETE-ME: insira a disciplina d na lista
        fireTableRowsInserted(p.size()-1, p.size()-1);
        p.add(d);
    }

    // Metodo chamado pela GUI para alterar um elemento
    public void update(int index, Personagem d) {
        p.set(index, d);
        fireTableRowsUpdated(index, index);
    }

    @Override
    public int getColumnCount() {
        // COMPLETE-ME: retorne o numero de colunas que a tabela devera conter
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public int getRowCount() {
        return p.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return p.get(rowIndex).getNomej();
            case 1: return p.get(rowIndex).getNomep();
            case 2: return p.get(rowIndex).getLevel();
            case 3: return p.get(rowIndex).getClasse();
        }
        return null;
    }
}

