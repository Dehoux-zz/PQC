package userInterfaceLaag;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
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

import domeinLaag.Luchthaven;


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
public class BoekvluchtFrame extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JLabel jLabel1;
	private JPanel jPanel2;
	private JButton jButton2;
	private JButton jButton1;
	private ButtonGroup buttonGroup1;
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton1;
	private JTextField jTextField5;
	private JLabel jLabel10;
	private JTextField jTextField4;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JLabel jLabel9;
	private JTextField jTextField1;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JLabel jLabel5;
	private JComboBox jComboBox3;
	private JComboBox jComboBox2;
	private JComboBox jComboBox1;
	private JLabel jLabel4;
	private JLabel jLabel3;
	private JLabel jLabel2;
	
	//added bij j.zuurbier
	private Set<String> luchthavenNamen;
	private BoekvluchtContr controller;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				BoekvluchtFrame inst = new BoekvluchtFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public BoekvluchtFrame() {
		super();
		initGUI();
	}
		
	public BoekvluchtFrame(Set<String> luchthavenNamen, BoekvluchtContr controller) {
		super();
		this.luchthavenNamen = luchthavenNamen;
		this.controller = controller;
		initGUI();
		postInitGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Boek Vlucht");
			getContentPane().setLayout(null);
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1);
				jPanel1.setBounds(51, 21, 565, 227);
				jPanel1.setBorder(BorderFactory.createTitledBorder("vlucht"));
				jPanel1.setLayout(null);
				jPanel1.setBackground(new java.awt.Color(212,208,200));
				jPanel1.setEnabled(false);
				jPanel1.setOpaque(false);
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("vertrekpunt");
					jLabel1.setBounds(54, 44, 78, 18);
				}
				{
					jLabel2 = new JLabel();
					jPanel1.add(jLabel2);
					jLabel2.setBounds(54, 84, 76, 19);
					jLabel2.setText("bestemming");
				}
				{
					jLabel3 = new JLabel();
					jPanel1.add(jLabel3);
					jLabel3.setBounds(54, 125, 44, 19);
					jLabel3.setText("vertrek");
				}
				{
					jLabel4 = new JLabel();
					jPanel1.add(jLabel4);
					jLabel4.setBounds(54, 173, 61, 19);
					jLabel4.setText("aankomst");
				}
				{
					//ComboBoxModel jComboBox1Model = 
					//	new DefaultComboBoxModel(
					//			new String[] { "Item One", "Item Two" });
					jComboBox1 = new JComboBox();
					jPanel1.add(jComboBox1);
					//jComboBox1.setModel(jComboBox1Model);
					jComboBox1.setBounds(177, 40, 151, 26);
					jComboBox1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jComboBox1ActionPerformed(evt);
						}
					});
				}
				{
					//ComboBoxModel jComboBox2Model = 
					//	new DefaultComboBoxModel(
					//			new String[] { "Item One", "Item Two" });
					jComboBox2 = new JComboBox();
					jPanel1.add(jComboBox2);
					//jComboBox2.setModel(jComboBox2Model);
					jComboBox2.setBounds(177, 80, 151, 26);
					jComboBox2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jComboBox2ActionPerformed(evt);
						}
					});
				}
				{
					//ComboBoxModel jComboBox3Model = 
					//	new DefaultComboBoxModel(
					//			new String[] { "Item One", "Item Two" });
					jComboBox3 = new JComboBox();
					jPanel1.add(jComboBox3);
					//jComboBox3.setModel(jComboBox3Model);
					jComboBox3.setBounds(177, 121, 151, 26);
					jComboBox3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jComboBox3ActionPerformed(evt);
						}
					});
				}
				{
					jLabel5 = new JLabel();
					jPanel1.add(jLabel5);
					jLabel5.setBounds(177, 168, 151, 24);
					jLabel5.setBackground(new java.awt.Color(212,212,212));
					jLabel5.setOpaque(true);
				}
				{
					jLabel6 = new JLabel();
					jPanel1.add(jLabel6);
					jLabel6.setBounds(402, 123, 98, 23);
					jLabel6.setBackground(new java.awt.Color(212,212,212));
					jLabel6.setOpaque(true);
				}
				{
					jLabel7 = new JLabel();
					jPanel1.add(jLabel7);
					jLabel7.setBounds(402, 170, 98, 22);
					jLabel7.setBackground(new java.awt.Color(212,212,212));
					jLabel7.setOpaque(true);
				}
			}
			{
				jPanel2 = new JPanel();
				getContentPane().add(jPanel2);
				jPanel2.setBounds(51, 274, 570, 115);
				jPanel2.setBorder(BorderFactory.createTitledBorder("klant"));
				jPanel2.setLayout(null);
				jPanel2.setEnabled(false);
				{
					jLabel8 = new JLabel();
					jPanel2.add(jLabel8);
					jLabel8.setText("naam");
					jLabel8.setBounds(57, 24, 35, 19);
				}
				{
					jTextField1 = new JTextField();
					jPanel2.add(jTextField1);
					jTextField1.setBounds(151, 20, 151, 26);
					jTextField1.addFocusListener(new FocusAdapter() {
						public void focusLost(FocusEvent evt) {
							jTextField1FocusLost(evt);
						}
					});
				}
				{
					jLabel9 = new JLabel();
					jPanel2.add(jLabel9);
					jLabel9.setBounds(57, 73, 36, 19);
					jLabel9.setText("adres");
				}
				{
					jTextField2 = new JTextField();
					jPanel2.add(jTextField2);
					jTextField2.setBounds(151, 69, 151, 26);
					jTextField2.addFocusListener(new FocusAdapter() {
						public void focusLost(FocusEvent evt) {
							jTextField2FocusLost(evt);
						}
					});
				}
				{
					jTextField3 = new JTextField();
					jPanel2.add(jTextField3);
					jTextField3.setBounds(323, 69, 29, 26);
					jTextField3.addFocusListener(new FocusAdapter() {
						public void focusLost(FocusEvent evt) {
							jTextField3FocusLost(evt);
						}
					});
				}
				{
					jTextField4 = new JTextField();
					jPanel2.add(jTextField4);
					jTextField4.setBounds(370, 69, 156, 26);
					jTextField4.addFocusListener(new FocusAdapter() {
						public void focusLost(FocusEvent evt) {
							jTextField4FocusLost(evt);
						}
					});
				}
			}
			{
				jLabel10 = new JLabel();
				getContentPane().add(jLabel10);
				jLabel10.setBounds(110, 427, 46, 19);
				jLabel10.setText("stoelen");
			}
			{
				jTextField5 = new JTextField();
				getContentPane().add(jTextField5);
				jTextField5.setBounds(202, 420, 46, 26);
				jTextField5.addFocusListener(new FocusAdapter() {
					public void focusLost(FocusEvent evt) {
						jTextField5FocusLost(evt);
					}
				});
			}
			{
				jRadioButton1 = new JRadioButton();
				getContentPane().add(jRadioButton1);
				jRadioButton1.setBounds(282, 422, 79, 23);
				jRadioButton1.setText("roken");
				jRadioButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jRadioButton1ActionPerformed(evt);
					}
				});
				getButtonGroup1().add(jRadioButton1);
			}
			{
				jRadioButton2 = new JRadioButton();
				getContentPane().add(jRadioButton2);
				jRadioButton2.setBounds(383, 422, 116, 23);
				jRadioButton2.setText("niet roken");
				jRadioButton2.setSelected(true);
				jRadioButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jRadioButton2ActionPerformed(evt);
					}
				});
				getButtonGroup1().add(jRadioButton2);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setBounds(361, 497, 63, 26);
				jButton1.setText("OK");
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}
				});
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setBounds(445, 497, 94, 26);
				jButton2.setText("Cancel");
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
			}
			pack();
			this.setSize(657, 597);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void postInitGUI() {
		for(String s : luchthavenNamen){
			jComboBox1.addItem(s);
			jComboBox2.addItem(s);
		}
	
	}
	
	private ButtonGroup getButtonGroup1() {
		if(buttonGroup1 == null) {
			buttonGroup1 = new ButtonGroup();
		}
		return buttonGroup1;
	}
	
	private void jComboBox1ActionPerformed(ActionEvent evt) {
		System.out.println("jComboBox1.actionPerformed, event="+evt);
		//TODO add your code for jComboBox1.actionPerformed
		jComboBox3.removeAllItems();
		String vertrek = (String) jComboBox1.getSelectedItem();
		String bestemming = (String) jComboBox2.getSelectedItem();
		Set<String> tijden = controller.vertrEnBest(vertrek, bestemming);
		for(String s : tijden)
			jComboBox3.addItem(s);
	}
	
	private void jComboBox2ActionPerformed(ActionEvent evt) {
		System.out.println("jComboBox2.actionPerformed, event="+evt);
		//TODO add your code for jComboBox2.actionPerformed
		jComboBox1ActionPerformed(evt);
	}
	
	private void jComboBox3ActionPerformed(ActionEvent evt) {
		System.out.println("jComboBox3.actionPerformed, event="+evt);
		//TODO add your code for jComboBox3.actionPerformed
		String vertrek = (String) jComboBox1.getSelectedItem();
		String bestemming = (String) jComboBox2.getSelectedItem();
		String vertrektijd = (String) jComboBox3.getSelectedItem();
		ArrayList<String> list = controller.vlucht(vertrek, bestemming, vertrektijd);
		jLabel6.setText(list.get(0));
		jLabel5.setText(list.get(1));
		jLabel7.setText(list.get(2));
		
	}
	
	private void jTextField1FocusLost(FocusEvent evt) {
		System.out.println("jTextField1.focusLost, event="+evt);
		//TODO add your code for jTextField1.focusLost
		jTextField4FocusLost(evt);
	}
	
	private void jTextField2FocusLost(FocusEvent evt) {
		System.out.println("jTextField2.focusLost, event="+evt);
		//TODO add your code for jTextField2.focusLost
		jTextField4FocusLost(evt);
	}
	
	private void jTextField3FocusLost(FocusEvent evt) {
		System.out.println("jTextField3.focusLost, event="+evt);
		//TODO add your code for jTextField3.focusLost
		jTextField4FocusLost(evt);
	}
	
	private void jTextField4FocusLost(FocusEvent evt) {
		System.out.println("jTextField4.focusLost, event="+evt);
		//TODO add your code for jTextField4.focusLost
		try{
			String naam = jTextField1.getText();
			String straat = jTextField2.getText();
			int huisnr = Integer.parseInt(jTextField3.getText());
			String plaats = jTextField4.getText();
			controller.klant(naam, straat, huisnr, plaats);
			jTextField3.setBackground(Color.WHITE);
		}
		catch(NumberFormatException e){
			if(jTextField3.getText().trim().length() > 0 && evt.getSource()== jTextField3){
				jTextField3.setBackground(new Color(255, 128, 128));
				JOptionPane.showMessageDialog(this, "ongeldige invoer", "FOUT", JOptionPane.ERROR_MESSAGE, null);	
			}
		}
	}
	
	private void jTextField5FocusLost(FocusEvent evt) {
		System.out.println("jTextField5.focusLost, event="+evt);
		//TODO add your code for jTextField5.focusLost
		try{
			int aantal = Integer.parseInt(jTextField5.getText());
			boolean roken = jRadioButton1.isSelected();
			controller.plaatsen(aantal, roken);
			jTextField5.setBackground(Color.WHITE);
		}
		catch(NumberFormatException e){
			jTextField5.setBackground(new Color(255, 128, 128));
			JOptionPane.showMessageDialog(this, "ongeldige invoer", "FOUT", JOptionPane.ERROR_MESSAGE, null);	
		}
		catch(IllegalArgumentException e){
			jTextField5.setBackground(new Color(255, 128, 128));
			JOptionPane.showMessageDialog(this, e.getMessage(), "FOUT", JOptionPane.ERROR_MESSAGE, null);		
		}
	}
	
	private void jRadioButton1ActionPerformed(ActionEvent evt) {
		System.out.println("jRadioButton1.actionPerformed, event="+evt);
		//TODO add your code for jRadioButton1.actionPerformed
		try{
			int aantal = Integer.parseInt(jTextField5.getText());
			boolean roken = jRadioButton1.isSelected();
			controller.plaatsen(aantal, roken);
			jTextField5.setBackground(Color.WHITE);
		}
		catch(NumberFormatException e){
			jTextField5.setBackground(new Color(255, 128, 128));
			JOptionPane.showMessageDialog(this, "ongeldige invoer", "FOUT", JOptionPane.ERROR_MESSAGE, null);	
		}
		catch(IllegalArgumentException e){
			jTextField5.setBackground(new Color(255, 128, 128));
			JOptionPane.showMessageDialog(this, e.getMessage(), "FOUT", JOptionPane.ERROR_MESSAGE, null);		
		}
	}
	
	private void jRadioButton2ActionPerformed(ActionEvent evt) {
		System.out.println("jRadioButton2.actionPerformed, event="+evt);
		//TODO add your code for jRadioButton2.actionPerformed
		jRadioButton1ActionPerformed(evt);
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		System.out.println("jButton1.actionPerformed, event="+evt);
		controller.bewaar();
		dispose();
		//TODO add your code for jButton1.actionPerformed
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		System.out.println("jButton2.actionPerformed, event="+evt);
		controller.cancel();
		dispose();
	}

}
