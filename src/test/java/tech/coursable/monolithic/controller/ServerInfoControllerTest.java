package tech.coursable.monolithic.controller;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServerInfoControllerTest {

  private final ServerInfoController serverInfoController = new ServerInfoController();

  @Test
  public void givenNothingWhenExecuteHealthCheckThenReturnOk() {
    // When
    ResponseEntity<String> stringResponseEntity = serverInfoController.healthCheck();

    // Then
    assertEquals(HttpStatus.OK, stringResponseEntity.getStatusCode());
  }
}
