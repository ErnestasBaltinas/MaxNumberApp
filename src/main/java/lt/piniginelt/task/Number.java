package lt.piniginelt.task;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Number {
	
	@NotNull 
	@Min(value=(int)1.0)
	private Integer number;
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}


}