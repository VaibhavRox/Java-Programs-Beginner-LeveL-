import javax.swing.*;
import java.awt.event.*;
class prevnext extends JFrame implements ActionListener
{
    JTextField jtf1,jtf2,jtf3;
    JLabel l1,l2,l3;
    JButton button;
    public prevnext()
    {
        setSize(600,600);
        setTitle("FASTLANE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf1=new JTextField();
        l1=new JLabel("Nothing entered");
        jtf2=new JTextField();
        l2=new JLabel("Previous number:");
        jtf3=new JTextField();
        l3=new JLabel("Next number:");
        button=new JButton("Submit?");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add components to panel
        panel.add(l1); panel.add(jtf1);
        panel.add(l2); panel.add(jtf2);
        panel.add(l3); panel.add(jtf3);
        panel.add(button);
        button.addActionListener(this);
        add(panel);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        SwingUtilities.invokeLater(() -> {
            try {
                int n = Integer.parseInt(jtf1.getText().trim());
                jtf2.setText(String.valueOf(n - 1));
                jtf3.setText(String.valueOf(n + 1));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            prevnext pr = new prevnext();
            pr.setVisible(true);
        });
    }
}