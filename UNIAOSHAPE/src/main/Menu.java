package main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Menu extends JFrame {

	private ImageIcon iconeLogo;
	private Image logoRedim;
	private String localLogo = "images/logo_pequena.png";
	private static final long serialVersionUID = 1L;

	public Menu() {
		this.setSize(800, 600);
		this.setTitle("Uniao Shape");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.getContentPane().setBackground(new Color(20, 20, 20));
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 7, 20));
		
		// barra de menu
        JMenu arq = new JMenu("Arquivo");
        JMenuItem gradeAulas = new JMenuItem("Grade de Aulas");
        JMenuItem matricula = new JMenuItem("Matrícula");
        JMenuItem assinatura = new JMenuItem("Assinatura");
        JMenuItem fechar = new JMenuItem("Fechar");
        
        JMenu cadast = new JMenu("Cadastrar");        
        JMenuItem aluno = new JMenuItem("Aluno");
        JMenuItem funcionario = new JMenuItem("Funcionário");
        
        JMenu catraca = new JMenu("Abrir Catraca");
        JMenu logoff = new JMenu("Logoff");
        
        
        arq.add(gradeAulas);
        arq.add(matricula);
        arq.add(assinatura);
        arq.add(fechar);
        cadast.add(aluno);
        cadast.add(funcionario);
        JMenuBar barraMenu = new JMenuBar();
        this.setJMenuBar(barraMenu);
        barraMenu.add(arq);
        barraMenu.add(cadast); 
        barraMenu.add(catraca); 
        barraMenu.add(logoff);
        barraMenu.setVisible(false);
        
        

	    JPanel painel = new JPanel();
		painel.setPreferredSize(new Dimension(560, 970));
		painel.setBackground(new Color(20, 20, 20));
		painel.setLayout(null);

        iconeLogo = new ImageIcon(localLogo);
        logoRedim = iconeLogo.getImage().getScaledInstance(500, 211, Image.SCALE_SMOOTH);
        iconeLogo = new ImageIcon(logoRedim);
        JLabel lbLogo = new JLabel();
        lbLogo.setIcon(iconeLogo);
        lbLogo.setBounds(40, 30, 500, 211);
        painel.add(lbLogo);

		JLabel lbTituloLogin = new JLabel("Login");
		lbTituloLogin.setFont(new Font("Century Gothic", Font.BOLD, 24));
		lbTituloLogin.setBounds(260, 240, 100, 30);
		lbTituloLogin.setForeground(Color.WHITE);
		painel.add(lbTituloLogin);
		
	    JLabel lbUsuario = new JLabel("Usuário:");
	    lbUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 18));
	    lbUsuario.setBounds(130, 280, 100, 25);
	    lbUsuario.setForeground(Color.WHITE);
	    painel.add(lbUsuario);
		
		JTextField txUsuario = new JTextField();
		txUsuario.setBounds(205, 280, 180, 25);
		painel.add(txUsuario);
		   
		   
		JLabel lbSenha = new JLabel("Senha:");
		lbSenha.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lbSenha.setBounds(130, 320, 100, 25);
		lbSenha.setForeground(Color.WHITE);
		painel.add(lbSenha);
		
		JPasswordField txSenha = new JPasswordField();
		txSenha.setBounds(205, 320, 180, 25);
		painel.add(txSenha);
		
		JButton btnEntrar = new JButton("Entrar");		
		btnEntrar.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnEntrar.setBackground(new Color(210, 0, 58));
		btnEntrar.setBorder(null);
		btnEntrar.setForeground(Color.WHITE);
		btnEntrar.setBounds(230, 360, 100, 30);
		painel.add(btnEntrar);


		JLabel lbTitulo = new JLabel();
		lbTitulo.setFont(new Font("Century Gothic", Font.BOLD, 28));
		lbTitulo.setForeground(Color.WHITE);
		lbTitulo.setBounds(0, 0, 400, 30);
		lbTitulo.setVisible(false);
		this.add(lbTitulo);
		
		
        catraca.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "A catraca foi liberada.");
            }
        });
        
        gradeAulas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AbaGradeAulas aba = new AbaGradeAulas();
				aba.setVisible(true);
			}
        });
        
        matricula.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AbaMatricula aba = new AbaMatricula();
				aba.setVisible(true);
			}        	
        });
        
        assinatura.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AbaAssinatura aba = new AbaAssinatura();
				aba.setVisible(true);
			}
        });
		
		aluno.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AbaFrmAluno aba = new AbaFrmAluno();
				aba.setVisible(true);
			}
			
		});
		
		funcionario.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AbaFrmFuncionario aba = new AbaFrmFuncionario();
				aba.setVisible(true);
			}
			
		});
		
		fechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
        });
		
        logoff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {            	
            	int res = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair da sua conta?");
            	
            	if(res == 0) {            		
            		barraMenu.setVisible(false);
            		painel.setVisible(true);
            		lbTitulo.setVisible(false);
            	}
            }
        });
        
        btnEntrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				barraMenu.setVisible(true);
				painel.setVisible(false);
				lbTitulo.setText("Bem-vindo de volta, " + txUsuario.getText() + "!");
				lbTitulo.setVisible(true);
			}
        });
        
        this.add(painel);
        this.setVisible(true);
	}
	
}
