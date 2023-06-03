package week5CodingAssignment;

public class Application {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello");
		logger.error("Hello");
		
		Logger2 logger2 = new SpacedLogger();
		logger.log("Hello");
		logger.error("Hello");

	}

}
