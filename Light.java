import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class Light extends JFrame implements ActionListener
{
public JLabel l1;
public JRadioButton r1, r2, r3;
public ButtonGroup bg;
public Light()
{JFrame f=new JFrame("Traffic Lights");
f.setSize(500,400);
r1=new JRadioButton("RED");
r2=new JRadioButton("YELLOW");
r3=new JRadioButton("GREEN");
r1.setBounds(75,50,100,30);
r2.setBounds(75,150,100,30);
r3.setBounds(75,250,100,30);
r1.setBackground(Color.red);
r2.setBackground(Color.yellow);
r3.setBackground(Color.green);
f.add(r1);
f.add(r2);
f.add(r3);
bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);
bg.add(r3);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
l1 = new JLabel("-----");
l1.setBounds(250,100,250,80);
Font ft = new Font("Verdana", Font.BOLD, 50);
l1.setFont(ft);
f.add(l1);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{
String str = "";
Color c1 = Color.black;
if (r1.isSelected())
{
str = "STOP";
c1 = Color.red;
}
if (r2.isSelected())
{
str = "READY";
c1 = Color.yellow;
}
if (r3.isSelected())
{
str = "GO";
c1 = Color.green;
}
l1.setText(str);
l1.setForeground(c1);
}
}

