package stardewValley;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Fish {
	private int size;
	private int priceToSell;
	@Enumerated
	private LocationEnum location;
	@Id
	private String name;
	private int strenght;
	@Enumerated
	private SeasonEnum season;
	
	
}
