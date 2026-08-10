package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AbaMatricula extends JDialog {

	private static final long serialVersionUID = 1L;
	
	public AbaMatricula(){
		this.setTitle("Matrícula");
	    this.setModal(true);
	    this.setSize(570, 500);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);

	    JPanel painel = new JPanel();
		painel.setPreferredSize(new Dimension(560, 970));
		painel.setBackground(new Color(20, 20, 20));
		painel.setLayout(null);

	    JLabel lbTitulo = new JLabel("Matrícula");
	    lbTitulo.setFont(new Font("Century Gothic", Font.BOLD, 24));
	    lbTitulo.setBounds(220, 30, 300, 25);
	    lbTitulo.setForeground(Color.WHITE);
	    painel.add(lbTitulo);
	    
	    
	    
		

		this.add(painel);
	}
}
