package song;

public final class Song {
	private static String TwelveAM = new String("audio/12AM.mp3");
	private static String OneAM = new String("audio/1AM.mp3");
	private static String TwoAM = new String("audio/2AM.mp3");
	private static String ThreeAM = new String("audio/3AM.mp3");
	private static String FourAM = new String("audio/4AM.mp3");
	private static String FiveAM = new String("audio/5AM.mp3");
	private static String SixAM = new String("audio/6AM.mp3");
	private static String SevenAM = new String("audio/7AM.mp3");
	private static String EightAM = new String("audio/8AM.mp3");
	private static String NineAM = new String("audio/9AM.mp3");
	private static String TenAM = new String("audio/10AM.mp3");
	private static String ElevenAM = new String("audio/11AM.mp3");
	private static String TwelvePM = new String("audio/12PM.mp3");
	private static String OnePM = new String("audio/1PM.mp3");
	private static String TwoPM = new String("audio/2PM.mp3");
	private static String ThreePM = new String("audio/3PM.mp3");
	private static String FourPM = new String("audio/4PM.mp3");
	private static String FivePM = new String("audio/5PM.mp3");
	private static String SixPM = new String("audio/6PM.mp3");
	private static String SevenPM = new String("audio/7PM.mp3");
	private static String EightPM = new String("audio/8PM.mp3");
	private static String NinePM = new String("audio/9PM.mp3");
	private static String TenPM = new String("audio/10PM.mp3");
	private static String ElevenPM = new String("audio/11PM.mp3");
	private static String songs[] = {TwelveAM,OneAM,TwoAM,ThreeAM,FourAM,FiveAM,SixAM,SevenAM,EightAM,NineAM,TenAM,ElevenAM,
			TwelvePM,OnePM,TwoPM,ThreePM,FourPM,FivePM,SixPM,SevenPM,EightPM,NinePM,TenPM,ElevenPM};
	
	public static String getSong(int i) {
		return songs[i];
	}

}	