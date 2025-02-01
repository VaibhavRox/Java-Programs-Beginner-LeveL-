import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Drawshapes extends JFrame implements MouseListener,MouseMotionListener,ActionListener
{
    private int startx,starty,endx,endy;
    private String shape="Line"; //Default
    private JButton lineButton,recButton,ovalButton;
    public Drawshapes()
    {
        //Setup frame
        setTitle("Shape Drawer");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //add buttons
        JPanel bp=new JPanel();
        lineButton=new JButton("Line");
        recButton=new JButton("Rectangle");
        ovalButton=new JButton("Oval");
        lineButton.addActionListener(this);
        recButton.addActionListener(this);
        ovalButton.addActionListener(this);
        bp.add(lineButton);
        bp.add(recButton);
        bp.add(ovalButton);
        add(bp,BorderLayout.SOUTH);
        addMouseListener(this);
        addMouseMotionListener(this);
    }   
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==lineButton)
        {
            shape="Line";
        }
        else if(e.getSource()==recButton)
        {
            shape="Rectangle";
        }
        else if(e.getSource()==ovalButton)
        {
            shape="Oval";
        }
    }
    public void mousePressed(MouseEvent e)
    {
        startx=e.getX();
        starty=e.getY();
    }
    public void mouseReleased(MouseEvent e)
    {
        endx=e.getX();
        endy=e.getY();
        repaint();
    }
    public void mouseDragged(MouseEvent e)
    {
        endx=e.getX();
        endy=e.getY();
        repaint();
    }
    //implement remaining methods in mouseListener interface
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
    public void paint(Graphics g)
    {
        super.paint(g);
        if(shape.equals("Line"))
        {
            g.drawLine(startx,starty,endx,endy);
        }
        else if(shape.equals("Rectangle"))
        {
            g.drawRect(Math.min(startx,endx),Math.min(starty,endy),Math.abs(endx-startx),Math.abs(endy-starty));
        }
        else if(shape.equals("Oval"))
        {
            g.drawOval(Math.min(startx,endx),Math.min(starty,endy),Math.abs(endx-startx),Math.abs(endy-starty));
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            Drawshapes ds=new Drawshapes();
            ds.setVisible(true);
        });
    }  
}