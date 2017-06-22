package com.github.adolfojunior.sampleweb.sao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.github.adolfojunior.sampleweb.domain.Task;

@Stateless
public class TaskDao {

  @PersistenceContext(unitName = "test")
  private EntityManager entityManager;

  public List<Task> getAll() {
    return entityManager.createNamedQuery(Task.TASK_GET_ALL, Task.class).getResultList();
  }
}
