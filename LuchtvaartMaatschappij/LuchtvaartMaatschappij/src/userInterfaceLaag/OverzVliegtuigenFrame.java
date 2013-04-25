package userInterfaceLaag;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import domeinLaag.*;
import javax.swing.WindowConstants;
import java.util.*;

public class OverzVliegtuigenFrame extends javax.swing.JFrame {
	private JButton Ok;
	private JTextArea TextArea;
	//volgende velden zijn handmatig toegevoegd
	LuchtvaartMaatschappij lvm;

	public OverzVliegtuigenFrame(LuchtvaartMaatschappij lvm) {
		this.lvm = lvm;
		initGUI();
	}
	/**
	* Initializes the GUI.
	* Auto-generated code - any changes you make will disappear.
	*/
	public void initGUI() {
		try {
			preInitGUI();
			TextArea = new JTextArea();
			Ok = new JButton();
			this.getContentPane().setLayout(null);
			this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Overzicht vliegtuigen");
			this.setSize(new java.awt.Dimension(477, 337));
			this.setLocation(new java.awt.Point(470, 310));
			TextArea.setTabSize(10);
			TextArea.setEditable(false);
			TextArea.setEnabled(true);
			TextArea.setPreferredSize(new java.awt.Dimension(416, 230));
			TextArea.setDoubleBuffered(true);
			TextArea.setBounds(new java.awt.Rectangle(26, 20, 416, 230));
			TextArea.setFocusable(false);
			this.getContentPane().add(TextArea);
			Ok.setText("OK");
			Ok.setPreferredSize(new java.awt.Dimension(60, 20));
			Ok.setBounds(new java.awt.Rectangle(350, 270, 60, 20));
			this.getContentPane().add(Ok);
			Ok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					OkActionPerformed(evt);
				}
			});
			postInitGUI();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	* Add your pre-init code in here
	*/
	public void preInitGUI() {
	}
	/**
	* Add your post-init code in here
	*/
	public void postInitGUI() {
		TextArea.setText("VLIEGTUIG	FABRIKANT	TYPE	CAPACITEIT \n");
		TextArea.append(" \n");

		TreeMap<String, Vliegtuig> vliegtuigen = lvm.geefVliegtuigen();
		Set<String> vSet = vliegtuigen.keySet();
		for (String vNaam : vSet) {
			
			Vliegtuig vliegtuig =  vliegtuigen.get(vNaam);
			VliegtuigType vtt = vliegtuig.geefVliegtuigType();
			String vttCode = vtt.geefCode();
			Fabrikant fb = vtt.geefFabrikant();
			String fbNaam = fb.geefNaam();
			int[] cp = vliegtuig.geefCapaciteit();
			String cap = "R " + cp[0] + " NR " + cp[1];
			TextArea.append(
				vNaam
					+ "	"
					+ fbNaam
					+ "	"
					+ vttCode
					+ "	"
					+ cap
					+ "\n");
		}
		this.setVisible(true);
	}

	/** Auto-generated event handler method */
	protected void OkActionPerformed(ActionEvent evt) {
		dispose();
	}
}
