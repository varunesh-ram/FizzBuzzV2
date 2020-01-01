package com.practise.exercise;

public class FizzBuzz {

	public String generate(int inputValue) {
		String outputValue = String.valueOf(inputValue);
		if(inputValue%3 == 0)
			outputValue =  "Fizz";
		else if (inputValue%5 == 0)
			outputValue = "Buzz";
		if(inputValue == 15)
			outputValue = "FizzBuzz";
		return outputValue;
	}

}
