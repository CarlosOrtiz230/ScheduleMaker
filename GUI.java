import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    //attributes
    private static int count = 0;
    private static JLabel label;  
    private static JFrame frame;
    private static JPanel panel;
    private static JButton button;

    //constructor
    public GUI(){
        frame = new JFrame();

        button = new JButton("Welcome to *****");
        button.addActionListener(this);
        button.setBounds(10,80,80,25);
        button.setSize(50,50);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
       

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Schedule Maker");
        frame.pack();
        frame.setVisible(true);

        
    }


    @Override //own implementation
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        UserVerificationGUI instance = new UserVerificationGUI();
        
    }

}