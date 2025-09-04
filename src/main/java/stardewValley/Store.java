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
public class Store {
	@Id
	private String name;
	@OneToMany
	private List<Itens> itensStore = new ArrayList<Itens>();
	@OneToOne
	private Villager owner;

	private int timeOpens;
	
	private int timeCloses;
	
	
}
