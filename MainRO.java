import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class MainRO extends JFrame {

	private JPanel contentPane;
	public MainRO(String title,Novice novice,String pathImg) {
		super(title);
		setTitle("MAIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCha = new JLabel("Character");
		lblCha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCha.setBounds(148, 28, 72, 16);
		contentPane.add(lblCha);
		
		JButton btnJob = new JButton("New button");
		btnJob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	
		btnJob.setIcon(new ImageIcon(pathImg));;
		btnJob.setBounds(43, 57, 282, 391);
		contentPane.add(btnJob);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(419, 77, 56, 16);
		contentPane.add(lblName);
		
		JLabel lblExp = new JLabel("EXP:");
		lblExp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblExp.setBounds(419, 114, 56, 16);
		contentPane.add(lblExp);
		
		JLabel lblHp = new JLabel("HP:");
		lblHp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHp.setBounds(419, 156, 56, 16);
		contentPane.add(lblHp);
		
		JLabel lblMana = new JLabel("MANA:");
		lblMana.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMana.setBounds(419, 198, 56, 16);
		contentPane.add(lblMana);
		
		JLabel lblNUmber = new JLabel("Number:");
		lblNUmber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNUmber.setBounds(419, 230, 63, 16);
		contentPane.add(lblNUmber);
		
		JLabel lblNameValue = new JLabel("New label");
		lblNameValue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNameValue.setBounds(498, 78, 79, 16);
		lblNameValue.setText(novice.getName());
		contentPane.add(lblNameValue);
		
		JLabel lblExpValue = new JLabel("New label");
		lblExpValue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblExpValue.setBounds(498, 115, 79, 16);
		lblExpValue.setText(""+novice.getExp());
		contentPane.add(lblExpValue);
		
		JLabel lblHpValue = new JLabel("New label");
		lblHpValue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHpValue.setBounds(498, 157, 79, 16);
		lblHpValue.setText(""+novice.getHp());
		contentPane.add(lblHpValue);
		
		JLabel lblManaValue = new JLabel("New label");
		lblManaValue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblManaValue.setBounds(498, 199, 79, 16);
		lblManaValue.setText(""+novice.getMana());
		contentPane.add(lblManaValue);
		
		JLabel lblNumberValue = new JLabel("0");
		lblNumberValue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNumberValue.setBounds(498, 228, 56, 16);
		contentPane.add(lblNumberValue);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hamberger", "Water", "Book"}));
		comboBox.setBounds(378, 319, 107, 22);
		contentPane.add(comboBox);
		
		JButton btnPower = new JButton("Use");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().toString().equals("Hamberger")) {
					novice.increaseHP(novice.useItem("Hamberger"));
					lblHpValue.setText(""+novice.getHp());
				}
				else if(comboBox.getSelectedItem().toString().equals("Water")) {
					novice.increaseMANA(novice.useItem("Water"));
					lblManaValue.setText(""+novice.getMana());
				}
				else if(comboBox.getSelectedItem().toString().equals("Book")) {
					novice.increaseEXP(novice.useItem("Book"));
					lblExpValue.setText(""+novice.getExp());
				}
				
			}
		});
		btnPower.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPower.setBounds(378, 276, 107, 25);
		contentPane.add(btnPower);
		
		JLabel lblExpMonster = new JLabel("EXP:");
		lblExpMonster.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblExpMonster.setBounds(699, 375, 56, 16);
		contentPane.add(lblExpMonster);
		
		JLabel lblMonter = new JLabel("250");
		lblMonter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMonter.setBounds(755, 375, 56, 16);
		contentPane.add(lblMonter);
		
		JLabel lblAttackMonster = new JLabel("ATK:");
		lblAttackMonster.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAttackMonster.setBounds(699, 414, 56, 16);
		contentPane.add(lblAttackMonster);
		
		JLabel lblAttack = new JLabel("200");
		lblAttack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAttack.setBounds(755, 414, 56, 16);
		contentPane.add(lblAttack);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("D:\\karn_work\\java\\Assignment-GUI\\img\\porling.png"));
		btnNewButton.setBounds(559, 375, 107, 95);
		contentPane.add(btnNewButton);
		
		JComboBox cbbMonster = new JComboBox();
		cbbMonster.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(cbbMonster.getSelectedItem().toString().equals("Pupa")) {
					btnNewButton.setIcon(new ImageIcon("D:\\karn_work\\java\\Assignment-GUI\\img\\pupa.png"));
					lblAttack.setText("500");
					lblMonter.setText("300");
					
				}else {
					btnNewButton.setIcon(new ImageIcon("D:\\karn_work\\java\\Assignment-GUI\\img\\porling.png"));
					lblAttack.setText("200");
					lblMonter.setText("250");
				}
			}
		});
		/*cbbMonster.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				if(cbbMonster.getSelectedItem().toString().equals("Pupa")) {
					btnNewButton.setIcon(new ImageIcon("C:\\Users\\YOT-ANAN TIAOSAKUN\\eclipse-workspace\\Assignment-GUI\\img\\pupa.png"));
				}else {
					btnNewButton.setIcon(new ImageIcon("C:\\Users\\YOT-ANAN TIAOSAKUN\\eclipse-workspace\\Assignment-GUI\\img\\porling.png"));
				}
			}
		});*/
		cbbMonster.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbbMonster.setModel(new DefaultComboBoxModel(new String[] {"Porling", "Pupa"}));
		cbbMonster.setBounds(559, 320, 107, 22);
		contentPane.add(cbbMonster);
		
		JButton btnBattle = new JButton("BATTLE");
		btnBattle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(novice.getHp()>0 && novice.getMana()>0) {
				if(cbbMonster.getSelectedItem().toString().equals("Pupa")) {
					novice.decreaseHP(500);
					novice.increaseEXP(300);
					novice.decreaseMANA(200);
					novice.increaseCount();
					
				}else {
					novice.decreaseHP(200);
					novice.increaseEXP(250);
					novice.decreaseMANA(200);
					novice.increaseCount();
				}
				lblExpValue.setText(""+novice.getExp());
				lblHpValue.setText(""+novice.getHp());
				lblManaValue.setText(""+novice.getMana());
				lblNumberValue.setText(""+novice.getCount());
				
				if(novice.getHp()<=0){
					lblHpValue.setText("0");
				}
				if(novice.getMana()<=0) {
					lblManaValue.setText("0");
				}
				}
			}
		});
		btnBattle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBattle.setBounds(559, 277, 107, 25);
		contentPane.add(btnBattle);
		
		
		
		
	}
}
