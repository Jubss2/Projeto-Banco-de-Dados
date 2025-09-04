package stardewValley;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class WateringCan extends Tools {
	private int area;

	@Override
	public void configTool(MaterialEnum m) {
		// TODO Auto-generated method stub
		if(m == MaterialEnum.STARTER) {
			area = 1;
		}if(m == MaterialEnum.COOPER) {
			area = 3;
		}if(m == MaterialEnum.STEEL) {
			area = 5;
		}if(m == MaterialEnum.GOLD) {
			area = 9;
		}if(m == MaterialEnum.IRIDIUM) {
			area = 18;
		}
		
	}
	
}
