import java.util.HashMap;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class LoginPage implements ActionListener {

    JFrame frame= new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("RESET");
    JTextField userIdField = new JTextField();
    JTextField userPasswordField= new JTextField();
    JLabel userIdLabel=new JLabel("UserId:");
    JLabel userPasswordLabel=new JLabel("Password:");
    JLabel messageLabel = new JLabel();

HashMap<String,String>logininfo=new HashMap<String,String>();

    LoginPage(HashMap<String,String>loginInfoOriginal){
        logininfo=loginInfoOriginal;

        userIdLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);
        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        userIdField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(230,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
    


      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(430,430);
      frame.setLayout(null);
      frame.setVisible(true);  

    }
    public LoginPage() {
    }
    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==resetButton){
                userIdField.setText("");
                userPasswordField.setText("");
        }
        if(e.getSource()==loginButton){
            String userID=userIdField.getText();
            String password=String.valueOf(userPasswordField.getText());
        
            if(logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(password)){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    WelcomePage welcomePage=new WelcomePage(userID);

                }
                else{
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("wRONG pASSwORD");
                }
            }
            else{
                messageLabel.setForeground(Color.red);
                messageLabel.setText("User NOT FoUnD");
            }
        }
        
    }
}
