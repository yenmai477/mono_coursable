package tech.coursable.monolithic;

import org.springframework.boot.SpringApplication;

public class TestCoursableApplication {

  public static void main(String[] args) {
    SpringApplication.from(CoursableApplication::main).with(TestcontainersConfiguration.class).run(args);
  }

}
