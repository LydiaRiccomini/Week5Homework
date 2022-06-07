package Loggercenter;

public class SpacedLogger implements Logger {

	@Override
	public void logger(String logger) {
		StringBuilder builder = new StringBuilder();

		for(int pos = 0; pos < logger.length(); pos += 1) {
		builder.append(logger.charAt(pos)).append(" ");
		}
		
		builder.deleteCharAt(builder.length() - 1);
		System.out.println(builder);
	}

	@Override
	public void ERROR(String logger) {
		StringBuilder builder = new StringBuilder();

		for(int pos = 0; pos < logger.length(); pos += 1) {
		builder.append(logger.charAt(pos)).append(" ");
		}
		
		builder.deleteCharAt(builder.length() - 1);
		System.out.println("ERROR: " + builder);
	}	
	}		