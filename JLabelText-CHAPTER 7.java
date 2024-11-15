package jlabeltext;

import java.awt.*;
import javax.swing.*;

public class JLabelText extends JFrame {
    private JLabel label1, label2, label3; // Added label3 for the new image
    private JTextField textField1;
    private JButton plainButton, fancyButton1, fancyButton2; // Added fancyButton2
    private JTextField textA;    
    private JTextArea textBox1;
    private JRadioButton b1, b2, b3;
    private JCheckBox cb1, cb2;
    private JComboBox<String> comboBox;

    public JLabelText() {
        super("Testing JLabel");
        Container container = getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // First label
        label1 = new JLabel("CHOOSE YOUR TEAM");
        gbc.gridx = 0; // Column 0
        gbc.gridy = 0; // Row 0
        gbc.insets = new Insets(10, 10, 10, 10); // Add some padding
        container.add(label1, gbc);

        // Second label with first icon
        Icon rabbit = new ImageIcon("resize-17297606161752226910600pxFnaticONICIDallmode-removebg-preview.png");
        label2 = new JLabel("ONIC", rabbit, SwingConstants.LEFT);
        label2.setToolTipText("This is an animated ONIC");
        
        // Third label with second icon (new image)
        Icon newIcon = new ImageIcon("resize-17297609441907984677ECHOallmodefull-removebg-preview.png"); // Replace with the correct path
        label3 = new JLabel("ECHO", newIcon, SwingConstants.LEFT);
        label3.setToolTipText("This is the new image");

        // Set layout for label2 and label3 to be side by side
        JPanel labelPanel = new JPanel(new FlowLayout());
        labelPanel.add(label2);
        labelPanel.add(label3);
        
        // Add the labelPanel to the container
        gbc.gridx = 0; // Column 0
        gbc.gridy = 1; // Row 1
        container.add(labelPanel, gbc);

        // Text field
        textField1 = new JTextField(50);
        gbc.gridx = 0; // Column 0
        gbc.gridy = 2; // Row 2
        gbc.fill = GridBagConstraints.HORIZONTAL; // Fill the horizontal space
        container.add(textField1, gbc);

        // Plain button
        plainButton = new JButton("SUBMIT");
        gbc.gridx = 0; // Column 0
        gbc.gridy = 3; // Row 3
        gbc.fill = GridBagConstraints.NONE; // Reset fill
        container.add(plainButton, gbc);
        
        // Create a panel to hold the seat buttons
        JPanel seatButtonPanel = new JPanel(new FlowLayout());

        // First fancy button with icon
        Icon bug1 = new ImageIcon("resize-17297623151532464963360F827135775NnduyXdCGInCZpPU1gccT32btfL2KvQe-removebg-preview.png");
        fancyButton1 = new JButton("STANDARD SEAT", bug1);
        seatButtonPanel.add(fancyButton1); // Add to the panel

        // Second fancy button with icon
        Icon bug2 = new ImageIcon("resize-1729762656992732719chairvectorillustration1249925619-removebg-preview.png"); // Use a different icon
        fancyButton2 = new JButton("PREMIUM SEAT", bug2);
        seatButtonPanel.add(fancyButton2); // Add to the panel

        // Add the seatButtonPanel to the container
        gbc.gridx = 0; // Column 0
        gbc.gridy = 4; // Row 4 (the same row for the buttons)
        container.add(seatButtonPanel, gbc);
        
        // Set preferred size for the plain button
        plainButton.setPreferredSize(new Dimension(100, 70));
        
        // Final frame settings
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensuring the application closes
        
        // Radio buttons
        JLabel paymentMethodLabel = new JLabel("PAYMENT METHOD:");
        gbc.gridx = 0; // Adjust column if needed
        gbc.gridy = 5; // Place above radio buttons
        container.add(paymentMethodLabel, gbc);

        b1 = new JRadioButton("eWallet");
        b2 = new JRadioButton("Online Transfer");    
        gbc.gridx = 0; // Adjust column if needed
        gbc.gridy = 6; // Place below payment method label
        container.add(b1, gbc);
        gbc.gridy = 7; // Next row for the next button
        container.add(b2, gbc);
        
        // Checkboxes
        cb1 = new JCheckBox("I Agree to the Terms & Condition");      
        gbc.gridy = 8; // Place below radio buttons
        container.add(cb1, gbc);
        gbc.gridy = 9; // Next row for the next checkbox
        container.add(cb2, gbc);
        
        // ComboBox
        String names[] = {"kuih", "kuih1", "kuih3"};
        comboBox = new JComboBox<>(names);
        gbc.gridx = 0; // Adjust column if needed
        gbc.gridy = 10; // Place below checkboxes
        container.add(comboBox, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JLabelText());
    }
}
