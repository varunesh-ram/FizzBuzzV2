package com.practise.exercise;

public class FizzBuzz {

	public String generate(int inputValue) {
		String outputValue = String.valueOf(inputValue);
		if(inputValue%3 == 0)
			outputValue =  "Fizz";
		else if (inputValue == 5)
			outputValue = "Buzz";
		return outputValue;
	}

}
