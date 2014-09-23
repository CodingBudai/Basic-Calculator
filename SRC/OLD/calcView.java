package basiccalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calcView extends JFrame implements ActionListener{
    int x,y,z;
    String res = "";
    JLabel fnum;
    JLabel snum;
    JLabel result;
        
    JTextField fField = new JTextField(10);
    JTextField sField = new JTextField(10);
    JTextField rField = new JTextField(10);
    
    JButton add;
    JButton sub;
    JButton multi;
    JButton div;

    public calcView(){

        setLayout(new FlowLayout());
        fnum = new JLabel("Enter first number:");
        fField = new JTextField("0", 10);
        snum = new JLabel("Enter second number: ");  
        sField = new JTextField("0", 10);
        result = new JLabel("Result: ");
        rField = new JTextField("0", 10);
        add = new JButton("+");
        sub = new JButton("-");
        multi = new JButton("*");
        div = new JButton("/");
        
        rField.setEditable(false);

        add(fnum);
        add(fField);
        add(snum);
        add(sField);
        add(result);
        add(rField);
        add(add);
        add(sub);
        add(multi);
        add(div);
        
        add.addActionListener(this);
        sub.addActionListener(this);
        multi.addActionListener(this);
        div.addActionListener(this);

       setTitle("Basic Calculator");
         this.setSize(300, 200);
         this.setResizable(false);
         this.setVisible(true);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == add){
        x = Integer.parseInt(fField.getText());
        y = Integer.parseInt(sField.getText());
        z = x + y;
        
        res = Integer.toString(z);
        rField.setText(res);  
        }
        
        if(e.getSource() == sub){
        x = Integer.parseInt(fField.getText());
        y = Integer.parseInt(sField.getText());
        z = x - y;
        
        res = Integer.toString(z);
        rField.setText(res);  
        }
        if(e.getSource() == multi){
        x = Integer.parseInt(fField.getText());
        y = Integer.parseInt(sField.getText());
        z = x * y;
        
        res = Integer.toString(z);
        rField.setText(res);  
        }
        if(e.getSource() == div){
        x = Integer.parseInt(fField.getText());
        y = Integer.parseInt(sField.getText());
        z = x / y;
        
        res = Integer.toString(z);
        rField.setText(res);  
        }
    }
}
