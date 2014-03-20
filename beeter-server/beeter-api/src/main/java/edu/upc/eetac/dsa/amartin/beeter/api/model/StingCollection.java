package edu.upc.eetac.dsa.amartin.beeter.api.model;


import java.util.ArrayList;
import java.util.List;
 
public class StingCollection {
	private List<Sting> stings;
 
	public StingCollection() {
		super();
		stings = new ArrayList<>();
	}
 
	public List<Sting> getStings() {
		return stings;
	}
 
	public void setStings(List<Sting> stings) {
		this.stings = stings;
	}
 
	public void addSting(Sting sting) {
		stings.add(sting);
	}
	
	private long newestTimestamp;
	private long oldestTimestamp;

	public long getNewestTimestamp() {
		return newestTimestamp;
	}

	public void setNewestTimestamp(long newestTimestamp) {
		this.newestTimestamp = newestTimestamp;
	}

	public long getOldestTimestamp() {
		return oldestTimestamp;
	}

	public void setOldestTimestamp(long oldestTimestamp) {
		this.oldestTimestamp = oldestTimestamp;
	}
	

}