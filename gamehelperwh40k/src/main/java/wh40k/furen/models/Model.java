package wh40k.furen.models;

import java.io.Serializable;

public class Model implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String name;
	private int numberOfModels;
	private int m;
	private String ws;
	private String bs;
	private int s;
	private int t;
	private int w;
	private int a;
	private int ld;
	private String sv;
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

	public int getNumberOfModels() {
		return numberOfModels;
	}

	public void setNumberOfModels(int numberOfModels) {
		this.numberOfModels = numberOfModels;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public String getWs() {
		return ws;
	}

	public void setWs(String ws) {
		this.ws = ws;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getLd() {
		return ld;
	}

	public void setLd(int ld) {
		this.ld = ld;
	}

	public String getSv() {
		return sv;
	}

	public void setSv(String sv) {
		this.sv = sv;
	}

	public String getFraction() {
		return fraction;
	}

	public void setFraction(String fraction) {
		this.fraction = fraction;
	}
}
