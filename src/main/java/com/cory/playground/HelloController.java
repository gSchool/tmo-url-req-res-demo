package com.cory.playground;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloController {

  @GetMapping("/")
  public String helloMoto() {
    return "Hello Moto";
  }

  @GetMapping("/superSecret")
  public String secretRoute(@RequestParam String password) {
    if (!password.equals("toki")) {
      return "You do not belong here!";
    }
      return "The force is strong within you!";
  }
}
