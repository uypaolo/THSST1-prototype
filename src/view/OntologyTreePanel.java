package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

import model.CompleteOntologyTree;
import net.miginfocom.swing.MigLayout;
import controller.TreeController;

public class OntologyTreePanel extends JPanel{
	
	private static OntologyTreePanel instance;
	
	private JTree ontologyTree;
	private JComboBox entitySelection;
	private JLabel entitySelectionLabel;
	
	private TreeController treeController;
	
	public static OntologyTreePanel getInstance(){
		if(instance == null){
			instance = new OntologyTreePanel();
		}
		
		return instance;
	}
	
	public OntologyTreePanel(){
		setLayout(new MigLayout());
		treeController = new TreeController();
		//ontologyTree.get
		setPanel();
		initializeBox();
		initializeTree();
		initializeLabel();
		addComponentsToPanel();
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Entities and Instances"));
	}
	
	private void initializeBox(){
		entitySelection = new JComboBox();
		entitySelection.addItem("All");
		entitySelection.addItem("Food");
		entitySelection.addItem("Condition");
		entitySelection.addItem("Nutrient");
		entitySelection.addItem("Nutrient Abundance");
		entitySelection.addItem("Nutrient Deficiency");
		entitySelection.addItem("Symptom");
		
		entitySelection.setPreferredSize(new Dimension((int)((MainFrame.getSizeX()*.8)*.5), 5));
	}
	
	private void initializeTree(){
		CompleteOntologyTree comp = new CompleteOntologyTree();
		ontologyTree = comp.getTree();
		
		ontologyTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		ontologyTree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
		    @Override
		    public void valueChanged(TreeSelectionEvent e) {
		        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) ontologyTree.getLastSelectedPathComponent();
		        treeController.displayInstance(selectedNode);
		    }
		});
	}
	
	private void initializeLabel(){
		entitySelectionLabel = new JLabel("Entity: ");
	}
	
	private void addComponentsToPanel(){
		add(new JTextField(40));
		add(new JButton("Search"), "wrap");
		add(entitySelectionLabel, "split");
		add(entitySelection, "wrap");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension((int)(MainFrame.getSizeX()*.3), MainFrame.getSizeY()-50));
		scrollPane.getViewport().add(ontologyTree);
		
		add(scrollPane, "spanx");
	}
	
	private void setPanel(){
		setPreferredSize(new Dimension((int)(MainFrame.getSizeX()*.3), MainFrame.getSizeY()));
		//setBackground(Color.BLUE);
	}

	public JTree getOntologyTree() {
		return ontologyTree;
	}

	public void setOntologyTree(JTree ontologyTree) {
		this.ontologyTree = ontologyTree;
	}
}
