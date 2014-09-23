import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class numPanel extends JPanel {
	private static final long serialVersionUID = -2423434385231243596L;

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
	
	private JButton optBtn1,
					optBtn2,
					optBtn3,
					optBtn4,
					optBtn5,
					optBtn6,
					optBtn7;
	
	private JPanel p1;
	private GridBagConstraints c;
	
	public numPanel(){
		numBtn0 = new JButton("0");
		numBtn1 = new JButton("1");	
		numBtn2 = new JButton("2");
		numBtn3 = new JButton("3");
		numBtn4 = new JButton("4");
		numBtn5 = new JButton("5");
		numBtn6 = new JButton("6");
		numBtn7 = new JButton("7");
		numBtn8 = new JButton("8");
		numBtn9 = new JButton("9");
		
		optBtn1 = new JButton("C");
		optBtn2 = new JButton("/");
		optBtn3 = new JButton("*");
		optBtn4 = new JButton("-");
		optBtn5 = new JButton("+");
		optBtn6 = new JButton("=");
		optBtn7 = new JButton(".");
		
		p1 = new JPanel();
		p1.setLayout(new GridBagLayout());
		p1.setOpaque(true);
		
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(2, 2, 2, 2);
		
		SetGridLayout(p1, optBtn1, 0, 0, 1, 1);
		SetGridLayout(p1, optBtn2, 1, 0, 1, 1);
		SetGridLayout(p1, optBtn3, 2, 0, 1, 1);
		SetGridLayout(p1, optBtn4, 3, 0, 1, 1);
		SetGridLayout(p1, numBtn7, 0, 1, 1, 1);
		SetGridLayout(p1, numBtn8, 1, 1, 1, 1);
		SetGridLayout(p1, numBtn9, 2, 1, 1, 1);
		SetGridLayout(p1, optBtn5, 3, 1, 1, 2);
		SetGridLayout(p1, numBtn4, 0, 2, 1, 1);	
		SetGridLayout(p1, numBtn5, 1, 2, 1, 1);	
		SetGridLayout(p1, numBtn6, 2, 2, 1, 1);	
		SetGridLayout(p1, numBtn1, 0, 3, 1, 1);
		SetGridLayout(p1, numBtn2, 1, 3, 1, 1);
		SetGridLayout(p1, numBtn3, 2, 3, 1, 1);		
		SetGridLayout(p1, optBtn6, 3, 3, 1, 2);		
		SetGridLayout(p1, numBtn0, 0, 4, 2, 1);
		SetGridLayout(p1, optBtn7, 2, 4, 1, 1);
		
		this.setLayout(new FlowLayout());
		this.add(p1);
	}
	
	public void SetGridLayout(JPanel p,
							  Component comp,
							  int gridx,
							  int gridy,
							  int gridwidth, 
							  int gridheight){
		c.gridx = gridx; 
		c.gridy = gridy;
		c.gridwidth = gridwidth; 
		c.gridheight = gridheight;
		p.add(comp,c);
	}

}
