package demoswing2;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class ContactUsFrame extends JFrame {

    public ContactUsFrame() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Contact Us - Service Hub Company");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 3, 10, 10));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Create Contact Panels
        String[] names = {"Hemant Devde", "Vishal Patel", "Varsha Jat", "Umesh Rathore", "Yathrth Gupta", "Shivani Sendhav"};
        String[] numbers = {"+91-9893548642", "+91-8103748593", "+91 78282 10592", "+91 82695 77377", "+91 70890 19440", "+91 97555 67836"};
        String[] emails = {"hemantdevde29@gmail.com", "vishal362patel@gmail.com", "varshajat1352022@gmail.com",
                            "umeshrathore123@gmail.com", "yathartgupta@gmail.com", "shivanisendhav@gmail.com"};
        String[] imagePaths = {"homebg3.jpg", "vishal22.jpg", "path_to_image3.jpg",
                                "path_to_image4.jpg", "path_to_image5.jpg", "path_to_image6.jpg"};

        for (int i = 0; i < names.length; i++) {
            JPanel contactPanel = createContactPanel(names[i], numbers[i], emails[i], imagePaths[i]);
            mainPanel.add(contactPanel);
        }

        add(mainPanel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createContactPanel(String name, String number, String email, String imagePath) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel numberLabel = new JLabel("Mobile Number: " + number);
        numberLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel emailLabel = new JLabel("Email: " + email);
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(nameLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(numberLabel);
        panel.add(emailLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(imageLabel);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ContactUsFrame());
    }
}
