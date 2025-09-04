package stardewValley;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity

public class Festival {
	@Temporal(TemporalType.DATE)
	private Date date;
	@Id
	private String event;
	@Enumerated
	private SeasonEnum season;
	
}
