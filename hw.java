import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJFrame extends JFrame implements ActionListener{
    private JPanel contenPane;
    
    MyJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("計算機");
        setBounds(50, 500,300, 450);
        setVisible(true);

        contenPane = new JPanel();
        setContentPane(contenPane);
        contenPane.setLayout(new GridLayout(5,1,5,5));

        JButton btn1 = new JButton("1");
        contenPane.add(btn1);
        btn1.addActionListener(this);

        JButton btn2 = new JButton("2");
        contenPane.add(btn2);
        btn2.addActionListener(this);

        JButton btn3 = new JButton("3");
        contenPane.add(btn3);
        btn3.addActionListener(this);

        JButton btn4 = new JButton("4");
        contenPane.add(btn4);
        btn4.addActionListener(this);

        JButton btn5 = new JButton("5");
        contenPane.add(btn5);
        btn5.addActionListener(this);

        JButton btn6 = new JButton("6");
        contenPane.add(btn6);
        btn6.addActionListener(this);

        JButton btn7 = new JButton("7");
        contenPane.add(btn7);
        btn7.addActionListener(this);

        JButton btn8 = new JButton("8");
        contenPane.add(btn8);
        btn8.addActionListener(this);

        JButton btn9 = new JButton("9");
        contenPane.add(btn9);
        btn9.addActionListener(this);

        JButton btn10 = new JButton("+");
        contenPane.add(btn10);
        btn10.addActionListener(this);

        JButton btn0 = new JButton("0");
        contenPane.add(btn0);
        btn0.addActionListener(this);

        JButton btn11 = new JButton("-");
        contenPane.add(btn11);
        btn11.addActionListener(this);

        JButton btn12 = new JButton("x");
        contenPane.add(btn12);
        btn12.addActionListener(this);

        JButton btn13 = new JButton("=");
        contenPane.add(btn13);
        btn13.addActionListener(this);

        JButton btn14 = new JButton("/");
        contenPane.add(btn14);
        btn14.addActionListener(this);



    }

    public void actionPerformed(ActionEvent e){
        JButton namebtn = (JButton)e.getSource();
        JOptionPane.showMessageDialog(null, namebtn.getText());

    }

}

public class hw{
    public static void main(String[] args){
        MyJFrame f1 = new MyJFrame();
    }
}
