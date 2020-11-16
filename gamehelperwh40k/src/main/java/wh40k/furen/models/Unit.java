package wh40k.furen.models;

import java.io.Serializable;
import java.util.List;

public class Unit implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String name;
	private int powerPoints;
	private String discription;
	private String keywords;
	private String fraction;
	private List<Ability> abilitys;
	private List<AccessoryWeapon> accessoryWeapons;
	private List<Model> models;
	private List<Weapon> weapons;

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

	public int getPowerPoints() {
		return powerPoints;
	}

	public void setPowerPoints(int powerPoints) {
		this.powerPoints = powerPoints;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getFraction() {
		return fraction;
	}

	public void setFraction(String fraction) {
		this.fraction = fraction;
	}

	public List<Ability> getAbilitys() {
		return abilitys;
	}

	public void setAbilitys(List<Ability> abilitys) {
		this.abilitys = abilitys;
	}

	public List<AccessoryWeapon> getAccessoryWeapons() {
		return accessoryWeapons;
	}

	public void setAccessoryWeapons(List<AccessoryWeapon> accessoryWeapons) {
		this.accessoryWeapons = accessoryWeapons;
	}

	public List<Model> getModels() {
		return models;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}

	public List<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}

}
