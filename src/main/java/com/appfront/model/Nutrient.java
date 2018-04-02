package com.appfront.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nutrient")
public class Nutrient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nutrientName;
	private Integer dailyValue;
	private String dailyValueUOM;
	
	public Nutrient() {
		
	}

	public String getNutrientName() {
		return nutrientName;
	}

	public void setNutrientName(String nutrientName) {
		this.nutrientName = nutrientName;
	}

	public Integer getDailyValue() {
		return dailyValue;
	}

	public void setDailyValue(Integer dailyValue) {
		this.dailyValue = dailyValue;
	}

	public String getDailyValueUOM() {
		return dailyValueUOM;
	}

	public void setDailyValueUOM(String dailyValueUOM) {
		this.dailyValueUOM = dailyValueUOM;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}
