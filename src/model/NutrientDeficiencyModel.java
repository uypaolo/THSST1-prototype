package model;

import java.util.ArrayList;

public class NutrientDeficiencyModel extends InstanceModel{

	private ArrayList<NutrientModel> nutrients;
	
	public NutrientDeficiencyModel(String type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<NutrientModel> getNutrients() {
		return nutrients;
	}

	public void setNutrients(ArrayList<NutrientModel> nutrients) {
		this.nutrients = nutrients;
	}

}
