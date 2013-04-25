package userInterfaceLaag;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

import domeinLaag.VluchtException;

/**
* This code was generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a
* for-profit company or business) then you should purchase
* a license - please visit www.cloudgarden.com for details.
*/
public class RegVluchtJFrame extends javax.swing.JFrame {

	private JTextField vertrekDatumVeld;
	private JButton oKButton;
	private JButton cancelButton;
	private JTextField aankomstDatumVeld;
	private JTextField vertrekTijdVeld;
	private JTextField aankomstTijdVeld;
	private JComboBox vertrekPuntenBox;
	private JComboBox bestemmingenBox;
	private JLabel jLabel10;
	private JLabel jLabel9;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JPanel jPanel1;
	private JLabel jLabel6;
	private JLabel jLabel5;
	private JLabel jLabel4;
	private JLabel jLabel3;
	private JLabel jLabel2;
	private JComboBox vliegtuigBox;
	private JLabel jLabel1;
	//volgende velden zijn toegevoegd door j.zuurbier
	Set<String> vliegtuigen;
	Set<String> luchthavens;
	RegVluchtController controller;
	Calendar vertrekTijd, aankomstTijd;

	public RegVluchtJFrame() {
		initGUI();
	}

	public RegVluchtJFrame(Set<String> vt, Set<String> lh, RegVluchtController rvc) {
		this.vliegtuigen = vt;
		this.luchthavens = lh;
		this.controller = rvc;
		initGUI();
	}

