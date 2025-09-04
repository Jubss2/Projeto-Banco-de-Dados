package stardewValley;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class FishingPole extends Tools {
	private Boolean bait;
	private Boolean trackle;
	private Boolean catchSpecialFish;
	private Boolean canCatch;
	
	public void configCatch(Fish f) {
		if(f.getStrenght() < 10) {
			canCatch = true;
		}else {
			canCatch = false;
		}
	}
	@Override
	public void configTool(MaterialEnum m) {
		if(m == MaterialEnum.COOPER) {
			catchSpecialFish = true;
		}if(m == MaterialEnum.STEEL) {
			bait = true;
		}if(m == MaterialEnum.IRIDIUM) {
			trackle = true;
		}
	}


}
