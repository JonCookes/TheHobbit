package com.qa.TheHobbit.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Characters")
public class Character {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull(message = "Please enter a name")
	@Column
	private String name;
	
	@Column
	private String alias;
	
	@Column
	private String race;
	
	@Column
	private String gender;
	
	@Column
	private int mass;
	
	@Column
	private int height;

	@Column
	private boolean specialAbility;
	
	//default constructor
	public Character() {
		super();
	}
	
	
	
	//Constructor with everything but id
	public Character(String name, String alias, String race, String gender, int mass, int height, boolean specialAbility) {
		super();
		this.name = name;
		this.alias = alias;
		this.race = race;
		this.gender = gender;
		this.mass = mass;
		this.height = height;
		this.specialAbility = specialAbility;
	}
	
	//Constructor with everything
	public Character(int id, String name, String alias, String race, String gender, int mass, int height, boolean specialAbility) {
		super();
		this.id = id;
		this.name = name;
		this.alias = alias;
		this.race = race;
		this.gender = gender;
		this.mass = mass;
		this.height = height;
		this.specialAbility = specialAbility;
	}
	//Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isSpecialAbility() {
		return specialAbility;
	}

	public void setSpecialAbility(boolean specialAbility) {
		this.specialAbility = specialAbility;
	}
	
	//Hash Code and Equals

	@Override
	public int hashCode() {
		return Objects.hash(alias, gender, height, id, mass, name, race, specialAbility);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Character other = (Character) obj;
		return Objects.equals(alias, other.alias) && Objects.equals(gender, other.gender) && height == other.height
				&& id == other.id && mass == other.mass && Objects.equals(name, other.name)
				&& Objects.equals(race, other.race) && specialAbility == other.specialAbility;
	}

	//ToString

	@Override
	public String toString() {
		return "Character [id=" + id + ", name=" + name + ", alias=" + alias + ", race=" + race + ", gender=" + gender
				+ ", mass=" + mass + ", height=" + height + ", specialAbility=" + specialAbility + "]";
	}

	

	
	}


