package com.homework;

public class Soldier {
	private String name;//����
	private String skill;//����
	private String enginery;//����
	
	//set��get����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getEnginery() {
		return enginery;
	}
	public void setEnginery(String enginery) {
		this.enginery = enginery;
	}
	//���췽��
	public Soldier(String name, String skill, String enginery) {
		super();
		this.name = name;
		this.skill = skill;
		this.enginery = enginery;
	}
	public Soldier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
