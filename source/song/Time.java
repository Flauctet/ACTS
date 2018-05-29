package song;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public final class Time {

	private static final SimpleDateFormat hour = new SimpleDateFormat("HH");
	private static final SimpleDateFormat sec = new SimpleDateFormat("ss");
	
	public static int getTime() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return Integer.parseInt(hour.format(timestamp));
	}

	public static SimpleDateFormat getHour() {
		return hour;
	}
	
	public static int getSeconds() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String second = sec.format(timestamp);
		return Integer.parseInt(second);
	}
}