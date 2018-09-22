package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        // do your stuff here
        calculator.add(1, 1);
        // assert that your result is equal to your expectation
        assertThat(calculator.getTotal()).isEqualTo(2);
    }

    @Test
    public void subtract() {
        calculator.subtract(5, 4);
        assertThat(calculator.getTotal()).isEqualTo(1);
    }
}