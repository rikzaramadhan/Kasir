package app;

import model.Absent;
import view.AbsenFrame;

import javax.swing.*;

public class app {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AbsenFrame().setVisible(true);
            }
        });
    }
}
