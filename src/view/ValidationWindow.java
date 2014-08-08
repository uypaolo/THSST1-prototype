package view;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

public class ValidationWindow extends JFrame{
	private InstanceListValidationPanel listPanel;
	private InstanceDetailsValidationPanel detailsPanel;
	
	private static int sizeX = 1000;
	private static int sizeY = 640;
	
	public ValidationWindow(){
		setLayout(new MigLayout());
		listPanel = new InstanceListValidationPanel();
		detailsPanel = new InstanceDetailsValidationPanel();
		
		add(listPanel);
		add(detailsPanel);
		
		setTitle("Instance Validation");
		setSize(sizeX, sizeY);
		setResizable(false);
		setVisible(true);
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}
}
