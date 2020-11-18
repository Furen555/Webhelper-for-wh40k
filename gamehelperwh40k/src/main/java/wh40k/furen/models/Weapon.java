package wh40k.furen.models;

import java.io.Serializable;

public class Weapon implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String name;
	private String range;
	private String type;
	private String s;
	private String d;
	private String ap;
	private String abilitys;
	private String fraction;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getAp() {
		return ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	public String getAbilitys() {
		return abilitys;
	}

	public void setAbilitys(String abilitys) {
		this.abilitys = abilitys;
	}

	public String getFraction() {
		return fraction;
	}

	public void setFraction(String fraction) {
		this.fraction = fraction;
	}

}
