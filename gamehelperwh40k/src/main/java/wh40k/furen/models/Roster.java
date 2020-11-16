package wh40k.furen.models;

import java.io.Serializable;
import java.util.List;

public class Roster implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String fraction;
	private List<Unit> units;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFraction() {
		return fraction;
	}

	public void setFraction(String faction) {
		this.fraction = faction;
	}

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}

}
