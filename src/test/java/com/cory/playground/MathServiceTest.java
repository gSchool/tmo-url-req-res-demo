package com.cory.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {
  public MathService mathService = new MathService();

  @Test
  public void valueOfPi() throws Exception {
    assertEquals(3.14159265359, mathService.valueOfPi(), "The value of PI was not returned.");
  }

  @Test
  public void addTwoNumbers() throws Exception {
    double x = 17;
    double y = 13;
    assertEquals(30, mathService.addTwoNumbers(x, y), "Expecting actual value to be 30.");
  }

  @Test
  public void subtractTwoNumbers() throws Exception {
    double x = 30;
    double y = 13;
    assertEquals(17.0, mathService.subtractTwoNumbers(x, y), "Expected actual value to be 17.0.");
  }

  @Test
  public void volumeOfTheRectangle() throws Exception {
    double x = 2;
    double y = 5;
    double z = 30;
    assertEquals(300, mathService.volumeOfTheRectangle(x, y, z), "Expected actual value to be 300.");
  }

  @Test
  public void areaOfTheCircle() throws Exception {
    double r = 4;
    assertEquals(50.26548245744, mathService.areaOfTheCircle(r), "Expected actual value to be 50.26548245744");
  }

  @Test
  public void areaOfTheRectangle() throws Exception {
    double x = 4;
    double y = 7;
    assertEquals(28, mathService.areaOfTheRectangle(x,y), "Expected actual value to be 28.");
  }
}
