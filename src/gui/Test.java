package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField txtLilyyyyyy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 289, 102);
		contentPane.add(panel);
		
		txtLilyyyyyy = new JTextField();
		txtLilyyyyyy.setText("Lilyyyyyy");
		txtLilyyyyyy.setBounds(55, 149, 86, 20);
		contentPane.add(txtLilyyyyyy);
		txtLilyyyyyy.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\RedStar\\Documents\\USIL\\Programación orientada a objetos I\\proyecto-final\\img\\logo.png"));
		lblNewLabel.setBounds(191, 152, 46, 14);
		contentPane.add(lblNewLabel);
	}
}
