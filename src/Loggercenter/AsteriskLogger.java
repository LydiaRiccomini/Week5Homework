package Loggercenter;

public class AsteriskLogger implements Logger {

	@Override
	public void logger(String logger) {
				System.out.println(starme(logger));

	}
	private String starme(String logger) {
		return "***" + logger + "***";
	}

	@Override
	public void ERROR(String logger) {
String starredMessage = starme(logger);
String stars = "*".repeat(starredMessage.length());

System.out.println(stars);
System.out.println(starredMessage);
System.out.println(stars);
	}

}
