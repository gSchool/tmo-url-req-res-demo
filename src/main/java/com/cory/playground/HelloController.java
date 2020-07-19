package com.cory.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/")
  public String helloMoto() {
    return "Hello Moto";
  }

  @GetMapping("/superSecret")
  public String secretRoute(@RequestParam String password) {
    if (!password.equals("toki")) {
      System.out.println("You do not belong here!");
    }
      return "The force is strong within you!";
  }

}
