package stardewValley;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class Domestic extends Animal {
	private Boolean putWaterInBool;

	
	
}
