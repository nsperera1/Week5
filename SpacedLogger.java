package week5CodingAssignment;

public class SpacedLogger implements Logger2 {

	@Override
	public void log(String log) {
		System.out.println("H E L L O"); 
		
	}

	@Override
	public void error(String error) {
		System.err.println("ERROR: H E L L O"); 
		
	}

}
