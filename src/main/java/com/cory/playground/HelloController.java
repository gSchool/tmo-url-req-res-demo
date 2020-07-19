package com.cory.playground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloController {

  private final MathService mathService;

  public HelloController(MathService mathService) {
    this.mathService = mathService;
  }

  @GetMapping("/")
  public String helloMoto() {
    return "Hello Moto";
  }

  @GetMapping("superSecret")
  public String secretRoute(@RequestParam String password) {
    if (!password.equals("toki")) {
      System.out.println("You do not belong here!");
    }
      return "The force is strong within you!";
  }

  @GetMapping("math/pi")
  public double valueOfPi() {
    return mathService.valueOfPi();
  }

  @GetMapping("math/add")
  public double addTwoNumbers(double x, double y) {
    return mathService.addTwoValues(x,y);
  }

}
