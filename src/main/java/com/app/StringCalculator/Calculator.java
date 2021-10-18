package com.app.StringCalculator;


public class Calculator {
	
	private final String delimeter =",|\n";

	public int calculate(String value) throws Exception {
		String[] numArray = value.split(delimeter);
		
		if(isEmpty(value)) {
		return 0;
	    }
		if(value.length()==1) {
			return stringToInt(value);
		}
		else  {   
			return getSum(numArray);
		} 
		
	}
	private int getSum(String[] numArray) throws Exception  
	{
	    findException(numArray);
		int sum =0;
		
		return calculateValues(numArray);
	}
	
	private int calculateValues(String[] numArray) {
		int sum=0;
		
		for(String current:numArray) {
			if(stringToInt(current) > 1000) {
				continue;
		}
			sum+=stringToInt(current);
			
		}
		return sum;
		
	}
	
	private void findException(String[] numArray) throws Exception {
		for(String current:numArray) {
			if(stringToInt(current) <0) {
				throw new Exception("negative input");
			}
		}
	}

	private boolean isEmpty(String value) {
		// TODO Auto-generated method stub
		return value.isEmpty();
	}

	private int stringToInt(String value) {
		// TODO Auto-generated method stub
		return Integer.parseInt(value);
	}
	
	}
	

