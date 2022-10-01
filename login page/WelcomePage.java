import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel= new JLabel("Hello User ");

WelcomePage(String userID){


    welcomeLabel.setBounds(10,40,2000,35);
    welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
    welcomeLabel.setText("Good-Morning "+ userID);
    
    frame.add(welcomeLabel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,420);
    frame.setLayout(null);
    frame.setVisible(true);
}
    
}
