package Test.MainJava.com;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class FirstApp
{
 protected JButton b1, b2;
 protected JFrame frame;
 
 public void TrackButton()
 {
 b1=new JButton("Button1");
 b1.setBounds(140,100,120,40);
 b1.addActionListener(actions);
 
 b2=new JButton("Button2");
 b2.setBounds(140,150,120,40);
 b2.addActionListener(actions);
 
 frame=new JFrame();
 frame.add(b1);
 frame.add(b2);
 frame.setSize(400, 500);
 frame.setLayout(null);
 frame.setVisible(true);
 }
 private ActionListener actions = new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent e)
 {
 if(e.getSource() == b1)
 {
	 JOptionPane.showMessageDialog(null, "I am Button 1");
 }
 else if(e.getSource() == b2)
 {
	 JOptionPane.showMessageDialog(null, "I am Button 2");
 }
 }
 };
 
 
 
 public static void main(String[] args)
 {
 FirstApp jb=new  FirstApp();
 jb.TrackButton();
 } 
}