	/**
		* Initializes the GUI.
		* Auto-generated code - any changes you make will disappear.
		*/
	public void initGUI() {
		try {
			preInitGUI();
			cancelButton = new JButton();
			jPanel1 = new JPanel();
			vertrekTijdVeld = new JTextField();
			aankomstTijdVeld = new JTextField();
			bestemmingenBox = new JComboBox();
			jLabel7 = new JLabel();
			jLabel8 = new JLabel();
			jLabel9 = new JLabel();
			jLabel10 = new JLabel();
			vertrekPuntenBox = new JComboBox();
			aankomstDatumVeld = new JTextField();
			vertrekDatumVeld = new JTextField();
			jLabel5 = new JLabel();
			jLabel1 = new JLabel();
			vliegtuigBox = new JComboBox();
			jLabel2 = new JLabel();
			jLabel3 = new JLabel();
			jLabel4 = new JLabel();
			jLabel6 = new JLabel();
			oKButton = new JButton();
			this.getContentPane().setLayout(null);
			this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Registreer Vlucht");
			this.setSize(new java.awt.Dimension(447, 377));
			this.setLocation(new java.awt.Point(470, 310));
			cancelButton.setText("Cancel");
			cancelButton.setVisible(true);
			cancelButton.setPreferredSize(new java.awt.Dimension(75, 25));
			cancelButton.setName("");
			cancelButton.setBounds(new java.awt.Rectangle(301, 295, 75, 25));
			this.getContentPane().add(cancelButton);
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					cancelButtonActionPerformed(evt);
				}
			});
			jPanel1.setLayout(null);
			jPanel1.setVisible(true);
			jPanel1.setPreferredSize(new java.awt.Dimension(380, 145));
			jPanel1.setBorder(
				new TitledBorder(
					null,
					"Nieuwe Vlucht",
					TitledBorder.LEADING,
					TitledBorder.TOP,
					new java.awt.Font("Dialog", 1, 12),
					new java.awt.Color(0, 0, 0)));
			jPanel1.setOpaque(true);
			jPanel1.setName("Nieuwe Vlucht");
			jPanel1.setBounds(new java.awt.Rectangle(31, 131, 380, 145));
			jPanel1.setFocusable(false);
			this.getContentPane().add(jPanel1);
			vertrekTijdVeld.setVisible(true);
			vertrekTijdVeld.setPreferredSize(new java.awt.Dimension(80, 20));
			vertrekTijdVeld.setBounds(new java.awt.Rectangle(232, 81, 80, 20));
			jPanel1.add(vertrekTijdVeld);
			vertrekTijdVeld.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent evt) {
					vertrekTijdVeldFocusLost(evt);
				}
			});
			aankomstTijdVeld.setVisible(true);
			aankomstTijdVeld.setPreferredSize(new java.awt.Dimension(80, 20));
			aankomstTijdVeld.setBounds(
				new java.awt.Rectangle(234, 110, 80, 20));
			jPanel1.add(aankomstTijdVeld);
			aankomstTijdVeld.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent evt) {
					aankomstTijdVeldFocusLost(evt);
				}
			});
			bestemmingenBox.setVisible(true);
			bestemmingenBox.setPreferredSize(new java.awt.Dimension(130, 20));
			bestemmingenBox.setBounds(new java.awt.Rectangle(120, 50, 130, 20));
			jPanel1.add(bestemmingenBox);
			bestemmingenBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent evt) {
					bestemmingenBoxItemStateChanged(evt);
				}
			});
			jLabel7.setText("Vertrek");
			jLabel7.setPreferredSize(new java.awt.Dimension(160, 20));
			jLabel7.setBounds(new java.awt.Rectangle(19, 86, 160, 20));
			jLabel7.setFocusable(false);
			jPanel1.add(jLabel7);
			jLabel8.setText("Vertrekpunt");
			jLabel8.setPreferredSize(new java.awt.Dimension(160, 15));
			jLabel8.setBounds(new java.awt.Rectangle(20, 24, 160, 15));
			jLabel8.setFocusable(false);
			jPanel1.add(jLabel8);
			jLabel9.setText("Aankomst");
			jLabel9.setPreferredSize(new java.awt.Dimension(160, 20));
			jLabel9.setBounds(new java.awt.Rectangle(20, 110, 160, 20));
			jLabel9.setFocusable(false);
			jPanel1.add(jLabel9);
			jLabel10.setText("Bestemming");
			jLabel10.setPreferredSize(new java.awt.Dimension(160, 20));
			jLabel10.setBounds(new java.awt.Rectangle(20, 50, 160, 20));
			jLabel10.setFocusable(false);
			jPanel1.add(jLabel10);
			vertrekPuntenBox.setVisible(true);
			vertrekPuntenBox.setPreferredSize(new java.awt.Dimension(130, 20));
			vertrekPuntenBox.setBounds(
				new java.awt.Rectangle(121, 20, 130, 20));
			jPanel1.add(vertrekPuntenBox);
			vertrekPuntenBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent evt) {
					vertrekPuntenBoxItemStateChanged(evt);
				}
			});
			aankomstDatumVeld.setVisible(true);
			aankomstDatumVeld.setPreferredSize(new java.awt.Dimension(90, 20));
			aankomstDatumVeld.setBounds(
				new java.awt.Rectangle(120, 110, 90, 20));
			jPanel1.add(aankomstDatumVeld);
			vertrekDatumVeld.setVisible(true);
			vertrekDatumVeld.setPreferredSize(new java.awt.Dimension(90, 20));
			vertrekDatumVeld.setBounds(new java.awt.Rectangle(120, 82, 90, 20));
			jPanel1.add(vertrekDatumVeld);
			jLabel5.setText("0");
			jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel5.setVisible(true);
			jLabel5.setBackground(new java.awt.Color(240, 240, 255));
			jLabel5.setPreferredSize(new java.awt.Dimension(40, 20));
			jLabel5.setOpaque(true);
			jLabel5.setBounds(new java.awt.Rectangle(140, 94, 40, 20));
			jLabel5.setFocusable(false);
			this.getContentPane().add(jLabel5);
			FlowLayout jLabel1Layout = new FlowLayout();
			jLabel1.setLayout(jLabel1Layout);
			jLabel1Layout.setAlignment(FlowLayout.CENTER);
			jLabel1Layout.setHgap(5);
			jLabel1Layout.setVgap(5);
			jLabel1.setText("Vliegtuig");
			jLabel1.setPreferredSize(new java.awt.Dimension(105, 30));
			jLabel1.setAlignmentX(1.0f);
			jLabel1.setBounds(new java.awt.Rectangle(30, 25, 105, 30));
			jLabel1.setFocusable(false);
			this.getContentPane().add(jLabel1);
			vliegtuigBox.setVisible(true);
			vliegtuigBox.setPreferredSize(new java.awt.Dimension(145, 20));
			vliegtuigBox.setOpaque(false);
			vliegtuigBox.setName("vliegtuigBox");
			vliegtuigBox.setBounds(new java.awt.Rectangle(140, 30, 145, 20));
			this.getContentPane().add(vliegtuigBox);
			vliegtuigBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent evt) {
					vliegtuigBoxItemStateChanged(evt);
				}
			});
			jLabel2.setText("Capaciteit");
			jLabel2.setVisible(true);
			jLabel2.setPreferredSize(new java.awt.Dimension(60, 20));
			jLabel2.setBounds(new java.awt.Rectangle(30, 70, 60, 20));
			jLabel2.setFocusable(true);
			this.getContentPane().add(jLabel2);
			jLabel3.setText("0");
			jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel3.setVisible(true);
			jLabel3.setBackground(new java.awt.Color(240, 240, 255));
			jLabel3.setPreferredSize(new java.awt.Dimension(40, 20));
			jLabel3.setOpaque(true);
			jLabel3.setBounds(new java.awt.Rectangle(140, 70, 40, 20));
			jLabel3.setFocusable(false);
			this.getContentPane().add(jLabel3);
			jLabel4.setText("Roken");
			jLabel4.setVisible(true);
			jLabel4.setPreferredSize(new java.awt.Dimension(60, 20));
			jLabel4.setBounds(new java.awt.Rectangle(191, 70, 60, 20));
			jLabel4.setFocusable(false);
			this.getContentPane().add(jLabel4);
			jLabel6.setText("Niet Roken");
			jLabel6.setVisible(true);
			jLabel6.setPreferredSize(new java.awt.Dimension(80, 20));
			jLabel6.setBounds(new java.awt.Rectangle(190, 95, 80, 20));
			jLabel6.setFocusable(false);
			this.getContentPane().add(jLabel6);
			oKButton.setText("OK");
			oKButton.setVisible(true);
			oKButton.setPreferredSize(new java.awt.Dimension(60, 25));
			oKButton.setBounds(new java.awt.Rectangle(230, 296, 60, 25));
			this.getContentPane().add(oKButton);
			oKButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					oKButtonActionPerformed(evt);
				}
			});
			postInitGUI();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/** Add your pre-init code in here 	*/
	public void preInitGUI() {
	}

	/** Add your post-init code in here 	*/
	public void postInitGUI() {
		String leeg = "";
		vliegtuigBox.addItem(leeg);
		for (String s : vliegtuigen) {
			vliegtuigBox.addItem(s);
		}
		vertrekPuntenBox.addItem(leeg);
		for (String s : luchthavens) {
			vertrekPuntenBox.addItem(s);
		}
		bestemmingenBox.addItem(leeg);
		for (String s : luchthavens) {
			bestemmingenBox.addItem(s);
		}
		setAktief(false);
	}

	/** Auto-generated main method */
	public static void main(String[] args) {
		showGUI();
	}

	/**
	* Auto-generated code - any changes you make will disappear!!!
	* This static method creates a new instance of this class and shows
	* it inside a new JFrame, (unless it is already a JFrame).
	*/
	public static void showGUI() {
		try {
			RegVluchtJFrame inst = new RegVluchtJFrame();
			inst.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * gemaakt door J.Zuurbier
	 * indien er geen vliegtuig is geselecteerd wordt een deel
	 * van het scherm niet aktief en kan er geen nieuwe vlucht
	 * worden ingevuld.
	 * @param b
	 */
	private void setAktief(boolean b) {
		oKButton.setEnabled(b);
		//cancelButton.setEnabled(b);
		aankomstDatumVeld.setEnabled(b);
		vertrekDatumVeld.setEnabled(b);
		aankomstTijdVeld.setEnabled(b);
		vertrekTijdVeld.setEnabled(b);
		vertrekPuntenBox.setEnabled(b);
		bestemmingenBox.setEnabled(b);
	}
	/** Auto-generated event handler method */
	protected void vliegtuigBoxItemStateChanged(ItemEvent evt) {

		if (evt.getStateChange() == ItemEvent.SELECTED) {
			String s = (String) evt.getItem();
			if (!s.equals("")) {
				int[] cap = controller.vliegtuig(s);
				jLabel3.setText("" + cap[0]);
				jLabel5.setText("" + cap[1]);
				setAktief(true);
			} else {
				jLabel3.setText("0");
				jLabel5.setText("0");
				setAktief(false);
			}
		}

	}

	/** Auto-generated event handler method */
	protected void vertrekPuntenBoxItemStateChanged(ItemEvent evt) {
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED) {
				String s = (String) evt.getItem();
				if (!s.equals("")) {
					controller.vertrekpunt(s);
				}
				s = (String) bestemmingenBox.getSelectedItem();
				if (s != null && !s.equals("")) {
					controller.bestemming(s);
				}
			}
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(
				this,
				e.getMessage(),
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
		}
	}

	/** Auto-generated event handler method */
	protected void bestemmingenBoxItemStateChanged(ItemEvent evt) {
		try {

			if (evt.getStateChange() == ItemEvent.SELECTED) {
				String s = (String) evt.getItem();
				if (!s.equals("")) {
					controller.bestemming(s);
				}
			}
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(
				this,
				e.getMessage(),
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
		}
	}

	/** Auto-generated event handler method */
	protected void oKButtonActionPerformed(ActionEvent evt) {
		try {

			controller.ok();
			//System.out.println("vlucht geregistreerd.");
			dispose();
		} catch (VluchtException e) {
			JOptionPane.showMessageDialog(
				this,
				e.getMessage(),
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
		}

	}

	/** Auto-generated event handler method */
	protected void cancelButtonActionPerformed(ActionEvent evt) {
		dispose();
	}

	/** Auto-generated event handler method */
	protected void vertrekTijdVeldFocusLost(FocusEvent evt) {
		try {
			String s = vertrekDatumVeld.getText();
			StringTokenizer st = new StringTokenizer(s, "-. ");
			int dag = Integer.parseInt(st.nextToken());
			int maand = Integer.parseInt(st.nextToken()) - 1;
			int jaar = Integer.parseInt(st.nextToken());
			s = vertrekTijdVeld.getText();
			st = new StringTokenizer(s, ":h. ");
			int uur = Integer.parseInt(st.nextToken());
			int min = Integer.parseInt(st.nextToken());
			Calendar c = Calendar.getInstance();
			c.set(jaar, maand, dag, uur, min);
			controller.vertrektijd(c);
			vertrekTijdVeld.setBackground(new java.awt.Color(255, 255, 255));
			vertrekDatumVeld.setBackground(new java.awt.Color(255, 255, 255));

		} catch (NumberFormatException e) {
			vertrekTijdVeld.setBackground(new java.awt.Color(255, 0, 128));
			vertrekDatumVeld.setBackground(new java.awt.Color(255, 0, 128));
			JOptionPane.showMessageDialog(
				this,
				e.getMessage(),
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
		} catch (NoSuchElementException e) {
			vertrekTijdVeld.setBackground(new java.awt.Color(255, 0, 128));
			vertrekDatumVeld.setBackground(new java.awt.Color(255, 0, 128));
			JOptionPane.showMessageDialog(
				this,
				"geef datum als dd-mm-yyyy\ntijd in de vorm hh:mm",
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
		} catch (VluchtException e) {
			vertrekTijdVeld.setBackground(new java.awt.Color(255, 0, 128));
			vertrekDatumVeld.setBackground(new java.awt.Color(255, 0, 128));
			JOptionPane.showMessageDialog(
				this,
				e.getMessage(),
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
		}

	}

	/** Auto-generated event handler method */
	protected void aankomstTijdVeldFocusLost(FocusEvent evt) {
		try {
			String s = aankomstDatumVeld.getText();
			StringTokenizer st = new StringTokenizer(s, "-. ");
			int dag = Integer.parseInt(st.nextToken());
			int maand = Integer.parseInt(st.nextToken()) - 1;
			int jaar = Integer.parseInt(st.nextToken());
			s = aankomstTijdVeld.getText();
			st = new StringTokenizer(s, ":h. ");
			int uur = Integer.parseInt(st.nextToken());
			int min = Integer.parseInt(st.nextToken());
			Calendar c = Calendar.getInstance();
			c.set(jaar, maand, dag, uur, min);
			controller.aankomstTijd(c);
			aankomstTijdVeld.setBackground(new java.awt.Color(255, 255, 255));
			aankomstDatumVeld.setBackground(new java.awt.Color(255, 255, 255));

		} catch (NumberFormatException e) {
			aankomstTijdVeld.setBackground(new java.awt.Color(255, 0, 128));
			aankomstDatumVeld.setBackground(new java.awt.Color(255, 0, 128));
			JOptionPane.showMessageDialog(
				this,
				e.getMessage(),
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
		} catch (NoSuchElementException e) {
			aankomstTijdVeld.setBackground(new java.awt.Color(255, 0, 128));
			aankomstDatumVeld.setBackground(new java.awt.Color(255, 0, 128));
			JOptionPane.showMessageDialog(
				this,
				"geef datum als dd-mm-yyyy\ntijd in de vorm hh:mm",
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
		} catch (VluchtException e) {
			aankomstTijdVeld.setBackground(new java.awt.Color(255, 0, 128));
			aankomstDatumVeld.setBackground(new java.awt.Color(255, 0, 128));
			JOptionPane.showMessageDialog(
				this,
				e.getMessage(),
				"Fout!!! ",
				JOptionPane.ERROR_MESSAGE);
		}
	}
}
