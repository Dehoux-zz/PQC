package userInterfaceLaag;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.WindowConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JOptionPane;

/**
* This code was generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a
* for-profit company or business) then you should purchase
* a license - please visit www.cloudgarden.com for details.
*/
public class RegVliegtuigFrame extends javax.swing.JFrame {
	private JLabel DMJ;
	private JTextField InGebruikTextField;
	private JTextField NaamTextField;
	private JLabel IG;
	private JLabel Nm;
	private JPanel NieuwVliegtuig;
	private JLabel NietRoken;
	private JTextField NietRokenTextField;
	private JTextField RokenTextField;
	private JLabel Capaciteit;
	private JButton Cancel;
	private JButton OK;
	private JTextField ContactTextField;
	private JLabel Type;
	private JComboBox TypeCombo;
	private JLabel Contact;
	private JLabel Fabrikant;
	private JComboBox FabrikantCombo;

	// Niet gegenereerde (dus zelf toegevoegde) attributen
	private RegVliegtuigController rvc;
	private boolean Geïnitialiseerd = false;
	private Calendar inGebruik = Calendar.getInstance();
	private Set<String> fabrikantenSet;

	public RegVliegtuigFrame() {
		initGUI();
	}

	public RegVliegtuigFrame(RegVliegtuigController rvc, Set<String> fabrSet) {
		this.rvc = rvc;
		fabrikantenSet = fabrSet;
		initGUI();
	}
	/**
	* Initializes the GUI.
	* Auto-generated code - any changes you make will disappear.
	*/
	public void initGUI() {
		try {
			preInitGUI();
			NieuwVliegtuig = new JPanel();
			Nm = new JLabel();
			IG = new JLabel();
			NaamTextField = new JTextField();
			InGebruikTextField = new JTextField();
			DMJ = new JLabel();
			NietRokenTextField = new JTextField();
			NietRoken = new JLabel();
			Capaciteit = new JLabel();
			Cancel = new JButton();
			Type = new JLabel();
			Contact = new JLabel();
			Fabrikant = new JLabel();
			FabrikantCombo = new JComboBox();
			TypeCombo = new JComboBox();
			ContactTextField = new JTextField();
			OK = new JButton();
			RokenTextField = new JTextField();
			this.getContentPane().setLayout(null);
			this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Registeer Vliegtuig");
			this.setName("Registreer Vliegtuig");
			this.setSize(new java.awt.Dimension(477, 337));
			this.setLocation(new java.awt.Point(470, 310));
			NieuwVliegtuig.setLayout(null);
			NieuwVliegtuig.setPreferredSize(new java.awt.Dimension(380, 110));
			NieuwVliegtuig.setBorder(
				new TitledBorder(
					null,
					"Nieuw vliegtuig",
					TitledBorder.LEADING,
					TitledBorder.TOP,
					new java.awt.Font("Dialog", 1, 12),
					new java.awt.Color(0, 0, 0)));
			NieuwVliegtuig.setOpaque(false);
			NieuwVliegtuig.setRequestFocusEnabled(false);
			NieuwVliegtuig.setName("");
			NieuwVliegtuig.setBounds(new java.awt.Rectangle(30, 130, 380, 110));
			this.getContentPane().add(NieuwVliegtuig);
			Nm.setText("Naam");
			Nm.setPreferredSize(new java.awt.Dimension(70, 20));
			Nm.setBounds(new java.awt.Rectangle(20, 30, 70, 20));
			NieuwVliegtuig.add(Nm);
			IG.setText("(dd-mm-yyyy)");
			IG.setPreferredSize(new java.awt.Dimension(80, 20));
			IG.setBounds(new java.awt.Rectangle(275, 60, 80, 20));
			IG.setFocusable(false);
			NieuwVliegtuig.add(IG);
			NaamTextField.setHorizontalAlignment(SwingConstants.CENTER);
			NaamTextField.setEnabled(true);
			NaamTextField.setBackground(new java.awt.Color(255, 255, 255));
			NaamTextField.setPreferredSize(new java.awt.Dimension(140, 20));
			NaamTextField.setBounds(new java.awt.Rectangle(120, 30, 140, 20));
			NieuwVliegtuig.add(NaamTextField);
			NaamTextField.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent evt) {
					NaamTextFieldFocusLost(evt);
				}
			});
			InGebruikTextField.setHorizontalAlignment(SwingConstants.CENTER);
			InGebruikTextField.setColumns(10);
			InGebruikTextField.setPreferredSize(
				new java.awt.Dimension(141, 20));
			InGebruikTextField.setBounds(
				new java.awt.Rectangle(120, 60, 141, 20));
			NieuwVliegtuig.add(InGebruikTextField);
			InGebruikTextField.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent evt) {
					InGebruikTextFieldFocusLost(evt);
				}
			});
			DMJ.setText("In gebruik");
			DMJ.setPreferredSize(new java.awt.Dimension(70, 20));
			DMJ.setBounds(new java.awt.Rectangle(20, 60, 70, 20));
			NieuwVliegtuig.add(DMJ);
			NietRokenTextField.setHorizontalAlignment(SwingConstants.CENTER);
			NietRokenTextField.setText(" ");
			NietRokenTextField.setEditable(false);
			NietRokenTextField.setPreferredSize(new java.awt.Dimension(90, 20));
			NietRokenTextField.setBounds(
				new java.awt.Rectangle(320, 100, 90, 20));
			this.getContentPane().add(NietRokenTextField);
			NietRoken.setText("Niet roken");
			NietRoken.setPreferredSize(new java.awt.Dimension(60, 20));
			NietRoken.setBounds(new java.awt.Rectangle(240, 100, 60, 20));
			this.getContentPane().add(NietRoken);
			Capaciteit.setText("Roken");
			Capaciteit.setPreferredSize(new java.awt.Dimension(60, 20));
			Capaciteit.setBounds(new java.awt.Rectangle(240, 70, 60, 20));
			this.getContentPane().add(Capaciteit);
			Cancel.setText("Cancel");
			Cancel.setPreferredSize(new java.awt.Dimension(80, 30));
			Cancel.setBounds(new java.awt.Rectangle(360, 260, 80, 30));
			this.getContentPane().add(Cancel);
			Cancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					CancelActionPerformed(evt);
				}
			});
			Type.setText("Type");
			Type.setPreferredSize(new java.awt.Dimension(60, 20));
			Type.setBounds(new java.awt.Rectangle(30, 70, 60, 20));
			this.getContentPane().add(Type);
			Contact.setText("Contact");
			Contact.setPreferredSize(new java.awt.Dimension(60, 20));
			Contact.setBounds(new java.awt.Rectangle(240, 30, 60, 20));
			this.getContentPane().add(Contact);
			Fabrikant.setText("Fabrikant");
			Fabrikant.setPreferredSize(new java.awt.Dimension(60, 20));
			Fabrikant.setBounds(new java.awt.Rectangle(30, 30, 60, 20));
			this.getContentPane().add(Fabrikant);
			FabrikantCombo.setActionCommand("comboBoxChanged");
			FabrikantCombo.setVisible(true);
			FabrikantCombo.setPreferredSize(new java.awt.Dimension(90, 20));
			FabrikantCombo.setOpaque(false);
			FabrikantCombo.setRequestFocusEnabled(false);
			FabrikantCombo.setVerifyInputWhenFocusTarget(false);
			FabrikantCombo.setName("");
			FabrikantCombo.setBounds(new java.awt.Rectangle(100, 30, 90, 20));
			this.getContentPane().add(FabrikantCombo);
			FabrikantCombo.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent evt) {
					FabrikantComboItemStateChanged(evt);
				}
			});
			TypeCombo.setPreferredSize(new java.awt.Dimension(90, 20));
			TypeCombo.setBounds(new java.awt.Rectangle(100, 70, 90, 20));
			this.getContentPane().add(TypeCombo);
			TypeCombo.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent evt) {
					TypeComboItemStateChanged(evt);
				}
			});
			ContactTextField.setHorizontalAlignment(SwingConstants.CENTER);
			ContactTextField.setText(" ");
			ContactTextField.setEditable(false);
			ContactTextField.setEnabled(true);
			ContactTextField.setPreferredSize(new java.awt.Dimension(90, 20));
			ContactTextField.setBounds(new java.awt.Rectangle(320, 30, 90, 20));
			ContactTextField.setIgnoreRepaint(true);
			this.getContentPane().add(ContactTextField);
			OK.setText("OK");
			OK.setPreferredSize(new java.awt.Dimension(80, 30));
			OK.setBounds(new java.awt.Rectangle(259, 261, 80, 30));
			this.getContentPane().add(OK);
			OK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					OKActionPerformed(evt);
				}
			});
			RokenTextField.setHorizontalAlignment(SwingConstants.CENTER);
			RokenTextField.setText(" ");
			RokenTextField.setEditable(false);
			RokenTextField.setPreferredSize(new java.awt.Dimension(90, 20));
			RokenTextField.setBounds(new java.awt.Rectangle(320, 70, 90, 20));
			this.getContentPane().add(RokenTextField);
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

	public void postInitGUI() {
		/**Er wordt eerst een leeg veld getoond. Zo moet de gebruiker een waarde
		 * selecteren, wat de event triggered. */
		String leeg = "";
		FabrikantCombo.addItem(leeg);
		// Lees de meegegeven Set namen uit en voeg ze toe aan FabrikantCombo.
		for(String s : fabrikantenSet){
			FabrikantCombo.addItem(s);
		}
		Geïnitialiseerd = true;
		/** Voorkomt dat de ItemStateChanged-event van FabrikantCombo iedere keer
		 * getriggerd wordt als er een add() wordt gedaan. */
	}

	/** Auto-generated event handler method */
	protected void FabrikantComboItemStateChanged(ItemEvent evt) {
		if (Geïnitialiseerd) {
			String fabrnm = (String) FabrikantCombo.getSelectedItem();
			if (fabrnm != "") {
				String fbrn = (String) FabrikantCombo.getSelectedItem();
				Vector<String> vf = rvc.fabrikant(fbrn);
				String cp = vf.get(0);
				ContactTextField.setText(cp);
				vf.remove(0);
				TypeCombo.removeAllItems();
				/**Er wordt eerst een leeg veld getoond. Zo moet de gebruiker een waarde
				* selecteren, wat de event triggered (anders staat er wel iets, maar is er
				* geen selectie aan de controller doorgegeven. */
				String leeg = "";
				TypeCombo.addItem(leeg);
				// Lees de meegegeven Set namen uit en voeg ze toe aan TypeCombo.
				for (String s : vf) {
					TypeCombo.addItem(s);
				}
			}
		}
	}

	/** Auto-generated event handler method */
	protected void TypeComboItemStateChanged(ItemEvent evt) {
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			String typenm = (String) TypeCombo.getSelectedItem();
			if (typenm != "") {
				int[] cap = rvc.type(typenm);
				String capR = (cap[0] + "");
				String capNR = (cap[1] + "");
				RokenTextField.setText(capR);
				NietRokenTextField.setText(capNR);
			}
		}
	}

	/** Auto-generated event handler method */
	protected void NaamTextFieldFocusLost(FocusEvent evt) {
		//Negeer de event, als die afkomstig is van de message-box.
		if (evt.isTemporary())
			return;
		try {
			String nm = NaamTextField.getText();
			rvc.naam(nm);
			//Geef het veld weer de standaardkleur (na vorige foute invoer).
			NaamTextField.setBackground(new java.awt.Color(255, 255, 255));
		} catch (IllegalArgumentException ei) {
			JOptionPane.showMessageDialog(
				this,
				ei.getMessage(),
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
			//Geef het veld een rode kleur.
			NaamTextField.setBackground(new java.awt.Color(255, 0, 128));
		}
	}

	/** Auto-generated event handler method */
	protected void InGebruikTextFieldFocusLost(FocusEvent evt) {
		//Negeer de event, als die afkomstig is van de message-box.
		if (evt.isTemporary())
			return;
		try {
			String s = InGebruikTextField.getText();
			/** Ontleed de String in dag, maand, jaar.
			 * Als een waarde ontbreekt: nextToken()throws NoSuchElementException.
			 * Als het geen decimale waarden zijn: parseInt() throws NumberFormatException */
			StringTokenizer st = new StringTokenizer(s, "-. ");
			int dag = Integer.parseInt(st.nextToken());
			int maand = Integer.parseInt(st.nextToken()) - 1;
			int jaar = Integer.parseInt(st.nextToken());
			Calendar c = Calendar.getInstance();
			c.set(jaar, maand, dag);
			rvc.inGebruik(c); //Throws IllegalArgumentException, als het geen bestaande dag is
			InGebruikTextField.setBackground(new java.awt.Color(255, 255, 255));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(
				this,
				"Ongeldige datum: " + e.getMessage(),
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
			InGebruikTextField.setBackground(new java.awt.Color(255, 0, 128));
		} catch (NoSuchElementException e) {
			JOptionPane.showMessageDialog(
				this,
				"Ongeldige datum: " + e.getMessage(),
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
			InGebruikTextField.setBackground(new java.awt.Color(255, 0, 128));
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(
				this,
				e.getMessage(),
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
			InGebruikTextField.setBackground(new java.awt.Color(255, 0, 128));
		}
	}

	/** Auto-generated event handler method */
	protected void OKActionPerformed(ActionEvent evt) {
		try {
			rvc.ok();
		} catch (IllegalStateException ei) {
			JOptionPane.showMessageDialog(
				this,
				ei.getMessage(),
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
		}
	}

	/** Auto-generated event handler method */
	protected void CancelActionPerformed(ActionEvent evt) {
		rvc.cancel();
	}

}
