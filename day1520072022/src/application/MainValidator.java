package application;

public class MainValidator {

	public static void main(String[] args) {
		int age = 18;
		VoterValidator validator = new VoterValidator();
		try {
			boolean validAge = validator.validateVoterAge(18);
			System.out.println(validAge);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
