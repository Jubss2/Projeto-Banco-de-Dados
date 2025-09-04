package stardewValley.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import stardewValley.Player;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PlayerFormInsere extends JFrame {

	private EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("stardewPU");
	private EntityManager em = emf.createEntityManager();

	private Player player;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldCoisaFavorita;
	private JTextField textFieldFazenda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerFormInsere frame = new PlayerFormInsere();
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
	public PlayerFormInsere() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 23, 46, 14);
		contentPane.add(lblNome);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(166, 20, 362, 20);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblCoisaFavorita = new JLabel("Coisa Favorita:");
		lblCoisaFavorita.setBounds(10, 54, 130, 14);
		contentPane.add(lblCoisaFavorita);
		
		textFieldCoisaFavorita = new JTextField();
		textFieldCoisaFavorita.setBounds(166, 51, 362, 20);
		contentPane.add(textFieldCoisaFavorita);
		textFieldCoisaFavorita.setColumns(10);
		
		JLabel lblFazenda = new JLabel("Fazenda:");
		lblFazenda.setBounds(10, 85, 130, 14);
		contentPane.add(lblFazenda);
		
		textFieldFazenda = new JTextField();
		textFieldFazenda.setBounds(166, 82, 362, 20);
		contentPane.add(textFieldFazenda);
		textFieldFazenda.setColumns(10);
		
		JButton btnInsere = new JButton("Inserir");
		btnInsere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				em.getTransaction().begin();
				player=new Player();				
				player.setName(textFieldName.getText());
				player.setFavoriteThing(textFieldCoisaFavorita.getText());
				player.setFarmName(textFieldFazenda.getText());	
				em.persist(player);
				em.getTransaction().commit();
			}
		});
		btnInsere.setBounds(228, 114, 89, 23);
		contentPane.add(btnInsere);
	}
}
