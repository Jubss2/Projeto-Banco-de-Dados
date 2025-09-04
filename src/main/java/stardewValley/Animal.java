package stardewValley;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public abstract class Animal {
	@Id
	private String name;
	private int hearts;
	
}
