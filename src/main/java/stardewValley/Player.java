package stardewValley;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity

public class Player {
	@Id
	private String name;
	private String favoriteThing;
	private String farmName;
	@OneToOne
	private Domestic pet;
	private SeasonEnum season;
	@OneToMany
	private List<Tools> toolsPlayer = new ArrayList<Tools>();	
	@OneToMany
	private List<FarmAnimal> animalsPlayer = new ArrayList<FarmAnimal>();
	@OneToMany
	private List<Villager> familiarVillagers = new ArrayList<Villager>();
	
	
}
