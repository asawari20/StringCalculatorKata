package com.app.StringCalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class CalculatorTestCases {
   
	private Calculator calculator;
	
	@Before
	public void init()
	{
		calculator=new Calculator();
	}
	
	@Test
	public void return_zero_for_empty_string() throws Exception {
		//Calculator calculator=new Calculator();
		assertEquals(calculator.calculate(""), 0); //expected output will be 0
	}
	
	@Test
	public void return_number_for_single_value() throws Exception
	{
		assertEquals(calculator.calculate("1"), 1);
	}
	
	@Test
	public void return_sum_of_two_numbers() throws Exception
	{
		assertEquals(calculator.calculate("1,2"), 3);
	}
	
	@Test
	public void two_value_newline_delimeter() throws Exception
	{  assertEquals(calculator.calculate("1\n2"), 3); 
		
	}
	@Test
	public void three_number_delimeter_return_sum() throws Exception {
		assertEquals(calculator.calculate("1,2,3"), 6); 
	}
	
	@Test(expected=Exception.class)
	public void throw_exception_for_negatives() throws Exception {
		calculator.calculate("-1"); 
	}
	@Test
	public void ignore_number_greatertThan_thousand() throws Exception {
		assertEquals(calculator.calculate("10,10,1002"), 20); 

	}
}
	
		
	

