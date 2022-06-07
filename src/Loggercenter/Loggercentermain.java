package Loggercenter;

public class Loggercentermain {
	

	public static void main(String[] args) {
		
		Logger AsteriskLogger = new AsteriskLogger();
		Logger SpacedLogger = new SpacedLogger();
		
		AsteriskLogger.logger("Acrocanthosaurus");
		AsteriskLogger.ERROR("Error: Acrocanthosaurus");
		SpacedLogger.logger("Coahuilaceratops");
		SpacedLogger.ERROR("Coahuilaceratops");
	}

}
