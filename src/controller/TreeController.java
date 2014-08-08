package controller;

import javax.swing.tree.DefaultMutableTreeNode;

import model.DiseaseModel;
import model.FoodModel;
import model.InstanceModel;
import model.NutrientAbundanceModel;
import model.NutrientDeficiencyModel;
import model.NutrientModel;
import model.SymptomModel;
import view.InstanceDetailsPanel;

public class TreeController {
	
	
	public TreeController(){
		
	}
	
	public void displayInstance(DefaultMutableTreeNode instance){
		if(instance.getUserObject() instanceof String){
			System.out.println("String instance!");
		}
		else{
			InstanceModel instanceModel = (InstanceModel)instance.getUserObject();
			if(instanceModel.getEntityType().equalsIgnoreCase("Food")){
				System.out.println("Food Type!");
				InstanceDetailsPanel.getInstance().displayFood((FoodModel)instanceModel);
			}
			else if(instanceModel.getEntityType().equalsIgnoreCase("Nutrient")){
				System.out.println("Nutrient Type!");
				InstanceDetailsPanel.getInstance().displayNutrient((NutrientModel)instanceModel);
			}
			else if(instanceModel.getEntityType().equalsIgnoreCase("Disease")){
				System.out.println("Disease Type!");
				InstanceDetailsPanel.getInstance().displayDisease((DiseaseModel)instanceModel);
			}
			else if(instanceModel.getEntityType().equalsIgnoreCase("Symptom")){
				System.out.println("Symptom Type!");
				InstanceDetailsPanel.getInstance().displaySymptom((SymptomModel)instanceModel);
			}
			else if(instanceModel.getEntityType().equalsIgnoreCase("Nutrient Abundance")){
				System.out.println("Abundance Type!");
				InstanceDetailsPanel.getInstance().displayAbundance((NutrientAbundanceModel)instanceModel);
			}
			else if(instanceModel.getEntityType().equalsIgnoreCase("Nutrient Deficiency")){
				System.out.println("Deficiency Type!");
				InstanceDetailsPanel.getInstance().displayDeficiency((NutrientDeficiencyModel)instanceModel);
			}
			else{
				System.out.println("Unknown Type!");
			}
		}
	}
}
