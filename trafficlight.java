import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class trafficlight extends JFrame implements ActionListener
{
    JRadioButton stop,ready,go;
    String msg="";
    public trafficlight()
    {
        setTitle("Traffic Light");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();
        ButtonGroup group=new ButtonGroup();
        stop=new JRadioButton("Stop");
        stop.setBounds(100,100,50,30);
        ready=new JRadioButton("Ready");
        ready.setBounds(100,110,50,30);
        go= new JRadioButton("Go");
        go.setBounds(100,120,50,30);
        group.add(stop);
        group.add(ready);
        group.add(go);
        panel.add(stop);
        panel.add(ready);
        panel.add(go);
        stop.addActionListener(this);
        ready.addActionListener(this);
        go.addActionListener(this);
        add(panel);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==stop)
        {
            msg="stop";
        }
        else if(e.getSource()==ready)
        {
            msg="ready";
        }
        else if(e.getSource()==go)
        {
            msg="go";
        }
        repaint();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawOval(165, 140,50,50);
        g.drawOval(165, 200,50,50);
        g.drawOval(165, 260,50,50);
        if(msg.equals("stop"))
        {
            g.setColor(Color.RED);
            g.fillOval(165, 140,50,50);
        }
        else if(msg.equals("ready"))
        {
            g.setColor(Color.YELLOW);
            g.fillOval(165, 200,50,50);
        }
        else if(msg.equals("go"))
        {
            g.setColor(Color.GREEN);
            g.fillOval(165, 260,50,50);
        }
    }
    public static void main(String[] args) {
        trafficlight tf=new trafficlight();
        tf.setVisible(true);
    }
}