import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;


public class CalcView extends JFrame {
	private static final long serialVersionUID = 6619037346347971074L;
	
	private JTextField disp;
	private numPanel btnPanel;
	
	
	public CalcView(){
		this.setTitle("Basic Calculator");
		this.setLayout(new BorderLayout());
		
		disp = new JTextField();
		btnPanel = new numPanel();
		
		disp.setEditable(false);
		disp.setBackground(Color.WHITE);
		disp.setHorizontalAlignment(JTextField.RIGHT);
		
		this.add(BorderLayout.NORTH,disp);
		this.add(BorderLayout.WEST,btnPanel);
		
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
