package userInterfaceLaag;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class RegLuchthavenFrame extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JComboBox landenComboBox;
	private JLabel jLabel2;
	private JPanel jPanel1;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JButton jButton2;
	private JButton jButton1;
	private ButtonGroup buttonGroup1;
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton1;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JTextField landCodeField;
	
	private RegLuchthavenContr theController;
	private Set<String> landNamen;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RegLuchthavenFrame inst = new RegLuchthavenFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public RegLuchthavenFrame() {
		super();
		initGUI();
		postInitGUI();
	}
	
	public RegLuchthavenFrame(RegLuchthavenContr aController, Set<String> landNamen) {
		super();
		theController = aController;
		this.landNamen = landNamen;
		initGUI();
		postInitGUI();
	}
	
	
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Registreer Luchthaven");
			getContentPane().setLayout(null);
			this.setLocation(new java.awt.Point(400, 400));
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Land");
				jLabel1.setBounds(49, 42, 35, 14);
			}
			{
				ComboBoxModel jComboBox1Model = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				landenComboBox = new JComboBox();
				getContentPane().add(landenComboBox);
				landenComboBox.setBounds(119, 35, 126, 21);
				landenComboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						landenComboBoxActionPerformed(evt);
					}
				});
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Code");
				jLabel2.setBounds(322, 42, 35, 14);
			}
			{
				landCodeField = new JTextField();
				getContentPane().add(landCodeField);
				landCodeField.setBounds(427, 35, 63, 21);
				landCodeField.setEditable(false);
				landCodeField.setBackground(new java.awt.Color(128,255,255));
			}
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1);
				jPanel1.setBounds(49, 90, 446, 175);
				jPanel1.setBorder(BorderFactory.createTitledBorder("Nieuwe Luchthaven"));
				jPanel1.setLayout(null);
				{
					jLabel3 = new JLabel();
					jPanel1.add(jLabel3);
					jLabel3.setText("Naam");
					jLabel3.setBounds(42, 42, 35, 14);
				}
				{
					jTextField2 = new JTextField();
					jPanel1.add(jTextField2);
					jTextField2.setText("Amsterdam");
					jTextField2.setBounds(133, 35, 119, 21);
					jTextField2.addFocusListener(new FocusAdapter() {
						public void focusLost(FocusEvent evt) {
							jTextField2FocusLost(evt);
						}
					});
				}
				{
					jLabel4 = new JLabel();
					jPanel1.add(jLabel4);
					jLabel4.setText("Code");
					jLabel4.setBounds(42, 77, 35, 14);
				}
				{
					jTextField3 = new JTextField();
					jPanel1.add(jTextField3);
					jTextField3.setText("ASD");
					jTextField3.setBounds(133, 70, 119, 21);
					jTextField3.addFocusListener(new FocusAdapter() {
						public void focusLost(FocusEvent evt) {
							jTextField3FocusLost(evt);
						}
					});
				}
				{
					jLabel5 = new JLabel();
					jPanel1.add(jLabel5);
					jLabel5.setText("Werkplaats");
					jLabel5.setBounds(42, 112, 70, 14);
				}
				{
					jRadioButton1 = new JRadioButton();
					jPanel1.add(jRadioButton1);
					jRadioButton1.setText("Ja");
					jRadioButton1.setBounds(133, 112, 56, 21);
					jRadioButton1.addFocusListener(new FocusAdapter() {
						public void focusLost(FocusEvent evt) {
							jRadioButtonFocusLost(evt);
						}
					});
					getButtonGroup1().add(jRadioButton1);
				}
				{
					jRadioButton2 = new JRadioButton();
					jPanel1.add(jRadioButton2);
					jRadioButton2.setText("Nee");
					jRadioButton2.setBounds(217, 112, 49, 21);
					jRadioButton2.addFocusListener(new FocusAdapter() {
						public void focusLost(FocusEvent evt) {
							jRadioButtonFocusLost(evt);
						}
					});
					getButtonGroup1().add(jRadioButton2);
				}
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("OK");
				jButton1.setBounds(329, 308, 56, 21);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}
				});
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("Cancel");
				jButton2.setBounds(399, 308, 84, 21);
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
			}
			pack();
			this.setSize(546, 373);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private ButtonGroup getButtonGroup1() {
		if(buttonGroup1 == null) {
			buttonGroup1 = new ButtonGroup();
		}
		return buttonGroup1;
	}
	
	private void postInitGUI() {
		landenComboBox.addItem("");
		for(String s : landNamen) {
			landenComboBox.addItem(s);
		}
	}
	
	private void landenComboBoxActionPerformed(ActionEvent evt) {
		System.out.println("landenComboBox.actionPerformed, event="+evt);
		String s = (String) landenComboBox.getSelectedItem();
		if(!s.equals("")){
			int code = theController.land(s);
			landCodeField.setText(Integer.toString(code));
		}

	}
	
	private void jTextField2FocusLost(FocusEvent evt) {
		System.out.println("jTextField2.focusLost, event="+evt);
		String naam = jTextField2.getText();
		try{
			theController.naam(naam);
			jTextField2.setBackground(Color.white);
			
		}
		catch(IllegalArgumentException e){
			JOptionPane.showMessageDialog(this, e.getMessage(), "Fout",JOptionPane.ERROR_MESSAGE);
			jTextField2.setBackground(Color.red);
			
		}
	}
	
	private void jTextField3FocusLost(FocusEvent evt) {
		System.out.println("jTextField3.focusLost, event="+evt);
		String s = jTextField3.getText();
		theController.code(s);
	}
	
	private void jRadioButtonFocusLost(FocusEvent evt) {
		System.out.println("jRadioButton2.focusLost, event="+evt);
		if (jRadioButton1.isSelected())
			theController.werkPlaats(true);
		if (jRadioButton2.isSelected())
			theController.werkPlaats(false);
		
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		System.out.println("jButton1.actionPerformed, event="+evt);
		try{
			theController.ok();
			dispose();
		}
		catch(IllegalStateException e){
			JOptionPane.showMessageDialog(this, e.getMessage(), "Fout",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		System.out.println("jButton2.actionPerformed, event="+evt);
		theController.cancel();
		dispose();
	}

}
