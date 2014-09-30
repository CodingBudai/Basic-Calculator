import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CalcView extends JFrame{
	private static final long serialVersionUID = 6619037346347971074L;
	
	private JTextField disp;
	private numPanel btnPanel;
	
	private JButton numBtn0,
					numBtn1,	
					numBtn2,
					numBtn3,
					numBtn4,
					numBtn5,
					numBtn6,
					numBtn7,
					numBtn8,
					numBtn9;

	private JButton optBtn0,
					optBtn1,
					optBtn2,
					optBtn3,
					optBtn4,
					optBtn5,
					optBtn6;
	
	public CalcView(){
		this.setTitle("Basic Calculator");
		this.setLayout(new BorderLayout());
		
		disp = new JTextField();
		btnPanel = new numPanel();
		
		numBtn0 = btnPanel.getNumBtn0();
		numBtn1 = btnPanel.getNumBtn1();
		numBtn2 = btnPanel.getNumBtn2();
		numBtn3 = btnPanel.getNumBtn3();
		numBtn4 = btnPanel.getNumBtn4();
		numBtn5 = btnPanel.getNumBtn5();
		numBtn6 = btnPanel.getNumBtn6();
		numBtn7 = btnPanel.getNumBtn7();
		numBtn8 = btnPanel.getNumBtn8();
		numBtn9 = btnPanel.getNumBtn9();
			
		optBtn0 = btnPanel.getOptBtn0();
		optBtn1 = btnPanel.getOptBtn1();
		optBtn2 = btnPanel.getOptBtn2();
		optBtn3 = btnPanel.getOptBtn3();
		optBtn4 = btnPanel.getOptBtn4();
		optBtn5 = btnPanel.getOptBtn5();
		optBtn6 = btnPanel.getOptBtn6();
		
		disp.setEditable(false);
		disp.setBackground(Color.WHITE);
		disp.setHorizontalAlignment(JTextField.RIGHT);
		
		this.add(BorderLayout.NORTH,disp);
		this.add(BorderLayout.WEST,btnPanel);
		
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void addListener(ActionListener l){
		numBtn0.addActionListener(l);
		numBtn1.addActionListener(l);
		numBtn2.addActionListener(l);
		numBtn3.addActionListener(l);
		numBtn4.addActionListener(l);
		numBtn5.addActionListener(l);
		numBtn6.addActionListener(l);
		numBtn7.addActionListener(l);
		numBtn8.addActionListener(l);
		numBtn9.addActionListener(l);
		
		optBtn0.addActionListener(l);
		optBtn1.addActionListener(l);
		optBtn2.addActionListener(l);
		optBtn3.addActionListener(l);
		optBtn4.addActionListener(l);
		optBtn5.addActionListener(l);
		optBtn6.addActionListener(l);
	}
	
	public JButton getNumBtn0(){
		return this.numBtn0;
	}
	
	public JButton getNumBtn1(){
		return this.numBtn1;
	}
	
	public JButton getNumBtn2(){
		return this.numBtn2;
	}
	
	public JButton getNumBtn3(){
		return this.numBtn3;
	}
	
	public JButton getNumBtn4(){
		return this.numBtn4;
	}
	
	public JButton getNumBtn5(){
		return this.numBtn5;
	}
	
	public JButton getNumBtn6(){
		return this.numBtn6;
	}
	
	public JButton getNumBtn7(){
		return this.numBtn7;
	}
	
	public JButton getNumBtn8(){
		return this.numBtn8;
	}
	
	public JButton getNumBtn9(){
		return this.numBtn9;
	}
	
	public JButton getOptBtn0(){
		return this.optBtn0;
	}
	
	public JButton getOptBtn1(){
		return this.optBtn1;
	}
	
	public JButton getOptBtn2(){
		return this.optBtn2;
	}
	
	public JButton getOptBtn3(){
		return this.optBtn3;
	}
	
	public JButton getOptBtn4(){
		return this.optBtn4;
	}
	
	public JButton getOptBtn5(){
		return this.optBtn5;
	}
	
	public JButton getOptBtn6(){
		return this.optBtn6;
	}
	
	public void setDispText(String txt){
		disp.setText(txt);
	}
	
	public String getCurrentTxt(){
		return disp.getText();
	}
}
