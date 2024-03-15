 package demoswing2;

import javax.swing.*;
import java.awt.*;

public class AboutUsFrame extends JFrame {
    

    public AboutUsFrame() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("About Us - Service Hub Company");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("About Us - Service Hub Company");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextArea aboutTextArea = new JTextArea();
        aboutTextArea.setEditable(false);
        aboutTextArea.setLineWrap(true);
        aboutTextArea.setWrapStyleWord(true);
        aboutTextArea.setText("Welcome to Service Hub Company, your one-stop solution for all your service needs. " +
                "We are dedicated to providing high-quality and efficient services across various domains, " +
                "including maintenance, repairs, and support.\n\n" +
                "Our team of skilled professionals is committed to ensuring customer satisfaction. " +
                "With a focus on reliability and excellence, we strive to meet and exceed your expectations.\n\n" +
                "At Service Hub Company, we believe in a systematic approach to delivering services. " +
                "Our streamlined processes and advanced technologies enable us to optimize efficiency " +
                "while maintaining the highest standards of quality.\n\n" +
                "Thank you for choosing Service Hub Company. We look forward to serving you!");

        mainPanel.add(titleLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(aboutTextArea);

        add(mainPanel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AboutUsFrame());
    }
}
