package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import gerencia.Controle;

@SuppressWarnings("serial")
public class UIPrincipal extends JFrame {
	
	public static final int MENU = 0;
	public static final int JOGO= 1; 
	public static final int RECORD = 2;
	public static final int INSTRUCAO = 3;
	public static final int SAIR = 4;

	
	public JPanel painelDeConteudo = null;
	public JLabel lbTextoLogo = null;
	public JButton btnIniciar = null;
	public JButton btnInstrucao = null;
	public JButton btnRecord = null;
	private JButton btnSair = null;
	

	
	public UIPrincipal() {

		this.setContentPane(getPainelDeConteudo());
			

		//IMAGEM DE FUNDO\\
	ImageIcon img = new ImageIcon(getClass().getResource("../imagens/iconRecicla.png"));
	JLabel lbImg = new JLabel(img);
	lbImg.setBounds(100,50,500,500);
	img.setImage(img.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(),1));	// redimenciona a imagem
	getContentPane().add(lbImg);

	}
	public JPanel getPainelDeConteudo() {
		if( painelDeConteudo == null) {
			painelDeConteudo = new JPanel();
			painelDeConteudo.setLayout(new BorderLayout());
			painelDeConteudo.add(getBtnIniciar(), null);
			painelDeConteudo.add(getBtnInstrucao(),null);
			painelDeConteudo.add(getBtnRecord(),null);
			painelDeConteudo.add(getLogo(),null);
			painelDeConteudo.add(getBtnSair(),null);
		}
		return painelDeConteudo;
	}
	
		public JLabel getLogo() {
				if(lbTextoLogo == null) {
			lbTextoLogo = new JLabel("<html>AVENTURA<br> ECOLÓGICA</html>");
			lbTextoLogo.setForeground(Color.DARK_GRAY);
			lbTextoLogo.setBounds(150,100,900,200);
			//lbTextoLogo.setHorizontalTextPosition(SwingConstants.CENTER);//centraliza a JLabel???
					
			lbTextoLogo.setFont(new Font("Algerian", Font.BOLD,60));
			
			}
			return lbTextoLogo;
			
		}
		public JButton getBtnIniciar() {
			ImageIcon image = new ImageIcon(getClass().getResource("../imagens/iconePlay.png"));
			if (btnIniciar == null) {
				btnIniciar = new JButton();
				btnIniciar.setBounds(50,440,50,50);
				btnIniciar.setIcon(image);
				
				btnIniciar.setOpaque(false);
				btnIniciar.setContentAreaFilled(false);
				//btnIniciar.setBorderPainted(false);
			}
			btnIniciar.setActionCommand("mIniciar");
			return btnIniciar;
			
		}
		public JButton getBtnRecord() {
			ImageIcon image = new ImageIcon(getClass().getResource("../imagens/iconeRecord.png"));
			if(btnRecord == null) {
				btnRecord = new JButton();
				btnRecord.setBounds(270, 440, 50, 50);
				btnRecord.setIcon(image);
				btnRecord.setBorder(null);
				btnRecord.setOpaque(false);
				btnRecord.setContentAreaFilled(false);
			
			}
			btnRecord.setActionCommand("mRecord");
			return btnRecord;
		}
		
		public JButton getBtnInstrucao() {
			ImageIcon image = new ImageIcon(getClass().getResource("../imagens/iconeAjuda.png"));
			if(btnInstrucao == null) {
				btnInstrucao = new JButton();
				btnInstrucao.setBounds(500, 440, 50, 50);
				btnInstrucao.setIcon(image);
				btnInstrucao.setBorder(null);
				btnInstrucao.setOpaque(false);
				btnInstrucao.setContentAreaFilled(false);
				
			}
			btnInstrucao.setActionCommand("mInstrucao");
			return btnInstrucao;
		}
		public JButton getBtnSair() {
			ImageIcon image = new ImageIcon(getClass().getResource("../imagens/iconeFechar.png"));
			if(btnSair == null) {
				btnSair = new JButton();
				btnSair.setBounds(540, 20, 50, 50);	
				btnSair.setIcon(image);
				btnSair.setBorder(null);
				btnSair.setOpaque(false);
				btnSair.setContentAreaFilled(false);
				
			}
			btnSair.setActionCommand("mSair");
			return btnSair;
		}

		
			
	public void configurarTela(int modoDeTela) {

		getContentPane().removeAll();
		switch (modoDeTela) {
		case MENU:

			painelDeConteudo = null ;
			break;
		
		case JOGO:
			
			UIJogo jogar =  new UIJogo();
			
			
			//jogar.telaDoJogo();
			

//			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
//			jogar.setSize(d);
//			jogar.setResizable(false);
//			jogar.setAlwaysOnTop(true);

			
			
			
			
						
			break;
		case RECORD:
			
				painelDeConteudo = new UIPontuacao();
			break;
			
		case INSTRUCAO:
				
				painelDeConteudo = new UIInstrucao();
			break;
		case SAIR:
			
			System.exit(0);
			
		break;
		
		default:
		
				painelDeConteudo = null;
			break;
		}
	
		if (painelDeConteudo != null) 
			setContentPane(painelDeConteudo);
		
	getContentPane().validate();
	getContentPane().repaint();
	}
	
	public void setActionListener(ActionListener listener) {
		
		btnInstrucao.addActionListener(listener);
		btnIniciar.addActionListener(listener);
		btnRecord.addActionListener(listener);
		btnSair.addActionListener(listener);
		
	}
	
}
