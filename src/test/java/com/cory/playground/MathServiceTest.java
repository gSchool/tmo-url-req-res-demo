package com.cory.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {
  public MathService mathService = new MathService();

  @Test
  public void return_pi_from_math_service() throws Exception {

    assertEquals(mathService.valueOfPi(), 3.14159265359);
  }

  @Test
  public void return_the_sum_of_two_values() throws Exception {
    int x = 17;
    int y = 13;
    assertEquals(30, mathService.addTwoValues(x, y));
  }

}
