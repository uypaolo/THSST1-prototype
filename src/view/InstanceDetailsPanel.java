package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class InstanceDetailsPanel extends JPanel{
	
	private static InstanceDetailsPanel instance;
	
	public static InstanceDetailsPanel getInstance(){
		if(instance == null){
			instance = new InstanceDetailsPanel();
		}
		
		return instance;
	}
	
	public InstanceDetailsPanel(){
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
		foodName.setEditable(false);
		
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

		nutriList.add(new JScrollPane(nutriTable), "spanx, growx, pushx");
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
		add(diseaseList, "spanx, growx, pushx, wrap");
		
		JButton editButton = new JButton("Edit");
		editButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				EditInstanceFrame.getInstance().setVisible(true);
				EditInstanceView.getInstance().displayFood(food);
			}
		});
		add(editButton);
		
		revalidate();
		repaint();
	}
	
	public void displayNutrient(NutrientModel nutrient){
		removeAll();
		
		JLabel nutrientNameLabel = new JLabel("Nutrient name: ");
		JTextField nutrientName = new JTextField(nutrient.getInstanceName());
		nutrientName.setEditable(false);
		
		JPanel nutrientInfo = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		nutrientInfo.setLayout(new MigLayout());
		nutrientInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Entity Details"));
		nutrientInfo.add(nutrientNameLabel);
		nutrientInfo.add(nutrientName, "spanx, growx, pushx");
		
		add(nutrientInfo, "spanx, growx, pushx");
		
		JButton editButton = new JButton("Edit");
		add(editButton);
		editButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				EditInstanceFrame.getInstance().setVisible(true);
				EditInstanceView.getInstance().displayNutrient(nutrient);
			}
		});
		
		revalidate();
		repaint();
	}
	
	public void displayDisease(DiseaseModel disease){
		removeAll();
		
		JLabel diseaseNameLabel = new JLabel("Disease name: ");
		JTextField diseaseName = new JTextField(disease.getInstanceName());
		diseaseName.setEditable(false);
		
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
			sympList.add(new JScrollPane(symptom), "spanx, growx, pushx");
			
			add(sympList, "spanx, growx, pushx, wrap");
		}
		else{
			symptom = new JTable();
			//foodInfo.setBackground(Color.BLUE);
			sympList.add(new JScrollPane(symptom), "spanx, growx, pushx");
			
			add(sympList, "spanx, growx, pushx, wrap");
		}
		
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
			avoidList.add(new JScrollPane(avoid), "spanx, growx, pushx");
			
			add(avoidList, "spanx, growx, pushx, wrap");
		}
		else{
			avoid = new JTable();
			//foodInfo.setBackground(Color.BLUE);
			avoidList.add(new JScrollPane(avoid), "spanx, growx, pushx");
			
			add(avoidList, "spanx, growx, pushx, wrap");
		}
		
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
			needList.add(new JScrollPane(need), "spanx, growx, pushx");
			
			add(needList, "spanx, growx, pushx, wrap");
		}
		else{
			need = new JTable();
			//foodInfo.setBackground(Color.BLUE);
			needList.add(new JScrollPane(need), "spanx, growx, pushx");
			
			add(needList, "spanx, growx, pushx, wrap");
		}
		
		JButton editButton = new JButton("Edit");
		add(editButton);
		editButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				EditInstanceFrame.getInstance().setVisible(true);
				EditInstanceView.getInstance().displayDisease(disease);
			}
		});
		
		revalidate();
		repaint();
	}
	
	public void displaySymptom(SymptomModel symptom){
		removeAll();
		
		JLabel symptomNameLabel = new JLabel("Symptom name: ");
		JTextField symptomName = new JTextField(symptom.getInstanceName());
		symptomName.setEditable(false);
		
		JPanel symptomInfo = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		symptomInfo.setLayout(new MigLayout());
		symptomInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Entity Details"));
		symptomInfo.add(symptomNameLabel);
		symptomInfo.add(symptomName, "spanx, growx, pushx");
		
		add(symptomInfo, "spanx, growx, pushx");
		
		JButton editButton = new JButton("Edit");
		add(editButton);
		
		revalidate();
		repaint();
	}
	
	public void displayAbundance(NutrientAbundanceModel abundance){
		removeAll();
		
		JLabel foodNameLabel = new JLabel("Food name: ");
		JTextField foodName = new JTextField(abundance.getInstanceName());
		foodName.setEditable(false);
		
		JPanel foodInfo = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		foodInfo.setLayout(new MigLayout());
		foodInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Entity Details"));
		foodInfo.add(foodNameLabel);
		foodInfo.add(foodName, "spanx, growx, pushx");
		
		add(foodInfo, "spanx, growx, pushx");
		
		JButton editButton = new JButton("Edit");
		add(editButton);
		
		revalidate();
		repaint();
	}
	
	public void displayDeficiency(NutrientDeficiencyModel deficiency){
		removeAll();
		
		JLabel foodNameLabel = new JLabel("Food name: ");
		JTextField foodName = new JTextField(deficiency.getInstanceName());
		foodName.setEditable(false);
		
		JPanel foodInfo = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		foodInfo.setLayout(new MigLayout());
		foodInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Entity Details"));
		foodInfo.add(foodNameLabel);
		foodInfo.add(foodName, "spanx, growx, pushx");
		
		add(foodInfo, "spanx, growx, pushx");
		
		JButton editButton = new JButton("Edit");
		add(editButton);
		
		revalidate();
		repaint();
	}
	
}
