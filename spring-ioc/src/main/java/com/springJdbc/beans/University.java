package com.springJdbc.beans;

public class University {

	private int id;

	private String name;

	private String loc;

	private String mappedCol;

	public University() {

	}

	public University(Integer id, String name, String loc, String mappedCol) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.mappedCol = mappedCol;
	}

	public String getMappedCol() {
		return mappedCol;
	}

	public void setMappedCol(String mappedCol) {
		this.mappedCol = mappedCol;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
