package com.cory.playground;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

  @PostMapping("/area")
  public String areaOfTheCircle(@RequestParam Map<String, String> space) {
    String type = space.get("type");
    String result = "";
    Double a = null;

    switch (type) {
      case "circle":
        double r = Double.parseDouble(space.get("radius"));
        a = mathService.areaOfTheCircle(r);
        result = String.format("Area of a circle with a radius of %f is %f.", r,a);
        break;
      case "rectangle":
        double l = Double.parseDouble(space.get("length"));
        double h = Double.parseDouble(space.get("height"));
        a = mathService.areaOfTheRectangle(l,h);
        result = String.format("Area of a %fx%f rectangle is %f.", l, h, a);
        break;
      default:
        result = "Invalid";
    }
    return result;
  }
}
