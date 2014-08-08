package view;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import controller.MenuBarController;
import net.miginfocom.swing.MigLayout;

public class MainFrame extends JFrame{
	
	private static int sizeX = 1000;
	private static int sizeY = 640;
	
	private JMenuBar menuBar;
	
	private JMenu fileMenu;
	private JMenuItem loadOntologyOption;
	private JMenuItem closeOption;
	
	private JMenu ontologyMenu;
	private JMenuItem addInstanceOption;
	private JMenuItem validateInstanceOption;
	
	private JMenu IEMenu;
	private JMenuItem populateOntology;
	
	private OntologyTreePanel editPanel;
	private InstanceDetailsPanel viewPanel;
	
	private MenuBarController menuController;
	
	public MainFrame(){
		setLayout(new MigLayout());
		menuController = new MenuBarController();
		setMenuToolbar();
		initializePanels();
		addPanelsToFrame();
		setFrame();
	}
	
	private void setMenuToolbar(){
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		loadOntologyOption = new JMenuItem("Load ontology");
		closeOption = new JMenuItem("Close");
		
		fileMenu.add(loadOntologyOption);
		fileMenu.add(new JSeparator());
		fileMenu.add(closeOption);
		
		ontologyMenu = new JMenu("Ontology");
		menuBar.add(ontologyMenu);
		addInstanceOption = new JMenuItem("Add Instance");
		addInstanceOption.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				addInstanceFrame.getInstance().setVisible(true);;
			}
		});
		validateInstanceOption = new JMenuItem("Validate Instance");
		validateInstanceOption.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ValidationWindow();
			}
		});
		ontologyMenu.add(addInstanceOption);
		ontologyMenu.add(validateInstanceOption);
		
		IEMenu = new JMenu("Information Extaction");
		menuBar.add(IEMenu);
		populateOntology = new JMenuItem("Populate Ontology");
		populateOntology.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new ExtractionFrame();
			}
		});
		
		IEMenu.add(populateOntology);
		
		setJMenuBar(menuBar);
	}
	
	private void initializePanels(){
		editPanel = OntologyTreePanel.getInstance();
		viewPanel = InstanceDetailsPanel.getInstance();
	}
	
	private void addPanelsToFrame(){
		add(editPanel);
		add(viewPanel);
	}
	
	private void setFrame(){
		setTitle("IE Ontology Population System");
		setSize(sizeX, sizeY);
		setResizable(false);
		setVisible(true);
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	public static int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public static int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
}
