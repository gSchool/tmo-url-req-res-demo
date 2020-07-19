package com.cory.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {
  public MathService mathService = new MathService();

  @Test
  public void valueOfPi() throws Exception {
    assertEquals(mathService.valueOfPi(), 3.14159265359);
  }

  @Test
  public void addTwoNumbers() throws Exception {
    double x = 17;
    double y = 13;
    assertEquals(30, mathService.addTwoNumbers(x, y));
  }

  @Test
  public void subtractTwoNumbers() throws Exception {
    double x = 30;
    double y = 13;
    assertEquals(17.0,mathService.subtractTwoNumbers(x, y));
  }

  @Test
  public void volumeOfTheRectangle() throws Exception {
    double x = 2;
    double y = 5;
    double z = 30;
    assertEquals(300,mathService.volumeOfTheRectangle(x, y, z));
  }
}
