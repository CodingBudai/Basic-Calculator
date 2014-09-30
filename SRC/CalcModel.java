
public class CalcModel {
	private String tempFirstValue = "";
	private boolean dispIsEmpty;
	
	
	public boolean dispIsEmpty(){
		if(this.tempFirstValue.equals("")){
			dispIsEmpty = true;
			return dispIsEmpty;
		}
		else{
			dispIsEmpty = false;
			return dispIsEmpty;
		}
	}
	
	public void setTempFirstValue(String txt){
		if(this.dispIsEmpty == true)
			this.tempFirstValue = txt;
		if(this.tempFirstValue.startsWith("0"))
			this.tempFirstValue = txt;
		else
			this.tempFirstValue += txt;
	}
	
	public String getTempFirstValue(){
		return this.tempFirstValue;
	}
}
