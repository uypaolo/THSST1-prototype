package model;

import java.util.ArrayList;

public class FoodModel extends InstanceModel{

	private ArrayList<NutrientModel> nutrients;
	private ArrayList<DiseaseModel> treats;
	
	public FoodModel(String type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<NutrientModel> getNutrients() {
		return nutrients;
	}

	public void setNutrients(ArrayList<NutrientModel> nutrients) {
		this.nutrients = nutrients;
	}

	public ArrayList<DiseaseModel> getTreats() {
		return treats;
	}

	public void setTreats(ArrayList<DiseaseModel> treats) {
		this.treats = treats;
	}

}
