package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class LoginGUI extends JFrame{
	public LoginGUI() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(189, 22, 65, 41);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Erabiltzaile izena:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(53, 75, 108, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pasahitza:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(53, 129, 108, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(51, 100, 335, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SARTU");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(177, 196, 89, 23);
		getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(53, 154, 335, 20);
		getContentPane().add(textField_2);
	}

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_2;
}
