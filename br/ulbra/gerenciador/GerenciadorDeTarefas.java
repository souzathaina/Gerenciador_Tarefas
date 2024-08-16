package br.ulbra.gerenciador;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class GerenciadorDeTarefas {

    public ArrayList lista;

    public GerenciadorDeTarefas() {
        lista = new ArrayList();
    }

    public void salvar(String tarefas) {
        if (tarefas.equals(" ") || tarefas.equals(null)) {
            JOptionPane.showMessageDialog(null, "Digite a tarefa");
        } else {
            lista.add(tarefas);
            JOptionPane.showMessageDialog(null, tarefas + ", Salvo com sucesso!");
        }
    }

    public String listar() {
        String tarefas = "";
        if (lista.isEmpty()) {
            return "Não foi lançada nenhuma tarefa.";
        } else {
            for (int i = 0; i < lista.size(); i++) {
                tarefas += (i + 1) + "-" + lista.get(i) + "\n";
            }
            return tarefas;
        }
    }

    public void editar(int i, String novaTarefa) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
        } else if (i >= lista.size() || i <= 0) {
            JOptionPane.showMessageDialog(null, "Tarefa não encontrada");
        } else {
            lista.set(i, novaTarefa);
            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
        }
    }

    public void remover(int i) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
        } else if (i >= lista.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "Tarefa não encontrada");
        } else {
            lista.remove(i);
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        }
    }

    public void ordernar(int i) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
        } else if (i >= lista.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "Tarefa não encontrada");
        } else {
            lista.remove(i);
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        }

    }
}
