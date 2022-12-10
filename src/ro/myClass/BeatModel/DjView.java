package ro.myClass.BeatModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DjView implements ActionListener,BeatModelInterface  {
    BeatModelInterface model;
    ControllerInterface controller;
    JLabel bpmLabel;
    JTextField bpmTextField;
    JButton setBPMButton;
    JButton increaseBPMButton;
    JButton decreaseBPMButton;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;

    public void createControls() {
        // Create all Swing components here
    }
    public void enableStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }
    public void disableStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }
    public void enableStartMenuItem() {
        startMenuItem.setEnabled(true);
    }
    public void disableStartMenuItem() {
        startMenuItem.setEnabled(false);
    }
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == setBPMButton) {
            int bpm = Integer.parseInt(bpmTextField.getText());
            controller.setBPM(bpm);
        } else if (event.getSource() == increaseBPMButton) {
            controller.increaseBPM();
        } else if (event.getSource() == decreaseBPMButton) {
            controller.decreaseBPM();
        }
    }

    @Override
    public void initialize() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public int getBPM() {
        return 0;
    }

    @Override
    public void registerObserver(BeatObserver o) {

    }

    @Override
    public void removeObserver(BeatObserver o) {

    }

    @Override
    public void registerObserver(BPMObserver o) {

    }

    @Override
    public void removeObserver(BPMObserver o) {

    }

    public BeatModelInterface getModel() {
        return model;
    }

    public void setModel(BeatModelInterface model) {
        this.model = model;
    }

    public ControllerInterface getController() {
        return controller;
    }

    public void setController(ControllerInterface controller) {
        this.controller = controller;
    }

    public JLabel getBpmLabel() {
        return bpmLabel;
    }

    public void setBpmLabel(JLabel bpmLabel) {
        this.bpmLabel = bpmLabel;
    }

    public JTextField getBpmTextField() {
        return bpmTextField;
    }

    public void setBpmTextField(JTextField bpmTextField) {
        this.bpmTextField = bpmTextField;
    }

    public JButton getSetBPMButton() {
        return setBPMButton;
    }

    public void setSetBPMButton(JButton setBPMButton) {
        this.setBPMButton = setBPMButton;
    }

    public JButton getIncreaseBPMButton() {
        return increaseBPMButton;
    }

    public void setIncreaseBPMButton(JButton increaseBPMButton) {
        this.increaseBPMButton = increaseBPMButton;
    }

    public JButton getDecreaseBPMButton() {
        return decreaseBPMButton;
    }

    public void setDecreaseBPMButton(JButton decreaseBPMButton) {
        this.decreaseBPMButton = decreaseBPMButton;
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }

    public void setMenuBar(JMenuBar menuBar) {
        this.menuBar = menuBar;
    }

    public JMenu getMenu() {
        return menu;
    }

    public void setMenu(JMenu menu) {
        this.menu = menu;
    }

    public JMenuItem getStartMenuItem() {
        return startMenuItem;
    }

    public void setStartMenuItem(JMenuItem startMenuItem) {
        this.startMenuItem = startMenuItem;
    }

    public JMenuItem getStopMenuItem() {
        return stopMenuItem;
    }

    public void setStopMenuItem(JMenuItem stopMenuItem) {
        this.stopMenuItem = stopMenuItem;
    }

    public void createView() {
    }
}
