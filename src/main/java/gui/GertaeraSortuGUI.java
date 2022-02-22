package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class GertaeraSortuGUI extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	public GertaeraSortuGUI() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gertaera sortu");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(160, 27, 124, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gertaeraren kodea:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(47, 64, 140, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gertaeraren data:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(47, 108, 124, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Deskribapena:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(47, 151, 124, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(197, 63, 181, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 150, 181, 59);
		getContentPane().add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(197, 106, 30, 22);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(237, 106, 30, 22);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(277, 106, 30, 22);
		getContentPane().add(comboBox_2);
	}

}
