package view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import model.DiseaseModel;
import model.FoodModel;
import model.NutrientAbundanceModel;
import model.NutrientDeficiencyModel;
import model.NutrientModel;
import model.SymptomModel;
import net.miginfocom.swing.MigLayout;

public class EditInstanceView extends JPanel{
	private static EditInstanceView instance;
	
	public static EditInstanceView getInstance(){
		if(instance == null){
			instance = new EditInstanceView();
		}
		
		return instance;
	}
	
	public EditInstanceView(){
		setLayout(new MigLayout());
		setPanel();
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Details"));

	}
	
	private void setPanel(){
		setPreferredSize(new Dimension((int)(MainFrame.getSizeX()*.7), MainFrame.getSizeY()));
		//setBackground(Color.RED);
	}
	
	public void displayFood(FoodModel food){
		removeAll();
		
		JLabel foodNameLabel = new JLabel("Food name: ");
		JTextField foodName = new JTextField(food.getInstanceName());
		foodName.setEditable(true);
		
		JPanel foodInfo = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		foodInfo.setLayout(new MigLayout());
		foodInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Entity Details"));
		foodInfo.add(foodNameLabel);
		foodInfo.add(foodName, "spanx, growx, pushx");
		
		add(foodInfo, "spanx, growx, pushx, wrap");
		
		JTable nutriTable = null;
		if(food.getNutrients() != null){
			Vector<String> columns = new Vector<String>(Arrays.asList(new String[]{"Nutrient Name"}));
			
			Vector<Vector<Object>> data = new Vector<Vector<Object>>();
			Vector<Object> vector;
			for(NutrientModel nut: food.getNutrients()){
				vector = new Vector<Object>();
				vector.add(nut.getInstanceName());
				data.add(vector);
			}
			
			nutriTable = new JTable(new DefaultTableModel(data, columns){
				public boolean isCellEditable(int row, int column){
					return false;
				}
			});
			
			nutriTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		JPanel nutriList = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		nutriList.setLayout(new MigLayout());
		nutriList.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Nutrients"));
		if(nutriTable != null){

		}
		else{
			nutriTable = new JTable();	
		}
		
		JButton addButton = new JButton("Add");

		nutriList.add(new JScrollPane(nutriTable), "spanx, growx, pushx");
		JButton delButton1 = new JButton("Delete");
		nutriList.add(addButton);
		nutriList.add(delButton1);
		
		add(nutriList, "spanx, growx, pushx, wrap");
		
		JTable treatable = null;
		if(food.getTreats() != null){
			Vector<String> columns = new Vector<String>(Arrays.asList(new String[]{"Condition Name"}));
			
			Vector<Vector<Object>> data = new Vector<Vector<Object>>();
			Vector<Object> vector;
			for(DiseaseModel dis: food.getTreats()){
				vector = new Vector<Object>();
				vector.add(dis.getInstanceName());
				data.add(vector);
			}
			
			treatable = new JTable(new DefaultTableModel(data, columns){
				public boolean isCellEditable(int row, int column){
					return false;
				}
			});
			
			treatable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		JPanel diseaseList = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		diseaseList.setLayout(new MigLayout());
		diseaseList.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Treats"));
		if(treatable != null){
			
		}
		else{
			treatable = new JTable();
			
		}
		
		diseaseList.add(new JScrollPane(treatable), "spanx, growx, pushx");
		
		JButton addButton1 = new JButton("Add");
		JButton delButton2 = new JButton("Delete");
		diseaseList.add(addButton1);
		diseaseList.add(delButton2);
		
		
		add(diseaseList, "spanx, growx, pushx, wrap");
		
		revalidate();
		repaint();
	}
	
	public void displayNutrient(NutrientModel nutrient){
		removeAll();
		
		JLabel nutrientNameLabel = new JLabel("Nutrient name: ");
		JTextField nutrientName = new JTextField(nutrient.getInstanceName());
		nutrientName.setEditable(true);
		
		JPanel nutrientInfo = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		nutrientInfo.setLayout(new MigLayout());
		nutrientInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Entity Details"));
		nutrientInfo.add(nutrientNameLabel);
		nutrientInfo.add(nutrientName, "spanx, growx, pushx");
		
		add(nutrientInfo, "spanx, growx, pushx");
		
		revalidate();
		repaint();
	}
	
	public void displayDisease(DiseaseModel disease){
		removeAll();
		
		JLabel diseaseNameLabel = new JLabel("Disease name: ");
		JTextField diseaseName = new JTextField(disease.getInstanceName());
		diseaseName.setEditable(true);
		
		JPanel diseaseInfo = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		diseaseInfo.setLayout(new MigLayout());
		diseaseInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Entity Details"));
		diseaseInfo.add(diseaseNameLabel);
		diseaseInfo.add(diseaseName, "spanx, growx, pushx");
		
		add(diseaseInfo, "spanx, growx, pushx");
		
		JTable symptom = null;
		if(disease.getSymptoms() != null){
			Vector<String> columns = new Vector<String>(Arrays.asList(new String[]{"Food to Avoid"}));
			
			Vector<Vector<Object>> data = new Vector<Vector<Object>>();
			Vector<Object> vector;
			for(SymptomModel symp: disease.getSymptoms()){
				vector = new Vector<Object>();
				vector.add(symp.getInstanceName());
				data.add(vector);
			}
			
			symptom = new JTable(new DefaultTableModel(data, columns){
				public boolean isCellEditable(int row, int column){
					return false;
				}
			});
			
			symptom.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		
		JPanel sympList = new JPanel();
		sympList.setLayout(new MigLayout());
		sympList.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Symptoms"));
		
		if(symptom != null){	
			//foodInfo.setBackground(Color.BLUE);
				
		}
		else{
			
			add(sympList, "spanx, growx, pushx, wrap");
		}
		sympList.add(new JScrollPane(symptom), "spanx, growx, pushx");
		JButton addButton1 = new JButton("Add");
		JButton delButton1 = new JButton("Delete");

		sympList.add(addButton1);
		sympList.add(delButton1);
		add(sympList, "spanx, growx, pushx, wrap");
		
		JTable avoid = null;
		if(disease.getAvoid() != null){
			Vector<String> columns = new Vector<String>(Arrays.asList(new String[]{"Food to Avoid"}));
			
			Vector<Vector<Object>> data = new Vector<Vector<Object>>();
			Vector<Object> vector;
			for(FoodModel food: disease.getAvoid()){
				vector = new Vector<Object>();
				vector.add(food.getInstanceName());
				data.add(vector);
			}
			
			avoid = new JTable(new DefaultTableModel(data, columns){
				public boolean isCellEditable(int row, int column){
					return false;
				}
			});
			
			avoid.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		
		JPanel avoidList = new JPanel();
		avoidList.setLayout(new MigLayout());
		avoidList.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Avoid"));
		
		if(avoid != null){	
			//foodInfo.setBackground(Color.BLUE);
			
		}
		else{
			avoid = new JTable();
			//foodInfo.setBackground(Color.BLUE);
		}
		avoidList.add(new JScrollPane(avoid), "spanx, growx, pushx");
		JButton addButton2 = new JButton("Add");
		JButton delButton2 = new JButton("Delete");
		avoidList.add(addButton2);
		avoidList.add(delButton2);
		
		add(avoidList, "spanx, growx, pushx, wrap");
		
		JTable need = null;
		if(disease.getAvoid() != null){
			Vector<String> columns = new Vector<String>(Arrays.asList(new String[]{"Food needed"}));
			
			Vector<Vector<Object>> data = new Vector<Vector<Object>>();
			Vector<Object> vector;
			for(FoodModel food: disease.getNeeds()){
				vector = new Vector<Object>();
				vector.add(food.getInstanceName());
				data.add(vector);
			}
			
			need = new JTable(new DefaultTableModel(data, columns){
				public boolean isCellEditable(int row, int column){
					return false;
				}
			});
			
			need.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		
		JPanel needList = new JPanel();
		needList.setLayout(new MigLayout());
		needList.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Need"));
		
		if(need != null){	
			//foodInfo.setBackground(Color.BLUE);
			
		}
		else{
			need = new JTable();
			//foodInfo.setBackground(Color.BLUE);
		}
		needList.add(new JScrollPane(need), "spanx, growx, pushx");
		JButton addButton3 = new JButton("Add");
		JButton delButton3 = new JButton("Delete");
		needList.add(addButton3);
		needList.add(delButton3);
		
		add(needList, "spanx, growx, pushx, wrap");
		
		revalidate();
		repaint();
	}
	
	public void displaySymptom(SymptomModel symptom){
		removeAll();
		
		JLabel symptomNameLabel = new JLabel("Symptom name: ");
		JTextField symptomName = new JTextField(symptom.getInstanceName());
		symptomName.setEditable(true);
		
		JPanel symptomInfo = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		symptomInfo.setLayout(new MigLayout());
		symptomInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Entity Details"));
		symptomInfo.add(symptomNameLabel);
		symptomInfo.add(symptomName, "spanx, growx, pushx");
		
		add(symptomInfo, "spanx, growx, pushx");
		
		revalidate();
		repaint();
	}
	
	public void displayAbundance(NutrientAbundanceModel abundance){
		removeAll();
		
		JLabel foodNameLabel = new JLabel("Food name: ");
		JTextField foodName = new JTextField(abundance.getInstanceName());
		foodName.setEditable(true);
		
		JPanel foodInfo = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		foodInfo.setLayout(new MigLayout());
		foodInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Entity Details"));
		foodInfo.add(foodNameLabel);
		foodInfo.add(foodName, "spanx, growx, pushx");
		
		add(foodInfo, "spanx, growx, pushx");
		
		revalidate();
		repaint();
	}
	
	public void displayDeficiency(NutrientDeficiencyModel deficiency){
		removeAll();
		
		JLabel foodNameLabel = new JLabel("Food name: ");
		JTextField foodName = new JTextField(deficiency.getInstanceName());
		foodName.setEditable(true);
		
		JPanel foodInfo = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		foodInfo.setLayout(new MigLayout());
		foodInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Entity Details"));
		foodInfo.add(foodNameLabel);
		foodInfo.add(foodName, "spanx, growx, pushx");
		
		add(foodInfo, "spanx, growx, pushx");
		
		revalidate();
		repaint();
	}
}
