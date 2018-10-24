package gerencia;

import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class ControleImg {
	private JLabel lbLixo;
	private JLabel lbImgLixo;
	public ControleImg(){
		labelLixo();
	
	
	ImageIcon img = new ImageIcon(getClass().getResource
			("../imagens/Imagens-obj-lixos/img-organico/maça.png"));
	}
	public JLabel labelLixo() {
	ImageIcon lxOrganico = new ImageIcon(getClass().getResource
			("../imagens/vazado_lixeiras_fechadas- verde.png"));
	lbLixo = new JLabel("Organico");
	
	lbImgLixo = new JLabel(lxOrganico);
	lbImgLixo.setBounds(1,1,100,300);
	return lbImgLixo;
	}
}
