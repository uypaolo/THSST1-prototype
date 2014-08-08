package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class AddInstancePanel extends JPanel{
	
	private JComboBox entityList;
	private JTextField entityName;
	private JLabel entityListLabel;
	private JLabel entityNameLabel;
	
	private JButton addButton;
	private JButton cancelButton;
	
	public AddInstancePanel(){
		setLayout(new MigLayout());
		addButton = new JButton("Add");
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				addInstanceFrame.getInstance().setVisible(false);
			}
		});
		entityListLabel = new JLabel("Entity");
		entityName = new JTextField();
		entityNameLabel = new JLabel("Name: ");
		initializeBox();
		addComponentsToPanel();
	}
	
	private void initializeBox(){
		entityList = new JComboBox();
		entityList.addItem("Food");
		entityList.addItem("Condition");
		entityList.addItem("Nutrient");
		entityList.addItem("Nutrient Abundance");
		entityList.addItem("Nutrient Deficiency");
		entityList.addItem("Symptom");
	}
	
	private void addComponentsToPanel(){
		add(entityListLabel);
		add(entityList, "wrap");
		add(entityNameLabel);
		add(entityName, "wrap, spanx, growx, pushx");
		add(addButton);
		add(cancelButton);
	}
}
