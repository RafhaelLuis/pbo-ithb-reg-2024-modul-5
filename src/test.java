import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class test {
    public static void main(String[] args) {
        JFrame cobain = new JFrame("GridBagLayout Example");
        cobain.setBounds(1920 / 2 - 150, 1080 / 2 - 150, 300, 300);
        cobain.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cobain.setLayout(new GridBagLayout()); // Use GridBagLayout


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.VERTICAL;

        // Submit button (spanning 2 columns)
        JButton submitButton = new JButton("Submit");
        gbc.gridx = 0; // Column 0
        gbc.gridy = 0; // Row 0
        gbc.gridheight = 2; // Span 2 columns
        cobain.add(submitButton, gbc);

        // Reset button
        JButton resetButton = new JButton("Reset");
        gbc.gridx = 1; // Column 0
        gbc.gridy = 0; // Row 1
        gbc.gridheight = 1; // Span 1 column
        cobain.add(resetButton, gbc);

        // Exit button
        JButton exitButton = new JButton("Exit");
        gbc.gridx = 1; // Column 1
        gbc.gridy = 1; // Row 1
        gbc.gridheight = 1; // Span 1 column
        cobain.add(exitButton, gbc);

        // Make the frame visible
        cobain.setVisible(true);
    }
}
