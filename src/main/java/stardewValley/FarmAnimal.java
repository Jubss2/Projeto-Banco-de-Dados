package stardewValley;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class FarmAnimal extends Animal {
	private int cost;
	private int mood;
	private Boolean isProducing;

	
	
}
