package com.github.adolfojunior.sampleweb.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(@NamedQuery(name = Task.TASK_GET_ALL, query = "select t from Task t"))
public class Task {

  public static final String TASK_GET_ALL = "Task.getAll";

  @Id
  @GeneratedValue
  private long id;
  private String name;
  private LocalDateTime creationTime;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(LocalDateTime creationTime) {
    this.creationTime = creationTime;
  }
}