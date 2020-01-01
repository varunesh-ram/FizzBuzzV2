package com.practise.exercise;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
	public FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	public void PassingOneToGetOutputOne() {
        Assert.assertEquals(1, fizzBuzz.generate(1));
    }
	
	@Test
	public void PassingTwoToGetOutputTwo() {
		Assert.assertEquals(2, fizzBuzz.generate(2));
	}
	

}
