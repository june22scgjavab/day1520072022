package day1520072022b;

public class Calculator {

	
	public int add(int a,int b) throws InvalidValueException {
		
		if(a<0 && b<0)
		{
			throw new InvalidValueException("The values cannot be less or equal to 0");
		}
		
		return a+b;
	}
}
