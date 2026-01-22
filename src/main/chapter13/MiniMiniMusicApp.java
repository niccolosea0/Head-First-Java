import javax.sound.midi.*; // import midi package
import static javax.sound.midi.ShortMessage.*; // static to use constants in the ShortMessage class

public class MiniMiniMusicApp {
    public static void main(String[] args) {

        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
        try {
            // Get a sequencer and open it (sequencer does not come already open)
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            // Ask the Sequence for a Track. Remember, the Track
            // lives in the Sequence and the MIDI data lives in the Track
            Track track = seq.createTrack();


            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(NOTE_ON, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(msg1, 1);
            track.add(noteOn);

            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(NOTE_OFF, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(msg2, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
