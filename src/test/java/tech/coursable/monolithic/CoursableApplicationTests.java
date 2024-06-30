package tech.coursable.monolithic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class CoursableApplicationTests {

  @Test
  void contextLoads(ApplicationContext context) {
    assertNotNull(context);

    // Correct beans with spring data jpa
    assertNotNull(context.getBean("dataSource"));
    assertNotNull(context.getBean("entityManagerFactory"));
  }
}
