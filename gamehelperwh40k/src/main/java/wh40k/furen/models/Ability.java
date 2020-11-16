package wh40k.furen.models;

import java.io.Serializable;

public class Ability implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String name;
	private String discription;
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

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getFraction() {
		return fraction;
	}

	public void setFraction(String fraction) {
		this.fraction = fraction;
	}

}
