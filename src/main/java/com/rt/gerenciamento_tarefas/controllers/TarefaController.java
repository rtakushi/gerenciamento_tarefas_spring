package com.rt.gerenciamento_tarefas.controllers;

import com.rt.gerenciamento_tarefas.models.Tarefa;
import com.rt.gerenciamento_tarefas.services.TarefaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaServices services;

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return services.create(tarefa);
    }

    @GetMapping
    public List<Tarefa> listar(){
        return services.listar();
    }

    @GetMapping("/{id}")
    public Optional<Tarefa> buscar(@PathVariable Long id){
        return services.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        services.deletar(id);
    }

}
