import javax.swing.JFrame;

import gerencia.Controle;
import gui.UIJogo;
import gui.UIPrincipal;

public class ProgMain {
	
	public static void main(String[] args) {
		
		try{
		UIPrincipal janela = new UIPrincipal();
		UIJogo jogo = new UIJogo();
		Controle sistema = new Controle() ;
		
		
		
		sistema.setInterface(janela,jogo);
		
		sistema.start();
		
		}catch(Exception e) {System.err.println(e.getMessage());
		 e.printStackTrace();}
	}
}

