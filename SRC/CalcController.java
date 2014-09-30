import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {
	private CalcView theView;
	private CalcModel theModel;
	
	public CalcController(CalcView theView, CalcModel theModel){
		this.theView = theView;
		this.theModel = theModel;
		
		this.theModel.setTempFirstValue(this.theView.getCurrentTxt());
		this.theView.addListener(new CalcListener());
	}
	
	class CalcListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == theView.getNumBtn0()){
				if(theModel.dispIsEmpty() == true){
					theModel.setTempFirstValue("0");
					theView.setDispText(theModel.getTempFirstValue());
				}
				else
					theModel.setTempFirstValue("0");
					theView.setDispText(theModel.getTempFirstValue());
			}
		}
	}
} 
