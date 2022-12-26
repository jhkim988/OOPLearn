package head_first_design_pattern.ch12mvc.mvc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;

public class BeatModel implements BeatModelInterface, Runnable {
    List<BeatObserver> beatObservers = new ArrayList<>();
    List<BPMObserver> bpmObservers = new ArrayList<>();
    int bpm = 90;
    Thread thread;
    boolean stop = false;
    Clip clip;

    @Override
    public void initialize() {
        try {
            File resource = new File("clap.wav");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(resource));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void on() {
        bpm = 90;
        // notifyBPMObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();
    }

    @Override
    public void off() {
        // stopBeat();
        stop = true;        
    }

    @Override
    public void run() {
        while (!stop) {
            // playBeat();
            // notifyBeatObservers();
            try {
                Thread.sleep(60_000/getBPM());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }        
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;        
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        beatObservers.remove(o);        
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);        
    }

    @Override
    public void removeObserver(BPMObserver o) {
        bpmObservers.remove(o);
    }
}
