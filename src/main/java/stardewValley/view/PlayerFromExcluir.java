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
import java.awt.Color;

public class PlayerFromExcluir extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCoisaFavorita;
	private JTextField textFazenda;
	private EntityManagerFactory emf=
	Persistence.createEntityManagerFactory("stardewPU");
	private EntityManager em = emf.createEntityManager();
	private Player player;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerFromExcluir frame = new PlayerFromExcluir();
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
	public PlayerFromExcluir() {
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 14, 46, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(111, 11, 342, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCoisaFavorita = new JLabel("Coisa Favorita:");
		lblCoisaFavorita.setBounds(10, 42, 85, 14);
		contentPane.add(lblCoisaFavorita);
		
		textCoisaFavorita = new JTextField();
		textCoisaFavorita.setEditable(false);
		textCoisaFavorita.setEnabled(false);
		textCoisaFavorita.setBounds(111, 39, 342, 20);
		contentPane.add(textCoisaFavorita);
		textCoisaFavorita.setColumns(10);
		
		JLabel lblFazenda = new JLabel("Fazenda:");
		lblFazenda.setBounds(10, 67, 85, 14);
		contentPane.add(lblFazenda);
		
		textFazenda = new JTextField();
		textFazenda.setEnabled(false);
		textFazenda.setEditable(false);
		textFazenda.setBounds(111, 64, 342, 20);
		contentPane.add(textFazenda);
		textFazenda.setColumns(10);
		
		final JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player = em.find(Player.class, textNome.getText());
				if(player != null) {
				//player.setName(textNome.getText());
				em.getTransaction().begin();
				em.remove(player);
				em.getTransaction().commit();
				}else {
					JOptionPane.showMessageDialog(null, "Player não existe");
				}
			}
		});
		btnExcluir.setBounds(318, 95, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player=em.find(Player.class, textNome.getText());
				if(player!=null) {
					textNome.setText(player.getName());
					
					btnExcluir.setEnabled(true);
				}else {
					JOptionPane.showMessageDialog(null, "Player não existe");
				}
				
			}
		});
		btnBuscar.setBounds(143, 95, 89, 23);
		contentPane.add(btnBuscar);
	}
}
