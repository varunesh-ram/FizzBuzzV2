package com.practise.exercise;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	public FizzBuzz fizzBuzz;
	
	@Before
	public void InitializeFizzBuzz() {
		fizzBuzz = new FizzBuzz();
	}	
	
	@Test
	public void PassingOneToGetOutputOne() {
        Assert.assertEquals("1", fizzBuzz.generate(1));
    }
	
	@Test
	public void PassingTwoToGetOutputTwo() {
		Assert.assertEquals("2", fizzBuzz.generate(2));
	}
	
	@Test
	public void PassingThreeToGetOutputFizz() {
		Assert.assertEquals("Fizz", fizzBuzz.generate(3));
	}
	
	@Test
	public void PassingSixToGetOutputFizz() {
		Assert.assertEquals("Fizz", fizzBuzz.generate(6));
	}
	
	@Test
	public void PassingFiveToGetOutputBuzz() {
		Assert.assertEquals("Buzz", fizzBuzz.generate(5));
	}
	
	@Test
	public void PassingTenToGetOutputBuzz() {
		Assert.assertEquals("Buzz", fizzBuzz.generate(10));
	}
	
	@Test
	public void PassingFifteenToGetOutputFizzBuzz() {
		Assert.assertEquals("FizzBuzz", fizzBuzz.generate(15));
	}
	@Test
	public void PassingThirtyToGetOutputFizzBuzz() {
		Assert.assertEquals("FizzBuzz", fizzBuzz.generate(30));
	}
}
