package head_first_design_pattern.ch12mvc.heart;

import head_first_design_pattern.ch12mvc.mvc.BPMObserver;
import head_first_design_pattern.ch12mvc.mvc.BeatModelInterface;
import head_first_design_pattern.ch12mvc.mvc.BeatObserver;

public class HeartAdapter implements BeatModelInterface {
    HeartModelInterface heart;

    public HeartAdapter(HeartModelInterface heart) {
        this.heart = heart;
    }

    @Override
    public void initialize() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setBPM(int bpm) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getBPM() {
        return heart.getHeartRate();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        heart.registerObserver(o);        
    }

    @Override
    public void removeObserver(BeatObserver o) {
        heart.removeObserver(o);        
    }

    @Override
    public void registerObserver(BPMObserver o) {
        heart.registerObserver(o);        
    }

    @Override
    public void removeObserver(BPMObserver o) {
        heart.removeObserver(o);        
    }
    
}
