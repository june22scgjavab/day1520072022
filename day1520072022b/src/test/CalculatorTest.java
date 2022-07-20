package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day1520072022b.Calculator;
import day1520072022b.InvalidValueException;

class CalculatorTest {


	@Test
	void addValidTest() throws InvalidValueException {
		int num1=4;
		int num2=3;
		int expected=7;
		Calculator calc=new Calculator();
		int actual=calc.add(num1, num2);
		Assertions.assertEquals(expected, actual);
	}


	@Test
	void addInValidTest() throws InvalidValueException {
		int num1=-1;
		int num2=-2;
		
		Calculator calc=new Calculator();
	
		InvalidValueException exception=Assertions.assertThrows(InvalidValueException.class, ()->
		calc.add(num1, num2));
		Assertions.assertEquals("The values cannot be less or equal to 0",exception.getMessage());
		
	}

}
