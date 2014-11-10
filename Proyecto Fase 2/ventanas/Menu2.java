package ventanas;
import hotelCentroamerica.Menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Menu2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu2 frame = new Menu2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Menu2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 765, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblHotelesDeCentroamerica = new JLabel("Hoteles de CentroAmerica");
		lblHotelesDeCentroamerica.setForeground(Color.WHITE);
		lblHotelesDeCentroamerica.setFont(new Font("Adobe Garamond Pro", Font.ITALIC, 27));
		lblHotelesDeCentroamerica.setBounds(477, 11, 267, 57);
		contentPane.add(lblHotelesDeCentroamerica);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setForeground(Color.WHITE);
		lblBienvenido.setFont(new Font("Adobe Garamond Pro", Font.ITALIC, 28));
		lblBienvenido.setBounds(590, 79, 154, 43);
		contentPane.add(lblBienvenido);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Menu2.class.getResource("/extra/unnamed - copia.jpg")));
		label.setBounds(0, 0, 749, 464);
		contentPane.add(label);
		Timer timer = new Timer (2500, new ActionListener () 
		 { 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Menu menu =new Menu();
				menu.setVisible(true);
				
				
			}

			
		 }); 
		timer.start();
		timer.setRepeats(false);
		
	}
}
