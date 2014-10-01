
public class CalcModel {
	private String tempFirstValue = "";
	private String result = "";
	
	private boolean add = false,
					sub = false,
					multi = false,
					div = false;
	
	private double	x = 0,
					y = 0,
					z = 0;
	
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
	
	public void setAddOperation(boolean thisOperation){
		this.sub = false;
		this.multi = false;
		this.div = false;
		this.add = thisOperation;
		this.x = Double.parseDouble(tempFirstValue);
		this.tempFirstValue = "";
	}
	
	public void setSubOperation(boolean thisOperation){
		this.add = false;
		this.multi = false;
		this.div = false;
		this.sub = thisOperation;
		this.x = Double.parseDouble(tempFirstValue);
		this.tempFirstValue = "";
	}
	
	public void setMultiOperation(boolean thisOperation){
		this.add = false;
		this.sub = false;
		this.div = false;
		this.multi = thisOperation;
		this.x = Double.parseDouble(tempFirstValue);
		this.tempFirstValue = "";
	}
	
	public void setDivOperation(boolean thisOperation){
		this.add = false;
		this.sub = false;
		this.multi = false;
		this.div = thisOperation;
		this.x = Double.parseDouble(tempFirstValue);
		this.tempFirstValue = "";
	}
		
	public void EqualOperation(){
		if(this.add){
			this.y = Double.parseDouble(tempFirstValue);
			this.z = this.x + this.y;
			this.result = Double.toString(z);
			this.add = false;
		}
		if(this.sub){
			this.y = Double.parseDouble(tempFirstValue);
			this.z = this.x - this.y;
			this.result = Double.toString(z);
			this.sub = false;
		}
		if(this.multi){
			this.y = Double.parseDouble(tempFirstValue);
			this.z = this.x * this.y;
			this.result = Double.toString(z);
			this.multi = false;
		}
		if(this.div){
			this.y = Double.parseDouble(tempFirstValue);
			this.z = this.x / this.y;
			this.result = Double.toString(z);
			this.div = false;
		}
		else
			this.z = Double.parseDouble(tempFirstValue);
	}
	
	public void ClearAll(){
		this.add = false;
		this.sub = false;
		this.multi = false;
		this.div = false;
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.tempFirstValue = "";
		this.result = "";
	}
	
	public String getResult(){
		return this.result;
	}
}
