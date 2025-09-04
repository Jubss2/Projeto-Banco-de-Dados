package stardewValley;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class Itens {
	@Id
	private String name;
	private int cost;
}
