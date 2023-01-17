package head_first_design_pattern.ch12mvc.heart;

import head_first_design_pattern.ch12mvc.mvc.BPMObserver;
import head_first_design_pattern.ch12mvc.mvc.BeatObserver;

public interface HeartModelInterface {
    int getHeartRate();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
