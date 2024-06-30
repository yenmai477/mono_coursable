package tech.coursable.monolithic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class CoursableApplicationTests {

  @Test
  void contextLoads() {
  }

}
