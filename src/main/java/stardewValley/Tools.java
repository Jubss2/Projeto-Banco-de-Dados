package stardewValley;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public abstract class Tools {
	
	@Id
	private String name;
	@Enumerated
	private MaterialEnum material;
	
	public abstract void configTool(MaterialEnum m);
	
}
