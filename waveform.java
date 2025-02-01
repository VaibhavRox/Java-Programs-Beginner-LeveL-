import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class waveform extends JFrame implements ActionListener
{
    private boolean draw=false;
    public waveform()
    {
        setTitle("Waveform Drawer");
        setSize(800,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //button to start wave
        JButton start=new JButton("Start waveform?");
        start.addActionListener(this);
        add(start,BorderLayout.SOUTH);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        if(draw)
        {
            g.setColor(Color.BLUE);
            //get height and width of frame
            int width=getWidth();
            int height=getHeight();
            int amplitude=100;
            int freq=2;
            //draw waveform usin sin function
            for(int x=0;x<width;x++)
            {
                int y = (int) (height / 2 + amplitude * Math.sin((2 * Math.PI * freq * x) / width));
                g.drawLine(x,y,x,y);
            }
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        draw=true;
        repaint();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            waveform frame=new waveform();
            frame.setVisible(true);
        });
    }
}