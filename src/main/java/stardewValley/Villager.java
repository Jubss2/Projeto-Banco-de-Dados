package stardewValley;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
@Data
@Entity
public class Villager {
	@Id
	private String name;
	@Temporal(TemporalType.DATE)
	private Date birthday;
	private int hearts;
	protected Boolean giveMission = false;
	protected Boolean enterHouse= false;
	protected Boolean canMarry=false;
	protected Boolean helpTheFarm = false;
	@OneToMany
	private List<Villager> marriageCandidates = new ArrayList<Villager>();
	private String relationship;
	
	public void configHearts(int h) {
		hearts = h;
		if(hearts <= 2) {
			relationship = "Know";
			giveMission = true;
		}if(hearts <=8 && hearts > 2) {
			relationship = "Friend";
			enterHouse = true;
		}if(this.marriageCandidates.contains(this)) {
			if(hearts <= 10 &&(hearts > 8)) {
				relationship = "Dating";
				canMarry = true;
			}
			if(hearts > 10) {
				relationship = "Married";
				helpTheFarm = true;
			}
		}
	}

	
}
