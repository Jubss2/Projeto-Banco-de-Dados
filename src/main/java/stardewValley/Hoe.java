package stardewValley;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class Hoe extends Tools {
	private int tilesOfTillSoil;

	@Override
	public void configTool(MaterialEnum m) {
		// TODO Auto-generated method stub
		if(m == MaterialEnum.STARTER) {
			tilesOfTillSoil = 1;
		}if(m == MaterialEnum.COOPER) {
			tilesOfTillSoil = 3;
		}if(m == MaterialEnum.STEEL) {
			tilesOfTillSoil = 5;
		}if(m == MaterialEnum.GOLD) {
			tilesOfTillSoil = 9;
		}if(m == MaterialEnum.IRIDIUM) {
			tilesOfTillSoil = 18;
		}
	}
	
}
