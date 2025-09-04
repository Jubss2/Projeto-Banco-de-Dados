package stardewValley.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import stardewValley.Player;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PlayerFormAltera extends JFrame {

	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("stardewPU");
	private EntityManager em = emf.createEntityManager();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCoisaFavorita;
	private JTextField textFieldFazenda;
    private Player player;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerFormAltera frame = new PlayerFormAltera();
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
	public PlayerFormAltera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 24, 46, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(123, 21, 331, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCoisaFavorita = new JLabel("Coisa Favorita:");
		lblCoisaFavorita.setBounds(10, 49, 103, 14);
		contentPane.add(lblCoisaFavorita);
		
		textCoisaFavorita = new JTextField();
		textCoisaFavorita.setBounds(123, 46, 331, 20);
		contentPane.add(textCoisaFavorita);
		textCoisaFavorita.setColumns(10);
		
		JLabel lblFazenda = new JLabel("Fazenda:");
		lblFazenda.setBounds(10, 74, 103, 14);
		contentPane.add(lblFazenda);
		
		textFieldFazenda = new JTextField();
		textFieldFazenda.setEnabled(false);
		textFieldFazenda.setEditable(false);
		textFieldFazenda.setBounds(123, 71, 331, 20);
		contentPane.add(textFieldFazenda);
		textFieldFazenda.setColumns(10);
		
		final JButton btnAltera = new JButton("Altera");
		btnAltera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player = em.find(Player.class, textNome.getText());
				textNome.setEnabled(false);
				player.setFavoriteThing(textCoisaFavorita.getText());
				textCoisaFavorita.setEnabled(true);				
				if(player != null) {
				//player.setName(textNome.getText());	
				em.getTransaction().begin();
				em.persist(player);
				em.getTransaction().commit();
				}else {
					JOptionPane.showMessageDialog(null, "Player não existe");
				}
			}
		});
		btnAltera.setBounds(184, 102, 89, 23);
		contentPane.add(btnAltera);
	}

}
