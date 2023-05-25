package frame.background_processing;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowAction extends JFrame {
    
    public WindowAction() {
        this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    performWindowClosing(e);
                }
                
                @Override
                public void windowOpened(WindowEvent e) {
                    performWindowOpened(e);
                }
        });
        
    }
    
    private void performWindowOpened(WindowEvent e) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        
        this.setLocation((dimension.width - this.getWidth()) / 2,
                (dimension.height - this.getHeight()) / 2);
    }
    
    private void performWindowClosing(WindowEvent e) {
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure want to exit?",
                "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION, new ImageIcon(getClass().getResource("/images/logo/logo.png")));
        if (confirm == JOptionPane.YES_NO_OPTION) {
            goodBye();
            System.exit(0);
        }
    }
    
    private void goodBye() {
        JOptionPane.showMessageDialog(this,
                "Thank you for using Crime File system\nGood bye and see you later!",
                "THANK YOU!", JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(getClass().getResource("/images/logo/logo.png")));
    }
}