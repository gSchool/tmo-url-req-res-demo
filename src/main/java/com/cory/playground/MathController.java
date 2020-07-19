package com.cory.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

  private final MathService mathService;

  public MathController(MathService mathService) {
    this.mathService = mathService;
  }

  @GetMapping("/pi")
  public double valueOfPi() {
    return mathService.valueOfPi();
  }

  @GetMapping("/add")
  public double addTwoNumbers(@RequestParam double x, @RequestParam double y) {
    return mathService.addTwoNumbers(x,y);
  }

  @GetMapping("/subtract/{y}/from/{x}")
  public double subtractTwoNumbers(@PathVariable double x, @PathVariable double y) {
    return mathService.subtractTwoNumbers(x, y);
  }

  @RequestMapping("/volume/{x}/{y}/{z}")
  public double volumeOfTheRectangle(@PathVariable double x, @PathVariable double y, @PathVariable double z) {
    return mathService.volumeOfTheRectangle(x, y, z);
  }
}
