package application;

import exceptions.InvalidAgeException;

public class VoterValidator {
	
	public boolean validateVoterAge(int age) throws InvalidAgeException {
		if(age<0)
			throw new InvalidAgeException("Invalid age");
		if(age >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
}
