package com.cory.playground;

import org.springframework.stereotype.Service;

@Service
public class MathService {

  public double valueOfPi() {
    return 3.14159265359;
  }

  public double addTwoNumbers(double x, double y) {
    return x + y;
  }

  public double subtractTwoNumbers(double x, double y) {
    return x - y;
  }

  public double volumeOfTheRectangle(double x, double y, double z) {
    return x * y * z;
  }
}
