package view;

import javax.swing.JButton;
import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

public class EditInstanceFrame extends JFrame{
	private static EditInstanceFrame instance;
	
	public static EditInstanceFrame getInstance(){
		if(instance == null){
			instance = new EditInstanceFrame();
		}
		
		return instance;
	}
	
	public EditInstanceFrame() {
		setLayout(new MigLayout());
		add(EditInstanceView.getInstance(), "wrap");
		add(new JButton("Save"), "split, right");
		add(new JButton("Cancel"));
		setFrame();
	}
	
	private void setFrame(){
		//setSize(sizeX, sizeY);
		setTitle("Edit Instance");
		setResizable(false);
		setVisible(true);
		pack();
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
