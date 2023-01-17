package head_first_design_pattern.ch12mvc.heart;

import head_first_design_pattern.ch12mvc.mvc.ControllerInterface;
import head_first_design_pattern.ch12mvc.mvc.DJView;

public class HeartController implements ControllerInterface {
    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void increaseBPM() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void decreaseBPM() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setBPM(int bpm) {
        // TODO Auto-generated method stub
        
    }
}
