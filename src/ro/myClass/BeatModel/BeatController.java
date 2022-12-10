package ro.myClass.BeatModel;

public class BeatController implements ControllerInterface {
    BeatModelInterface model;
    DjView view;

    public BeatController(BeatModelInterface model) {
        BeatModelInterface model;
        DJView view;

 public BeatController(BeatModelInterface model) {
            this.model = model;
            view = new DjView(this, model);
           view
            model.initialize();
        }

        public void start() {
            model.on();
            view.disableStartMenuItem();
            view.enableStopMenuItem();
        }

        public void stop() {
            model.off();
            view.disableStopMenuItem();
            view.enableStartMenuItem();
        }

        public void increaseBPM() {
            int bpm = model.getBPM();
            model.setBPM(bpm + 1);
        }

        public void decreaseBPM() {
            int bpm = model.getBPM();
            model.setBPM(bpm - 1);
        }

        public void setBPM(int bpm) {
            model.setBPM(bpm);
        }
}
