import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectJob extends JFrame {

	private JPanel contentPane;
	private String pathImg;
	private Novice novice;
	public SelectJob(String title,String name,String Sex) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelect = new JLabel("Select Your Job");
		lblSelect.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelect.setBounds(354, 46, 116, 16);
		contentPane.add(lblSelect);
		
		JButton btnSW = new JButton("New button");
		btnSW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Sex.equals("Female")) {
					pathImg="C:\\Users\\YOT-ANAN TIAOSAKUN\\eclipse-workspace\\Assignment-GUI\\img\\SwordmanF.png";
				}
				else {
					pathImg="C:\\Users\\YOT-ANAN TIAOSAKUN\\eclipse-workspace\\Assignment-GUI\\img\\SwordmanM.png";	
				}
				novice = new Novice(name,"Swordman");
				MainRO mainRO = new MainRO("Main Menu", novice,pathImg);
				mainRO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mainRO.setSize(800,600);
				mainRO.setVisible(true);
				dispose();
			
			}
		});
		if(Sex.equals("Female")) {
			btnSW.setIcon(new ImageIcon("D:\\karn_work\\java\\Assignment-GUI\\img\\SwordmanF.png"));
		}
		else {
			btnSW.setIcon(new ImageIcon("D:\\karn_work\\java\\Assignment-GUI\\img\\SwordmanM.png"));	
		}
		btnSW.setBounds(93, 102, 282, 391);
		contentPane.add(btnSW);
		
		JButton btnMG = new JButton("New button");
		btnMG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Sex.equals("Female")) {
					pathImg="D:\\karn_work\\java\\Assignment-GUI\\img\\MagicianF.png";
				}
				else {
					pathImg="D:\\karn_work\\java\\Assignment-GUI\\img\\MagicianM.png";
				}
				novice = new Novice(name,"Magician");
				MainRO mainRO = new MainRO("Main Menu", novice,pathImg);
				mainRO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mainRO.setSize(800,600);
				mainRO.setVisible(true);
				dispose();
			
			}
		});
		if(Sex.equals("Female")) {
			btnMG.setIcon(new ImageIcon("D:\\karn_work\\java\\Assignment-GUI\\img\\MagicianF.png"));
		}
		
		else {
			btnMG.setIcon(new ImageIcon("D:\\karn_work\\java\\Assignment-GUI\\img\\MagicianM.png"));
		}
		btnMG.setBounds(441, 102, 282, 391);
		contentPane.add(btnMG);
		
		JLabel lblSwordman = new JLabel("Swordman");
		lblSwordman.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSwordman.setBounds(195, 517, 81, 16);
		contentPane.add(lblSwordman);
		
		JLabel lblNewLabel = new JLabel("Magician");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(562, 517, 67, 16);
		contentPane.add(lblNewLabel);
	}

}
