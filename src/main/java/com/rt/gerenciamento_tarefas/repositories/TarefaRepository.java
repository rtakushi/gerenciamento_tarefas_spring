package com.rt.gerenciamento_tarefas.repositories;

import com.rt.gerenciamento_tarefas.models.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
