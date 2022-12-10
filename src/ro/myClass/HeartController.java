package ro.myClass;

import ro.myClass.BeatModel.ControllerInterface;
import ro.myClass.BeatModel.DjView;

public class HeartController implements ControllerInterface {
    HeartModelInterface model;
    DjView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DjView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    public void start() {}
    public void stop() {}

    public void increaseBPM() {}

    public void decreaseBPM() {}

    public void setBPM(int bpm) {}
}
