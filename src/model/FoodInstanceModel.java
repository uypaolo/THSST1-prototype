package model;

import java.util.ArrayList;

public class FoodInstanceModel {
	private ArrayList<String> nutrients;
	private ArrayList<String> value;
	
	public ArrayList<String> getNutrients() {
		return nutrients;
	}
	public void setNutrients(ArrayList<String> nutrients) {
		this.nutrients = nutrients;
	}
	public ArrayList<String> getValue() {
		return value;
	}
	public void setValue(ArrayList<String> value) {
		this.value = value;
	}
}
