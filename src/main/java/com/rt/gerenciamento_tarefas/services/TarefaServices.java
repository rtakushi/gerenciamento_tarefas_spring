package com.rt.gerenciamento_tarefas.services;

import com.rt.gerenciamento_tarefas.models.Tarefa;
import com.rt.gerenciamento_tarefas.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaServices {

    @Autowired
    private TarefaRepository repository;

    public Tarefa create(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listar(){
        return repository.findAll();
    }

    public Optional<Tarefa> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
