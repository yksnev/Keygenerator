import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

class PasswordGeneratorGUI extends JFrame implements ActionListener {
    private final JButton generateButton;
    private final JLabel passwordLabel;

    public PasswordGeneratorGUI() {
        
        setTitle("Password Generator");
        setSize(400, 100);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        generateButton = new JButton("Generate");
        generateButton.addActionListener(this);
        add(generateButton);

        
        passwordLabel = new JLabel();
        add(passwordLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generateButton) {
            
            String password = PasswordGenerator.generatePassword();
            passwordLabel.setText(password);
        }
    }

    public static void main(String[] args) {
        new PasswordGeneratorGUI();
    }
}
