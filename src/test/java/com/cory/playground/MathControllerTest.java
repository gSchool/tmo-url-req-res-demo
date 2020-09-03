package com.cory.playground;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

@WebMvcTest(MathController.class)
class MathControllerTest {

  @Autowired
  private MockMvc mvc;

  @Test
  void valueOfPi() throws Exception {
    this.mvc.perform(get("/math/pi")
        .accept(MediaType.ALL_VALUE))
        .andExpect(status().isOk())
        .andExpect(content().string("3.14159265359"));
  }

  @Test
  void addTwoNumbers() throws Exception {
    this.mvc.perform(get("/math/add?x=22&y=93")
        .accept(MediaType.ALL_VALUE))
        .andExpect(status().isOk())
        .andExpect(content().string("115.0"));
  }

  @Test
  void subtractTwoNumbers() throws Exception {
    double x = 115;
    double y = 22;
    this.mvc.perform(get(String.format("/math/subtract/%f/from/%f",y ,x))
        .accept(MediaType.ALL_VALUE))
        .andExpect(status().isOk())
        .andExpect(content().string("93.0"));
  }

  @Test
  void volumeOfTheRectangle() throws Exception {
    double x = 2;
    double y = 5;
    double z = 30;
    this.mvc.perform(get(String.format("/math/volume/%f/%f/%f", x, y, z))
        .accept(MediaType.ALL_VALUE))
        .andExpect(status().isOk())
        .andExpect(content().string("300.0"));
  }

  @Test
  void areaOfTheCircle() throws Exception {
    MockHttpServletRequestBuilder request = post("/math/area")
        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
        .param("type","circle")
        .param("radius", "6");

    this.mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(content().string("Area of a circle with a radius of 6.000000 is 113.097336."));
  }

  @Test
  void areaOfTheRectangle() throws Exception {
    MockHttpServletRequestBuilder request = post("/math/area")
        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
        .param("type","rectangle")
        .param("length", "6")
        .param("height", "10");

    this.mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(content().string("Area of a 6.000000x10.000000 rectangle is 60.000000."));
  }
}
