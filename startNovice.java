import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class startNovice extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					startNovice frame = new startNovice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public startNovice() {
		setTitle("START");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHello = new JLabel("Hello!! ");
		lblHello.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHello.setBounds(273, 30, 56, 16);
		contentPane.add(lblHello);
		
		JLabel lblCreate = new JLabel("Create Character");
		lblCreate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCreate.setBounds(236, 59, 117, 16);
		contentPane.add(lblCreate);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(181, 102, 56, 16);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(237, 100, 116, 22);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSex.setBounds(196, 135, 41, 22);
		contentPane.add(lblSex);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(236, 135, 117, 22);
		contentPane.add(comboBox);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnStart && txtName.getText().length()>0) {
				SelectJob selectJob = new SelectJob("Select Character",txtName.getText(),comboBox.getSelectedItem().toString());
				selectJob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				selectJob.setSize(800,600);
				selectJob.setVisible(true);
				dispose();
				}
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnStart.setBounds(246, 180, 97, 25);
		contentPane.add(btnStart);
	}
}
