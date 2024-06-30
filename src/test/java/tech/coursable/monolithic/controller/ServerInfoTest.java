package tech.coursable.monolithic.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;



@WebMvcTest
@RunWith(SpringRunner.class)
public class ServerInfoTest {

  @Autowired
  private MockMvc mvc;

  @Test
  public void healthCheck() throws Exception {
    mvc
      .perform(MockMvcRequestBuilders.get("/server-info/health-check"))
      .andExpect(MockMvcResultMatchers.status().isOk())
      .andExpect(MockMvcResultMatchers.content().string("Response from server!"));
  }
}