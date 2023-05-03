import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class PasswordGeneratorGUI extends JFrame implements ActionListener {
    private final JButton generateButton;
    private final JLabel passwordLabel;

    public PasswordGeneratorGUI() {
        // Set up the frame
        setTitle("Password Generator");
        setSize(400, 100);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create the generate button
        generateButton = new JButton("Generate");
        generateButton.addActionListener(this);
        add(generateButton);

        // Create the password label
        passwordLabel = new JLabel();
        add(passwordLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generateButton) {
            // Generate the password
            String password = PasswordGenerator.generatePassword();
            passwordLabel.setText(password);
        }
    }

    public static void main(String[] args) {
        new PasswordGeneratorGUI();
    }
}
