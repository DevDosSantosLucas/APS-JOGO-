package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import gerencia.Controle;
import gerencia.ControleImg;

@SuppressWarnings("serial")
public class UIJogo extends JFrame  {
	
	public static final int MENU = 0;
	public static final int REINICIAR= 1; 
	public static final int PAUSAR= 2;
	public static final int FECHAR = 3;
	
	public static final int FACIL = 4;
	public static final int MEDIO = 5;
	public static final int DIFICIL = 6;
	
	

	
	private JLabel 	lbImgLixo,lbImgLixo2;
	private JLabel lbModo = null,
					lbObjeto= null;
	private JPanel painelJogo =  null;
	private JButton btnMenu,
					btnFacil=null,
					btnMedio=null,
					btnDificil=null;
					
	private JMenu menu, mnReiniciar,mnPausar,mnRecords,
					imgDeRecord,mnErros,imgDeErros,mnSom,mnFechar;
	
	
	
	
	public UIJogo() {
	
		this.setContentPane(getPainelDeConteudo());
		//this.setContentPane(getPainelDoJogoFacil());
		getContentPane().setLayout(null);
			//IMAGEM DE FUNDO\\
	ImageIcon img = new ImageIcon(getClass().getResource("../imagens/fundoRua2.JPG"));
	JLabel lbImg = new JLabel(img);
	lbImg.setBounds(1,1,999,650);
	img.setImage(img.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(),1));	// redimenciona a imagem
	getContentPane().add(lbImg);
	
	
			//MENU\\
		ImageIcon imgMenu = new ImageIcon(getClass().getResource("../imagens/iconeDeMenu.png"));
		ImageIcon imgReiniciar = new ImageIcon(getClass().getResource("../imagens/iconeReiniciar.png"));
		ImageIcon imgPausar = new ImageIcon(getClass().getResource("../imagens/iconePause.png"));
		ImageIcon imgRecord = new ImageIcon(getClass().getResource("../imagens/iconeRecord.png"));
		ImageIcon imgErrou = new ImageIcon(getClass().getResource("../imagens/iconeDeslike.png"));
		ImageIcon imgFechar = new ImageIcon(getClass().getResource("../imagens/iconeFechar.png"));
		ImageIcon imgSom = new ImageIcon(getClass().getResource("../imagens/iconeSom.png"));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menu = new JMenu();
		menu.setIcon(imgMenu);
		menu.setActionCommand("mMenu");
		menuBar.add(menu);
		
		mnReiniciar = new JMenu();
		mnReiniciar.setIcon(imgReiniciar);
		mnReiniciar.setActionCommand("mReiniciar");
		menuBar.add(mnReiniciar);
		
		mnPausar = new JMenu();
		mnPausar.setIcon(imgPausar);
		mnPausar.setActionCommand("mPausar");
		menuBar.add(mnPausar);
		
		mnRecords = new JMenu();
		menuBar.add( new JTextField ("0"));
		//(new Font("Arial", Font.BOLD,40) );
		
		imgDeRecord  = new JMenu();
		imgDeRecord.setIcon(imgRecord);
		menuBar.add(imgDeRecord);
		
		mnErros = new JMenu();
		menuBar.add(new JTextField("0"));
				
		imgDeErros = new JMenu();
		imgDeErros.setIcon(imgErrou);
		menuBar.add(imgDeErros);
		
		mnSom = new JMenu();
		mnSom.setIcon(imgSom);
		menuBar.add(mnSom);
		
		mnFechar = new JMenu();
		mnFechar.setIcon(imgFechar);
		mnFechar.setActionCommand("mFechar");
		menuBar.add(mnFechar);
	
		
	
