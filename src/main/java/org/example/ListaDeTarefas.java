package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//me siga @natanieltech

public class ListaDeTarefas {
    private List<String> tarefas = new ArrayList<>();

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
    }

    public boolean removerTarefa(String tarefa) {
        return tarefas.remove(tarefa);
    }

    public Optional<String> buscarTarefa(String tarefa) {
        return tarefas.stream().filter(t -> t.equals(tarefa)).findFirst();
    }
}

