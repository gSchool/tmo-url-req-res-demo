package com.cory.playground;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {

  @Autowired
  private MockMvc mvc;

  @Autowired
  private MathService mathService;

  @Test
  public void test_super_secret_route() throws Exception {
    this.mvc.perform(get("/superSecret?password=toki")
        .accept(MediaType.TEXT_PLAIN))
        .andExpect(status().isOk())
        .andExpect(content().string("The force is strong within you!"));
  }

  @Test
  public void test_math_pi() throws Exception {
    this.mvc.perform(get("/math/pi")
        .accept(MediaType.ALL_VALUE))
        .andExpect(status().isOk())
        .andExpect(content().string("3.14159265359"));
  }

  @Test
  public void test_addition_of_two_numbers() throws Exception {
    this.mvc.perform(get("/math/add?x=22&y=93")
        .accept(MediaType.ALL_VALUE))
        .andExpect(status().isOk())
        .andExpect(content().string("115.0"));
  }
}
