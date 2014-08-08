package view;

import javax.swing.JFrame;

public class addInstanceFrame extends JFrame{
	private static addInstanceFrame instance;
	
	public static addInstanceFrame getInstance(){
		if(instance == null){
			instance = new addInstanceFrame();
		}
		
		return instance;
	}
	
	public addInstanceFrame(){
		add(new AddInstancePanel());
		setFrame();
	}
	
	private void setFrame(){
		setTitle("Add Instance");
		//setSize(sizeX, sizeY);
		setResizable(false);
		setVisible(true);
		pack();
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
