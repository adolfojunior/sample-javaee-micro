package com.github.adolfojunior.sampleweb.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.github.adolfojunior.sampleweb.domain.Task;
import com.github.adolfojunior.sampleweb.sao.TaskDao;

@Singleton
public class TaskServiceImpl implements TaskService {

  private TaskDao taskDao;

  @Inject
  public TaskServiceImpl(TaskDao taskDao) {
    this.taskDao = taskDao;
  }

  @Override
  public List<Task> getAll() {
    return taskDao.getAll();
  }
}
