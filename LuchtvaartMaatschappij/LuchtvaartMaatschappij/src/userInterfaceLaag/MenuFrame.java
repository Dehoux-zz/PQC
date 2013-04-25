package userInterfaceLaag;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.WindowConstants;
import javax.swing.SwingConstants;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MenuFrame extends javax.swing.JFrame {

	private JTextField Keuze;
	private JLabel Label;
	private JTextArea TextArea;
	private JButton Ok;
	//Zelf gedefinieerde!
	private domeinLaag.LuchtvaartMaatschappij lvm;

	public MenuFrame(domeinLaag.LuchtvaartMaatschappij lvm) {
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
			Label = new JLabel();
			Ok = new JButton();
			TextArea = new JTextArea();
			Keuze = new JTextField();
			this.getContentPane().setLayout(null);
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			this.setTitle("Hoofdmenu Luchtvaartmaatschappij NLM");
			this.addWindowListener(new WindowAdapter() {
				public void windowActivated(WindowEvent evt) {
					thisWindowActivated(evt);
				}
			});
			this.setSize(new java.awt.Dimension(477, 337));
			Label.setText("Uw keuze :");
			Label.setPreferredSize(new java.awt.Dimension(80, 20));
			Label.setBounds(new java.awt.Rectangle(40, 250, 80, 20));
			Label.setFocusable(false);
			this.getContentPane().add(Label);
			Ok.setText("OK");
			Ok.setPreferredSize(new java.awt.Dimension(70, 20));
			Ok.setVerifyInputWhenFocusTarget(false);
			Ok.setFocusCycleRoot(false);
			Ok.setBounds(new java.awt.Rectangle(320, 250, 70, 20));
			this.getContentPane().add(Ok);
			Ok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					OkActionPerformed(evt);
				}
			});
			Ok.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent evt) {
					OkKeyPressed(evt);
				}
			});
			TextArea.setTabSize(5);
			TextArea.setEditable(false);
			TextArea.setDisabledTextColor(new java.awt.Color(64, 0, 64));
			TextArea.setEnabled(true);
			TextArea.setVisible(true);
			TextArea.setBackground(new java.awt.Color(204, 204, 204));
			TextArea.setPreferredSize(new java.awt.Dimension(360, 180));
			TextArea.setRequestFocusEnabled(true);
			TextArea.setVerifyInputWhenFocusTarget(false);
			TextArea.setBounds(new java.awt.Rectangle(50, 40, 360, 180));
			TextArea.setFocusTraversalKeysEnabled(true);
			TextArea.setFocusable(false);
			this.getContentPane().add(TextArea);
			Keuze.setHorizontalAlignment(SwingConstants.CENTER);
			Keuze.setPreferredSize(new java.awt.Dimension(60, 20));
			Keuze.setRequestFocusEnabled(true);
			Keuze.setVerifyInputWhenFocusTarget(false);
			Keuze.setFocusCycleRoot(false);
			Keuze.setBounds(new java.awt.Rectangle(130, 250, 60, 20));
			this.getContentPane().add(Keuze);
			Keuze.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					KeuzeActionPerformed(evt);
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
		TextArea.setText("		1	Registreer vliegtuig\n");
		TextArea.append("		2	Overzicht vliegtuigen\n");
		TextArea.append("		3	Registreer luchthaven\n");
		TextArea.append("		4	Overzicht luchthavens\n");
		TextArea.append("		5	Registreer vlucht\n");
		TextArea.append("		6	Overzicht vluchten per vliegtuig\n");
		TextArea.append("		7	Boek vlucht\n");
		TextArea.append("		8	Overzicht boekingen per vlucht\n");
		TextArea.append("		9	Overzicht klanten\n");
	}

	/**
							* Auto-generated code - any changes you make will disappear!!!
							* This static method creates a new instance of this class and shows
							* it inside a new JFrame, (unless it is already a JFrame).
							*/
	public static void showGUI() {
	}

	/** Auto-generated event handler method */
	protected void OkActionPerformed(ActionEvent evt) {
		ok();
	}

	/** Auto-generated event handler method */
	protected void OkKeyPressed(KeyEvent evt) {
		ok();
	}

	/** Zelf geschreven */
	private void ok() {
		String keuze = Keuze.getText();
		int keuzeNr = 0;
		try {
			keuzeNr = Integer.parseInt(keuze);
		} catch (NumberFormatException e) {
		}
		if (keuzeNr == 1) {
			RegVliegtuigController rvtc = new RegVliegtuigController(lvm);
		} else if (keuzeNr == 2) {
			OverzVliegtuigenFrame ovf = new OverzVliegtuigenFrame(lvm);
		} else if (keuzeNr == 3) {
			RegLuchthavenContr rlc = new RegLuchthavenContr();
		}else if (keuzeNr == 5) {
			RegVluchtController rvc = new RegVluchtController(lvm);
		} else if (keuzeNr == 7){
			//BoekvluchtContr bvc = new BoekvluchtContr();
		}


	}

	/** Auto-generated event handler method */
	protected void KeuzeActionPerformed(ActionEvent evt) {
		Ok.requestFocus();
	}
	
	private void thisWindowActivated(WindowEvent evt) {
		System.out.println("this.windowActivated, event="+evt);
		//TODO add your code for this.windowActivated
		Keuze.setText("");
		Keuze.requestFocus();
	}

}
