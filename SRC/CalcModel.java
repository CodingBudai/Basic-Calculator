
public class CalcModel {
	private String tempFirstValue = "";
	
	public boolean dispIsEmpty(){
		if(this.tempFirstValue.equals(""))
			return true;
		if(this.tempFirstValue.startsWith("0"))
			return true;
		else
			return false;
	}
	
	public void setTempFirstValue(String txt){
		if(dispIsEmpty() == true)
			this.tempFirstValue = txt;
		else
			this.tempFirstValue += txt;
	}
	
	public String getTempFirstValue(){
		return this.tempFirstValue;
	}
}
