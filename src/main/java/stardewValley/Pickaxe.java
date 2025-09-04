package stardewValley;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class Pickaxe extends Tools {
	private int strenghStones;
	
	@Override
	public void configTool(MaterialEnum m) {
		// TODO Auto-generated method stub
		if(m == MaterialEnum.STARTER) {
			strenghStones = 1;
		}if(m == MaterialEnum.COOPER) {
			strenghStones = 4;
		}if(m == MaterialEnum.STEEL) {
			strenghStones = 6;
		}if(m == MaterialEnum.GOLD) {
			strenghStones = 10;
		}if(m == MaterialEnum.IRIDIUM) {
			strenghStones = 20;
		}
	}
	
}
