import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends JFrame implements MouseListener, MouseMotionListener {
    private JLabel label;

    public MouseEventExample() {
        // Set up the frame
        setTitle("Mouse Event Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a label to display mouse events
        label = new JLabel("Mouse Event Information");
        add(label);

        // Add mouse listeners
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the Frame");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the Frame");
    }

    // MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse Dragged at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse Moved at: (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseEventExample example = new MouseEventExample();
            example.setVisible(true);
        });
    }
}