		//ControleImg ctrlImg = new ControleImg();
		
		
	}
		private JPanel getPainelDeConteudo() {
			if( painelJogo == null) {
				painelJogo = new JPanel();
				painelJogo.setLayout(new BorderLayout());
				painelJogo.add(modoJogo(), null);
				painelJogo.add(facil(), null);
				painelJogo.add(medio(), null);
				painelJogo.add(dificil(), null);
				
				
			}
			return painelJogo;
		}
		
		private JLabel modoJogo() {
			if(lbModo == null) {
				lbModo = new JLabel("DIFICULDADE DO JOGO!");
				lbModo.setBounds(25,10,980,100);
				lbModo.setForeground(Color.BLACK);
				lbModo.setFont(new Font("Algerian", Font.ROMAN_BASELINE,90));	
			}
			return lbModo;	
		}
		
		private JButton facil() {
			if (btnFacil ==null) {
				btnFacil = new JButton("FACIL	|	4 LIXOS");
				btnFacil.setBounds(200,100,600,100);
				btnFacil.setForeground(Color.black);
				btnFacil.setFont(new Font("Arial", Font.BOLD,60));
				btnFacil.setActionCommand("mFacil");
			}
			return btnFacil;
		}
		private JButton medio() {
			if (btnMedio ==null) {
				btnMedio = new JButton("MÉDIO	|	6 LIXOS");
				btnMedio.setBounds(200,300,600,100);
				btnMedio.setForeground(Color.black);
				btnMedio.setFont(new Font("Arial", Font.BOLD,60));
			}
			return btnMedio;
		}
		private JButton dificil() {
			if (btnDificil ==null) {
				btnDificil = new JButton("DIFICIL	|	9 LIXOS");
				btnDificil.setBounds(200,500,600,100);
				btnDificil.setForeground(Color.black);
				btnDificil.setFont(new Font("Arial", Font.BOLD,60));
			}
			return btnDificil;
		}
		
		private JPanel getPainelDoJogoFacil() {
			if( painelJogo == null) {
				painelJogo = new JPanel();
				painelJogo.setLayout(new BorderLayout());
				painelJogo.add(labelLixo(), null);
				painelJogo.add(labelLixo2(), null);
				painelJogo.add(labelObjetos(),null);
				
				
			}
			return painelJogo;
	
		}

		/*
		 * 		LIXOS:
		 */
	public JLabel labelLixo() {
		if(lbImgLixo == null){
			ImageIcon lxOrganico = new ImageIcon(getClass().getResource
					("../imagens/vazado_lixeiras_fechadas- verde.png"));
			lbImgLixo = new JLabel(lxOrganico);
			lbImgLixo.setBounds(250,150,150,250);
			lxOrganico.setImage(lxOrganico.getImage()
					.getScaledInstance(lbImgLixo.getWidth(), lbImgLixo.getHeight(),1));
			}
			return lbImgLixo;
		
		}
	public JLabel labelLixo2() {
		if(lbImgLixo2 == null){
			ImageIcon lxOrganico2 = new ImageIcon(getClass().getResource
					("../imagens/vazado_lixeiras_abertas - verde.png"));
			lbImgLixo2 = new JLabel(lxOrganico2);
			lbImgLixo2.setBounds(400,150,150,250);
			lxOrganico2.setImage(lxOrganico2.getImage()
					.getScaledInstance(lbImgLixo2.getWidth(), lbImgLixo2.getHeight(),1));
			}
			return lbImgLixo2;
		
		}
	
	/*
	 * 		//JLabels RANDOMICAS
	 */
	public JLabel labelObjetos()  {
		
		if(lbObjeto == null) {
			ImageIcon imgObjeto = new ImageIcon(getClass().getResource
					("../imagens/Imagens-obj-lixos/img-organico/maça.gif"));
			lbObjeto = new JLabel(imgObjeto);
			for(int i = 0; i<=1100;i++) {
			
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
				
				
			lbObjeto.setBounds(0,500,100,100);
			}
			imgObjeto.setImage(imgObjeto.getImage()
					.getScaledInstance(lbObjeto.getWidth(), lbObjeto.getHeight(),1));
			
		}
		return lbObjeto;
	}
	
	public void configurarTela(int modoDeTela) {

		removeAll();
		switch (modoDeTela) {
		case MENU:

			UIPrincipal menu = new UIPrincipal() ;
			break;
		
		case REINICIAR:
			
			UIJogo jogar =  new UIJogo();
						
			break;
		case PAUSAR:
			
				/*
				 * tentar colocar o JOptionPane 
				 *  lembrando q tem que parar todos os movimentos
				 */
			break;
			
		case FECHAR:
				System.exit(0);
			break;
		case FACIL:
				this.setContentPane(getPainelDoJogoFacil());
			break;
			
		
		
		}
	
		if (painelJogo != null) 
			setContentPane(painelJogo);
		
		getContentPane().validate();
		getContentPane().repaint();
	}

		

	public void setMouseListener(MouseListener listener) {
		menu.addMouseListener(listener);
		mnReiniciar.addMouseListener(listener);
		mnPausar.addMouseListener(listener);
		mnRecords.addMouseListener(listener);
		mnErros.addMouseListener(listener);
		mnFechar.addMouseListener(listener);
		
		btnFacil.addMouseListener(listener);
		btnMedio.addMouseListener(listener);
		btnDificil.addMouseListener(listener);
		
		
		
	
	}

}