package model;

import java.util.ArrayList;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class CompleteOntologyTree {
	private JTree tree;
	
	private DefaultMutableTreeNode root;
	private DefaultMutableTreeNode entity;
	private DefaultMutableTreeNode instance;
	
	public CompleteOntologyTree(){
		instance = new DefaultMutableTreeNode();
		
		InstanceModel model;

		SymptomModel symptomModel;
		NutrientAbundanceModel abundanceModel;
		NutrientDeficiencyModel deficiencyModel;
		
		NutrientModel nutrientModel1 = new NutrientModel("Nutrient", "Calories");
		NutrientModel nutrientModel2 = new NutrientModel("Nutrient", "Saturated Fat");
		NutrientModel nutrientModel3 = new NutrientModel("Nutrient", "Trans Fat");
		NutrientModel nutrientModel4 = new NutrientModel("Nutrient", "Cholesterol");
		NutrientModel nutrientModel5 = new NutrientModel("Nutrient", "Sodium");
		NutrientModel nutrientModel6 = new NutrientModel("Nutrient", "Dietary Fiber");
		NutrientModel nutrientModel7 = new NutrientModel("Nutrient", "Sugar");
		NutrientModel nutrientModel8 = new NutrientModel("Nutrient", "Protein");
		NutrientModel nutrientModel9 = new NutrientModel("Nutrient", "Vitamin A");
		NutrientModel nutrientModel10 = new NutrientModel("Nutrient", "Vitamin C");
		NutrientModel nutrientModel11 = new NutrientModel("Nutrient", "Iron");
		NutrientModel nutrientModel12 = new NutrientModel("Nutrient", "Calcium");
		
		FoodModel foodModel1 = new FoodModel("Food", "Apple");
		foodModel1.setNutrients(new ArrayList<NutrientModel>(){{
			add(nutrientModel1); 
			add(nutrientModel5); 
			add(nutrientModel6);
			add(nutrientModel7);
			add(nutrientModel9);
			add(nutrientModel10);
			add(nutrientModel11);
			add(nutrientModel12);
		}});
		
		FoodModel foodModel2 = new FoodModel("Food", "Orange");
		foodModel2.setNutrients(new ArrayList<NutrientModel>(){{
			add(nutrientModel1); 
			add(nutrientModel5); 
			add(nutrientModel6);
			add(nutrientModel7);
			add(nutrientModel8);
			add(nutrientModel9);
			add(nutrientModel10);
			add(nutrientModel11);
			add(nutrientModel12);
		}});
		
		FoodModel foodModel3 = new FoodModel("Food", "Banana");
		foodModel3.setNutrients(new ArrayList<NutrientModel>(){{
			add(nutrientModel1); 
			add(nutrientModel5); 
			add(nutrientModel6);
			add(nutrientModel7);
			add(nutrientModel8);
			add(nutrientModel9);
			add(nutrientModel10);
			add(nutrientModel11);
			add(nutrientModel12);
		}});
		
		FoodModel foodModel4 = new FoodModel("Food", "Oatmeal");
		foodModel4.setNutrients(new ArrayList<NutrientModel>(){{
			add(nutrientModel1); 
			add(nutrientModel2); 
			add(nutrientModel5); 
			add(nutrientModel6);
			add(nutrientModel7);
			add(nutrientModel8);
			add(nutrientModel9);
			add(nutrientModel11);
			add(nutrientModel12);
		}});
		
		FoodModel foodModel5 = new FoodModel("Food", "Salmon");
		foodModel5.setNutrients(new ArrayList<NutrientModel>(){{
			add(nutrientModel1); 
			add(nutrientModel2); 
			add(nutrientModel4);
			add(nutrientModel5); 
			add(nutrientModel7);
			add(nutrientModel8);
			add(nutrientModel9);
			add(nutrientModel11);
			add(nutrientModel12);
		}});
		
		FoodModel foodModel6 = new FoodModel("Food", "Rice");
		foodModel6.setNutrients(new ArrayList<NutrientModel>(){{
			add(nutrientModel6);
			add(nutrientModel8);
			add(nutrientModel11);
			add(nutrientModel12);
		}});
		
		FoodModel foodModel7 = new FoodModel("Food", "Tomato");
		foodModel7.setNutrients(new ArrayList<NutrientModel>(){{
			add(nutrientModel1); 
			add(nutrientModel2); 
			add(nutrientModel4);
			add(nutrientModel5); 
			add(nutrientModel7);
			add(nutrientModel8);
			add(nutrientModel9);
			add(nutrientModel11);
			add(nutrientModel12);
		}});
		
		
		DiseaseModel diseaseModel1 = new DiseaseModel("Condition", "Diabetes");
		DiseaseModel diseaseModel2 = new DiseaseModel("Condition", "Pneumonia");
		DiseaseModel diseaseModel3 = new DiseaseModel("Condition", "Chickenpox");
		DiseaseModel diseaseModel4 = new DiseaseModel("Condition", "Measles");
		DiseaseModel diseaseModel5 = new DiseaseModel("Condition", "Asthma");
		
		symptomModel = new SymptomModel("Symptom", "");
		abundanceModel = new NutrientAbundanceModel("Nutrient Abundance", "");
		deficiencyModel = new NutrientDeficiencyModel("Nutrient Deficiency", "");
		
		root = new DefaultMutableTreeNode("ROOT");
		
		entity = new DefaultMutableTreeNode("Nutrient");
		entity.add(new DefaultMutableTreeNode(nutrientModel1));
		entity.add(new DefaultMutableTreeNode(nutrientModel2));
		entity.add(new DefaultMutableTreeNode(nutrientModel3));
		entity.add(new DefaultMutableTreeNode(nutrientModel4));
		entity.add(new DefaultMutableTreeNode(nutrientModel5));
		entity.add(new DefaultMutableTreeNode(nutrientModel6));
		entity.add(new DefaultMutableTreeNode(nutrientModel7));
		entity.add(new DefaultMutableTreeNode(nutrientModel8));
		entity.add(new DefaultMutableTreeNode(nutrientModel9));
		entity.add(new DefaultMutableTreeNode(nutrientModel10));
		entity.add(new DefaultMutableTreeNode(nutrientModel11));
		entity.add(new DefaultMutableTreeNode(nutrientModel12));
		root.add(entity);
		
		entity = new DefaultMutableTreeNode("Food");
		entity.add(new DefaultMutableTreeNode(foodModel1));
		entity.add(new DefaultMutableTreeNode(foodModel2));
		entity.add(new DefaultMutableTreeNode(foodModel3));
		entity.add(new DefaultMutableTreeNode(foodModel4));
		entity.add(new DefaultMutableTreeNode(foodModel5));
		entity.add(new DefaultMutableTreeNode(foodModel6));
		entity.add(new DefaultMutableTreeNode(foodModel7));
		root.add(entity);
		
		entity = new DefaultMutableTreeNode("Condition");
		entity.add(new DefaultMutableTreeNode(diseaseModel1));
		entity.add(new DefaultMutableTreeNode(diseaseModel2));
		entity.add(new DefaultMutableTreeNode(diseaseModel3));
		entity.add(new DefaultMutableTreeNode(diseaseModel4));
		entity.add(new DefaultMutableTreeNode(diseaseModel5));
		root.add(entity);
		
		entity = new DefaultMutableTreeNode("Symptom");
		root.add(entity);
		
		tree = new JTree(root);
	}

	public JTree getTree() {
		return tree;
	}

	public void setTree(JTree tree) {
		this.tree = tree;
	}
}
