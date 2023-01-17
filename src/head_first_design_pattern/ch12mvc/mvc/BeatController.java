package head_first_design_pattern.ch12mvc.mvc;

public class BeatController implements ControllerInterface {
    BeatModelInterface model;
    DJView view;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
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
