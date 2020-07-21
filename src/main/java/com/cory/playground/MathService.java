package com.cory.playground;

import static java.lang.Math.pow;

import org.springframework.stereotype.Service;

@Service
public class MathService {
  private final static double PI = 3.14159265359;

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

  public double areaOfTheCircle(double r) {
    return PI * Math.pow(r,2);
  }

  public double areaOfTheRectangle(double l, double h) {
    return l * h;
  }
}
