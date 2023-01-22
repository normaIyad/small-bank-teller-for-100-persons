import java.util.Date ;
import javax.swing.*;
import java.awt.event.*;
import java.text.DateFormat;
import javax.swing.Timer;
public class ClockPane extends JPanel {
     private JLabel clock1 = new JLabel () ;
    public ClockPane(){
        tickTock();
        clock1.setFont(clock1.getFont().deriveFont(20.0f));
         add (clock1);
         Timer timer = new Timer(200 , new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e ){
                tickTock() ;
            }
        });
        timer.start();
    }
    public void tickTock(){     
            clock1.setText(DateFormat.getTimeInstance().format(new Date()) );
        }
}
