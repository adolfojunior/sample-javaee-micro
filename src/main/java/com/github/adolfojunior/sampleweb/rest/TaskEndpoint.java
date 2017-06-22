package com.github.adolfojunior.sampleweb.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.adolfojunior.sampleweb.domain.Task;
import com.github.adolfojunior.sampleweb.service.TaskService;

@Path("tasks")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TaskEndpoint {

  private TaskService sampleService;

  @Inject
  public TaskEndpoint(TaskService sampleService) {
    this.sampleService = sampleService;
  }

  @GET
  public List<Task> getAll() {
    return sampleService.getAll();
  }
}
