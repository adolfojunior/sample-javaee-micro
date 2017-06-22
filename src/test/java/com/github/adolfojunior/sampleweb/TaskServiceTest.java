package com.github.adolfojunior.sampleweb;

import static org.assertj.core.api.Assertions.assertThat;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.adolfojunior.sampleweb.service.TaskService;

@RunWith(Arquillian.class)
public class TaskServiceTest {

  @Deployment
  public static Archive<?> createDeploymentPackage() {
    return ShrinkWrap.create(WebArchive.class, "arquillian-test.war")
        .addAsResource(EmptyAsset.INSTANCE, "META-INF/beans.xml")
        .addAsResource(EmptyAsset.INSTANCE, "META-INF/web.xml")
        // .addAsManifestResource("persistence.xml", "persistence.xml")
        .addAsResource("persistence.xml", "META-INF/persistence.xml")
        .addPackages(true, "com.github.adolfojunior.sampleweb");
  }

  @Inject
  private TaskService taskService;

  @Test
  public void shouldWork() throws Exception {
    assertThat(taskService).isNotNull();
    assertThat(taskService.getAll()).isEmpty();
  }
}
