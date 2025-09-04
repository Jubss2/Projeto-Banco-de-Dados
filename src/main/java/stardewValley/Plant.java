package stardewValley;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity

public class Plant {
	private int daysToHarvest;
	private int priceToBuy;
	private int priceToSell;
	@Id
	private String name;
	@Enumerated
	private SeasonEnum season;
	
	
}
