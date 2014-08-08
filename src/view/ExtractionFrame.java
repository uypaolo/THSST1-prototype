package view;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import net.miginfocom.swing.MigLayout;

public class ExtractionFrame extends JFrame{
	
	JTextArea logArea;
	SimpleDateFormat dateFormatter;
	JLabel currentAction;
	
	public ExtractionFrame(){
		setLayout(new MigLayout());
		
		dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		logArea = new JTextArea(prepareDummyLog());
		
		currentAction = new JLabel("Status: Retrieving Article");
		//currentAction.setBackground(Color.DARK_GRAY);
		
		add(logArea, "span, grow, push");
		
		add(new JButton("Stop"));
		add(new JButton("Next"), "wrap");
		
		add(currentAction, "spanx, growx, pushx");
		setTitle("Article Retrieval");
		setSize(640, 320);
		setResizable(false);
		setVisible(true);
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}
	
	private String prepareDummyLog() {
		StringBuilder builder = new StringBuilder();
		builder.append(dateFormatter.format(new Date()) + ": Retrieving article from http://www.infonet-biovision.org/default/ct/652/nutrition" + "\n");
		builder.append(dateFormatter.format(new Date()) + ": Retrieving something..." + "\n");
		builder.append(dateFormatter.format(new Date()) + ": Retrieving something..." + "\n");
		builder.append(dateFormatter.format(new Date()) + ": Retrieving something..." + "\n");
		builder.append(dateFormatter.format(new Date()) + ": Retrieving article from http://www.infonet-biovision.org/default/ct/796/nutrition" + "\n");
		builder.append(dateFormatter.format(new Date()) + ": Retrieving something..." + "\n");
		builder.append(dateFormatter.format(new Date()) + ": Retrieving something..." + "\n");
		builder.append(dateFormatter.format(new Date()) + ": Retrieving something..." + "\n");
		builder.append(dateFormatter.format(new Date()) + ": Retrieving article from http://www.nlm.nih.gov/medlineplus/ency/article/000355.htm" + "\n");
		builder.append(dateFormatter.format(new Date()) + ": Retrieving something..." + "\n");
		builder.append(dateFormatter.format(new Date()) + ": Retrieving something..." + "\n");
		builder.append(dateFormatter.format(new Date()) + ": Retrieving something..." + "\n");
		
		
		return builder.toString();
	}

}
