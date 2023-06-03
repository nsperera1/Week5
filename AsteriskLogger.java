package week5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***Hello***");
		
	}

	@Override
	public void error(String error) {
		System.err.println("***Error: Hello***");
		
	}

}
