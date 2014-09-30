import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {
	private CalcView theView;
	private CalcModel theModel;
	
	public CalcController(CalcView theView, CalcModel theModel){
		this.theView = theView;
		this.theModel = theModel;
		
		//this.theModel.setTempFirstValue(this.theView.getCurrentTxt());
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
				else{
					theModel.setTempFirstValue("0");
					theView.setDispText(theModel.getTempFirstValue());
				}
			}
			if(e.getSource() == theView.getNumBtn1()){
				if(theModel.dispIsEmpty() == true){
					theModel.setTempFirstValue("1");
					theView.setDispText(theModel.getTempFirstValue());
				}
				else{
					theModel.setTempFirstValue("1");
					theView.setDispText(theModel.getTempFirstValue());
				}
			}
			if(e.getSource() == theView.getNumBtn2()){
				if(theModel.dispIsEmpty() == true){
					theModel.setTempFirstValue("2");
					theView.setDispText(theModel.getTempFirstValue());
				}
				else{
					theModel.setTempFirstValue("2");
					theView.setDispText(theModel.getTempFirstValue());
				}
			}
			if(e.getSource() == theView.getNumBtn3()){
				if(theModel.dispIsEmpty() == true){
					theModel.setTempFirstValue("3");
					theView.setDispText(theModel.getTempFirstValue());
				}
				else{
					theModel.setTempFirstValue("3");
					theView.setDispText(theModel.getTempFirstValue());
				}
			}
			if(e.getSource() == theView.getNumBtn4()){
				if(theModel.dispIsEmpty() == true){
					theModel.setTempFirstValue("4");
					theView.setDispText(theModel.getTempFirstValue());
				}
				else{
					theModel.setTempFirstValue("4");
					theView.setDispText(theModel.getTempFirstValue());
				}
			}
			if(e.getSource() == theView.getNumBtn5()){
				if(theModel.dispIsEmpty() == true){
					theModel.setTempFirstValue("5");
					theView.setDispText(theModel.getTempFirstValue());
				}
				else{
					theModel.setTempFirstValue("5");
					theView.setDispText(theModel.getTempFirstValue());
				}
			}
			if(e.getSource() == theView.getNumBtn6()){
				if(theModel.dispIsEmpty() == true){
					theModel.setTempFirstValue("6");
					theView.setDispText(theModel.getTempFirstValue());
				}
				else{
					theModel.setTempFirstValue("6");
					theView.setDispText(theModel.getTempFirstValue());
				}
			}
			if(e.getSource() == theView.getNumBtn7()){
				if(theModel.dispIsEmpty() == true){
					theModel.setTempFirstValue("7");
					theView.setDispText(theModel.getTempFirstValue());
				}
				else{
					theModel.setTempFirstValue("7");
					theView.setDispText(theModel.getTempFirstValue());
				}
			}
			if(e.getSource() == theView.getNumBtn8()){
				if(theModel.dispIsEmpty() == true){
					theModel.setTempFirstValue("8");
					theView.setDispText(theModel.getTempFirstValue());
				}
				else{
					theModel.setTempFirstValue("8");
					theView.setDispText(theModel.getTempFirstValue());
				}
			}
			if(e.getSource() == theView.getNumBtn9()){
				if(theModel.dispIsEmpty() == true){
					theModel.setTempFirstValue("9");
					theView.setDispText(theModel.getTempFirstValue());
				}
				else{
					theModel.setTempFirstValue("9");
					theView.setDispText(theModel.getTempFirstValue());
				}
			}
		}
	}
} 
