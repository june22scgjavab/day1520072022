package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import application.VoterValidator;
import exceptions.InvalidAgeException;

class VoterValidatorTest {

	VoterValidator vv;
	/*
	 * @BeforeAll static void setUpBeforeClass() throws Exception {
	 * System.out.println("I am called once before testing starts"); }
	 * 
	 * @AfterAll static void tearDownAfterClass() throws Exception {
	 * System.out.println("I am called once when testing ends"); }
	 * 
	 * @BeforeEach void setUp() throws Exception { vv=new VoteValidator();
	 * System.out.println("I am called before each test"); }
	 * 
	 * @AfterEach void tearDown() throws Exception {
	 * System.out.println("I am called after each test"); vv=null; }
	 */
// 

	// method name which we are testing
	// Valid/Invalid based on whether we are testing with
	// positive tests or negative tests

	@Test
	void validateVoterAgeValidTest() throws Exception {
		int age = 17; // input
		VoterValidator voterValidator = new VoterValidator(); // create an object of the class whose method we want to
																// test
		boolean validAge = voterValidator.validateVoterAge(age); // validAge holds the actual output
		Assertions.assertTrue(validAge);
	}

	@Test
	void validateVoterAgeInvalidTest() throws Exception {
		int age = 17; // input
		VoterValidator voterValidator = new VoterValidator(); // create an object of the class whose method we want to
																// test
		boolean validAge = voterValidator.validateVoterAge(age); // validAge holds the actual output
		Assertions.assertFalse(validAge);
	}

	@Test
	void validateVoterAgeInvalidTest2() {
		int age = -17; // input
		VoterValidator voterValidator = new VoterValidator();
		InvalidAgeException exception = Assertions.assertThrows(InvalidAgeException.class, () -> voterValidator.validateVoterAge(age));
		Assertions.assertEquals("Invalid age", exception.getMessage());
	}
	
	@ParameterizedTest
	@CsvSource(value = {"19, true","20,true","17,false","16,false"})
	public void validateVoterAgeTestParameter(int age, boolean expected) throws Exception {
		VoterValidator voterValidator = new VoterValidator();
		boolean actual = voterValidator.validateVoterAge(age);
		Assertions.assertEquals(expected, actual);
	}


}
