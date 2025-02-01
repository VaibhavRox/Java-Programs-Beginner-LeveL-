import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class KeyEventHandler extends JFrame 
{
    JTextField jtf;
    JLabel label;
    public KeyEventHandler()
    {
        //Setup the frame
        setSize(600,300);
        setTitle("KeyEvent Handling");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label=new JLabel("Key Event Handling!!");
        add(label);
        jtf=new JTextField(20);
        add(jtf);
        jtf.addKeyListener(new KeyAdapter() 
        {
            public void keyPressed(KeyEvent e)
            {
                label.setText("Key pressed:"+KeyEvent.getKeyText(e.getKeyCode()));
            }
            public void keyReleased(KeyEvent e)
            {
                label.setText("Key Released:"+KeyEvent.getKeyText(e.getKeyCode()));
            }
            public void keyTyped(KeyEvent e)
            {
                label.setText("Key Typed:"+String.valueOf(e.getKeyChar()));
            }

        });
    }
        public static void main(String[] args) {
        KeyEventHandler ex=new KeyEventHandler();
        ex.setVisible(true);
    }
}   