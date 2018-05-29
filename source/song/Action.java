package song;

import net.beadsproject.beads.core.AudioContext;
import net.beadsproject.beads.data.SampleManager;
import net.beadsproject.beads.ugens.Gain;
import net.beadsproject.beads.ugens.SamplePlayer;

public class Action {
	
	public Action() {}

	public void play() {
		AudioContext ac;
		ac = new AudioContext();
		String audioFile;
		switch(Time.getTime()){
		case 00:
			audioFile = Song.getSong(0);
			SamplePlayer player = new SamplePlayer(ac, SampleManager.sample(audioFile));
			Gain g = new Gain(ac, 2, 1);
			g.addInput(player);
			ac.out.addInput(g);
			ac.start();
			break;
		case 01:
			audioFile = Song.getSong(0);
			break;
		case 02:
			audioFile = Song.getSong(0);
			break;
		case 03:
			audioFile = Song.getSong(0);
			break;
		case 04:
			audioFile = Song.getSong(0);
			break;
		case 05:
			audioFile = Song.getSong(0);
			break;
		case 06:
			audioFile = Song.getSong(0);
			break;
		case 07:
			audioFile = Song.getSong(0);
			break;
		case 10:
			audioFile = Song.getSong(0);
			break;
		case 11:
			audioFile = Song.getSong(0);
			break;
		case 12:
			audioFile = Song.getSong(0);
			break;
		case 13:
			audioFile = Song.getSong(0);
			break;
		case 14:
			audioFile = Song.getSong(0);
			break;
		case 15:
			audioFile = Song.getSong(0);
			break;
		case 16:
			audioFile = Song.getSong(0);
			break;
		case 17:
			audioFile = Song.getSong(0);
			break;
		case 18:
			audioFile = Song.getSong(0);
			break;
		case 19:
			audioFile = Song.getSong(0);
			break;
		case 20:
			audioFile = Song.getSong(0);
			break;
		case 21:
			audioFile = Song.getSong(0);
			break;
		case 22:
			audioFile = Song.getSong(0);
			break;
		case 23:
			audioFile = Song.getSong(0);
			break;
		}
		
	}

/*case 08:
	audioFile = Song.getSong(0);
	break;
case 09:
	audioFile = Song.getSong(0);
	break;*/
}
