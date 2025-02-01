import javax.swing.JOptionPane;
class GUIINTRO
{
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Enter your name :");
        JOptionPane.showMessageDialog(null,"Hellow "+ name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        JOptionPane.showMessageDialog(null,"You are "+age+"old");
    }
}
