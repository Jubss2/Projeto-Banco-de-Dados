package stardewValley;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)

public class Axe extends Tools {
	private int strengh;
	
	@Override
	public void configTool(MaterialEnum m) {
		// TODO Auto-generated method stub
		if(m == MaterialEnum.STARTER) {
			strengh = 1;
		}if(m == MaterialEnum.COOPER) {
			strengh = 4;
		}if(m == MaterialEnum.STEEL) {
			strengh = 6;
		}if(m == MaterialEnum.GOLD) {
			strengh = 10;
		}if(m == MaterialEnum.IRIDIUM) {
			strengh = 20;
		}
	}
	
}
