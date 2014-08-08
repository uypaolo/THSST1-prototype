package view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;

public class InstanceDetailsValidationPanel extends JPanel{
	JTable synonyms;
	JTable symptoms;
	JTable deficiency;
	JTable abundance;
	JTable recommended;
	JTable avoid;
	
	public InstanceDetailsValidationPanel(){
		setLayout(new MigLayout());
		setPreferredSize(new Dimension((int)(MainFrame.getSizeX()*.7), MainFrame.getSizeY()));
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Instance Details"));
		JPanel wrapper = new JPanel();
		wrapper.setLayout(new MigLayout());
		synonyms = new JTable();
		JPanel syno = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		syno.setLayout(new MigLayout());
		syno.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Synonyms"));
		
		JScrollPane scp = new JScrollPane(synonyms);
		scp.setPreferredSize(new Dimension((int)(MainFrame.getSizeX()*.7)-100, 100));
		syno.add(scp, "spanx, growx, pushx, wrap");
		syno.add(new JButton("Remove"));
		wrapper.add(syno, "spanx, growx, pushx, wrap");
		
		
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		Vector<Object> vector;
		Vector<String> columns;
		
		
		data = new Vector<Vector<Object>>();
		vector = new Vector<Object>();
		
		vector.add("weakness");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("swollen joints");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("muscle hardness");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("gum problems");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("tooth loss");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("slow healing of wounds");
		data.add(vector);
		
		columns = new Vector<String>(Arrays.asList(new String[]{"Symptoms"}));
		symptoms = new JTable(new DefaultTableModel(data, columns));
		JPanel symp = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		symp.setLayout(new MigLayout());
		symp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Symptoms"));

		scp = new JScrollPane(symptoms);
		scp.setPreferredSize(new Dimension((int)(MainFrame.getSizeX()*.7)-100, 100));
		symp.add(scp, "spanx, growx, pushx, wrap");
		symp.add(new JButton("Remove"));
		wrapper.add(symp, "spanx, growx, pushx, wrap");
		
		
		abundance = new JTable();
		JPanel abu = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		abu.setLayout(new MigLayout());
		abu.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Nutrient Abundance"));

		scp = new JScrollPane(abundance);
		scp.setPreferredSize(new Dimension((int)(MainFrame.getSizeX()*.7)-100, 100));
		abu.add(scp, "spanx, growx, pushx, wrap");
		abu.add(new JButton("Remove"));
		wrapper.add(abu, "spanx, growx, pushx, wrap");
		
		data = new Vector<Vector<Object>>();
		
		vector = new Vector<Object>();
		vector.add("vitamin C");
		data.add(vector);
		
		columns = new Vector<String>(Arrays.asList(new String[]{"Nutrient"}));
		
		deficiency = new JTable(new DefaultTableModel(data, columns));
		JPanel def = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		def.setLayout(new MigLayout());
		def.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Nutrient Deficiency"));

		scp = new JScrollPane(deficiency);
		scp.setPreferredSize(new Dimension((int)(MainFrame.getSizeX()*.7)-100, 100));
		def.add(scp, "spanx, growx, pushx, wrap");
		def.add(new JButton("Remove"));
		wrapper.add(def, "spanx, growx, pushx, wrap");
		
		data = new Vector<Vector<Object>>();
		vector = new Vector<Object>();
		
		vector.add("citrus fruits");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("oranges");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("grapefruits");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("lemons");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("limes");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("tangerines");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("berries");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("melons");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("red and green bell peppers");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("potatoes");
		data.add(vector);
		vector = new Vector<Object>();
		vector.add("tomatoes");
		data.add(vector);
		
		columns = new Vector<String>(Arrays.asList(new String[]{"Food"}));
		
		recommended = new JTable(new DefaultTableModel(data, columns));
		JPanel rec = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		rec.setLayout(new MigLayout());
		rec.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Recommended Food"));

		scp = new JScrollPane(recommended);
		scp.setPreferredSize(new Dimension((int)(MainFrame.getSizeX()*.7)-100, 100));
		rec.add(scp, "spanx, growx, pushx, wrap");
		rec.add(new JButton("Remove"));
		wrapper.add(rec, "spanx, growx, pushx, wrap");
		
		avoid = new JTable();
		JPanel avo = new JPanel();
		//foodInfo.setBackground(Color.BLUE);
		avo.setLayout(new MigLayout());
		avo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 1), "Food to Avoid"));

		scp = new JScrollPane(avoid);
		scp.setPreferredSize(new Dimension((int)(MainFrame.getSizeX()*.7)-100, 100));
		avo.add(scp, "spanx, growx, pushx, wrap");
		avo.add(new JButton("Remove"));
		wrapper.add(avo, "spanx, growx, pushx, wrap");
		
		add(new JScrollPane(wrapper),"span, grow, push, wrap");
		//add(new JScrollPane(instanceList), "span, grow, push, wrap");

		
		
	}
}
