package gerencia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import gui.UIInstrucao;
import gui.UIJogo;
import gui.UIPrincipal;

public class Controle implements ActionListener ,MouseListener,WindowListener{
	
	private UIPrincipal janela;
	private UIJogo jogo;
	private boolean clicado = false;
	

	public void setInterface(UIPrincipal janela,UIJogo jogo) {
		this.jogo= jogo;
		this.janela = janela;
		janela.setActionListener(this);
		jogo.setMouseListener(this);
		
	}
	
	public void start() {
	
//		janela.setTitle("AVENTURA ECOLÓGICA");
		janela.setSize(600,500);
//		janela.setResizable(false);	//nao maximiza
		janela.setDefaultCloseOperation(UIPrincipal.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setUndecorated(true);		//esconde ( - [] X)
		janela.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
			//BOTÕES DA JANELA MENU
		if(e.getActionCommand().equals("mMenu")) {
			janela.configurarTela(UIPrincipal.MENU);
		}
		else if(e.getActionCommand().equals("mIniciar")) {
				janela.configurarTela(UIPrincipal.JOGO);
				janela.dispose();
				jogo.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				jogo.setUndecorated(true);		//esconde ( - [] X)
				jogo.setSize(1000,700);
				jogo.setResizable(false);
				jogo.setLocationRelativeTo(null);
				jogo.setVisible(true);
				
				
		}
		else if(e.getActionCommand().equals("mRecord")) {
		 	janela.configurarTela(UIPrincipal.RECORD);
		}
		else if(e.getActionCommand().equals("mInstrucao")) {
			janela.configurarTela(UIPrincipal.INSTRUCAO);
		}
		else if(e.getActionCommand().equals("mSair")) {
			janela.configurarTela(UIPrincipal.SAIR);
		}

				
		
		 	//BOTÕES DA JANELA INSTRUÇÃO
//		else if(e.getActionCommand().equals("mVoltar")) {
//			janela.configurarTela(UIInstrucao.getVoltar());
//		}
	}

@Override
public void windowActivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowClosed(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@SuppressWarnings("unlikely-arg-type")
@Override
public void windowClosing(WindowEvent e) {
	
//	jogo.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//	janela.setVisible(true);
	 if(e.getComponent().equals("mFechar")) {
			jogo.configurarTela(UIJogo.FECHAR);
			
		}
	
}

@Override
public void windowDeactivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowDeiconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowIconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowOpened(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@SuppressWarnings("unlikely-arg-type")
@Override
public void mouseClicked(MouseEvent e) {
	 if(e.getComponent().equals("mFechar")) {
		jogo.configurarTela(UIJogo.FECHAR);
		
	}
	 else if(e.getComponent().equals("mFacil")) {
		jogo.configurarTela(UIJogo.FACIL);
		
	}
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
	
}	
		
		
	
