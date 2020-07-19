package com.cory.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

  @GetMapping("/pi")
  public String valueOfPi() {
    return "3.14159265359";
  }
}
