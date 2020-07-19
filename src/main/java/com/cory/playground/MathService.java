package com.cory.playground;

import org.springframework.stereotype.Service;

@Service
public class MathService {

  public double valueOfPi() {
    return 3.14159265359;
  }

  public double addTwoValues(double x, double y) {
    return x + y;
  }
}
