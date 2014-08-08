package model;

import java.util.ArrayList;

public class DiseaseModel extends InstanceModel{

	private ArrayList<FoodModel> avoid;
	private ArrayList<FoodModel> needs;
	private ArrayList<SymptomModel> symptoms;
	private ArrayList<NutrientAbundanceModel> abundant;
	private ArrayList<NutrientDeficiencyModel> deficient;
	
	public DiseaseModel(String type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<FoodModel> getAvoid() {
		return avoid;
	}

	public void setAvoid(ArrayList<FoodModel> avoid) {
		this.avoid = avoid;
	}

	public ArrayList<FoodModel> getNeeds() {
		return needs;
	}

	public void setNeeds(ArrayList<FoodModel> needs) {
		this.needs = needs;
	}

	public ArrayList<SymptomModel> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(ArrayList<SymptomModel> symptoms) {
		this.symptoms = symptoms;
	}

	public ArrayList<NutrientAbundanceModel> getAbundant() {
		return abundant;
	}

	public void setAbundant(ArrayList<NutrientAbundanceModel> abundant) {
		this.abundant = abundant;
	}

	public ArrayList<NutrientDeficiencyModel> getDeficient() {
		return deficient;
	}

	public void setDeficient(ArrayList<NutrientDeficiencyModel> deficient) {
		this.deficient = deficient;
	}

}
