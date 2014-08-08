package view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;
import model.ConditionInstanceModel;
import model.NutrientModel;

public class InstanceListValidationPanel extends JPanel{
	JTable instanceList;
	JButton removeButton;
	JButton addButton;
	
	ArrayList<ConditionInstanceModel> conditionList;
	
	public InstanceListValidationPanel(){
		setLayout(new MigLayout());
		setPreferredSize(new Dimension((int)(MainFrame.getSizeX()*.3), MainFrame.getSizeY()));
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Instance List"));
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		Vector<Object> vector;
		
		vector = new Vector<Object>();
		vector.add("Scurvy");
		vector.add("Condition");
		data.add(vector);
		
		vector = new Vector<Object>();
		vector.add("Diabetes");
		vector.add("Condition");
		data.add(vector);
		
		vector = new Vector<Object>();
		vector.add("Rickets");
		vector.add("Condition");
		data.add(vector);
		
		Vector<String> columns = new Vector<String>(Arrays.asList(new String[]{"Name", "Type"}));
		
		instanceList = new JTable(new DefaultTableModel(data, columns));
		
		add(new JScrollPane(instanceList), "span, grow, push, wrap");
		add(new JButton("Add to Ontology"));
		add(new JButton("Remove"));
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Instance List"));
	}
}
