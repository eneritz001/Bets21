package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ErregistratuGUI extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	public ErregistratuGUI() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Erregistratu");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(156, 11, 148, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Erabiltzaile izena:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(35, 37, 113, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pasahitza");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(35, 68, 113, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pasahitza berretsi:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(35, 93, 148, 28);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Korreo elektronikoa:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(35, 132, 148, 19);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("NAN:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(35, 164, 46, 14);
		getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(166, 36, 216, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(166, 67, 216, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(166, 99, 216, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(166, 132, 216, 20);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_6 = new JLabel("Jaiotze data:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(222, 164, 102, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Herrialdea:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(35, 196, 83, 14);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Telefono zenbakia:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(222, 196, 125, 14);
		getContentPane().add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(115, 162, 86, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(338, 192, 86, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(115, 191, 97, 22);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(317, 161, 30, 22);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(350, 161, 30, 22);
		getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(383, 161, 30, 22);
		getContentPane().add(comboBox_3);
		
		JButton btnNewButton = new JButton("ERREGISTRATU");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(176, 227, 128, 23);
		getContentPane().add(btnNewButton);
	}
}
