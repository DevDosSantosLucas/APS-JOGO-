package gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class UIInstrucao extends JPanel{
	
	private JPanel painelInstrucao = null;
	private JLabel lbInstrucao = null;
	private JButton btnVoltar = null;
	//protected JFrame instrucao = null;
	

	public UIInstrucao() {
		

		getPainelInstrucao();
		
		
		
	}
	
	private void setContentPane(JPanel painelInstrucao2) {
		// TODO Auto-generated method stub
		
	}

	private JPanel getPainelInstrucao() {
		if(painelInstrucao == null) {
			painelInstrucao = new JPanel();
			painelInstrucao.setLayout(new BorderLayout());
			painelInstrucao.add(getTexto(),null);
			painelInstrucao.add(getVoltar(),null);
			
		}
		return painelInstrucao;
	}

	private JButton getVoltar() {
		if(btnVoltar ==	null) {
			btnVoltar = new JButton();
			btnVoltar.setBounds(10,500,150,50);
		}
		btnVoltar.setActionCommand("mVoltar");
		return btnVoltar;
	}

	private JLabel getTexto() {
		
		if(lbInstrucao == null) {
			lbInstrucao = new JLabel("	Lorem ipsum sapien inceptos orci elit eget venenatis eget,"
			+"\n rhoncus habitasse pellentesque ultricies eget elit ultrices donec tellus,"
			+"\n nostra aenean nam eleifend lacinia velit non. lorem tempus justo blandit "
			+"\n orci feugiat est vel venenatis metus sapien ad, orci scelerisque non nostra"
			+"\n risus odio consectetur torquent auctor. ornare potenti fringilla litora"
			+"\n risus quis amet dictum aliquam, nostra mollis tempus eleifend tempor placerat"
			+"\n ad faucibus, posuere duis potenti quisque sociosqu curabitur non.");
			lbInstrucao.setBounds(50,30,500,500);
			}
		return lbInstrucao;
		
	}
	public void configurarTela(int modo) {
//		getRootPane().removeAll();
//		if (modo.equals(getVoltar()) {
//		
//			painelInstrucao = new UIPrincipal();
//		
	}

	public void setActionListener(ActionListener listener) {
		btnVoltar.addActionListener(listener);
		
	}
}

		
//		GridBagLayout gridBagLayout = new GridBagLayout();		//===>TIPO DE LAYOUT PARA O PAINEL
//		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
//		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
//		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
//		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		setLayout(gridBagLayout);
//		
//		JLabel lbInstrucao = new JLabel("	Lorem ipsum condimentum proin leo augue quisque nibh,\n"
//				+ " nostra lacinia sapien nibh viverra senectus euismod mattis, \n"
//				+ "placerat dictum senectus a neque tristique. nec libero lectus \n"
//				+ "placerat mi lorem phasellus eros, eget rhoncus pretium dictumst\n"
//				+ " mattis eros quisque, feugiat suscipit porttitor\n"
//				+ " curabitur mi nam. porttitor ante fusce laoreet \n"
//				+ "vivamus quisque gravida litora, rhoncus potenti nam \n"
//				+ "consectetur nullam rutrum sem, lectus mauris condimentum \n"
//				+ "tristique etiam ultricies. rutrum tempor fames dolor\n"
//				+ " quisque curabitur consequat scelerisque malesuada\n"
//				+ " senectus egestas eu cursus conubia eget tempus,\n"
//				+ " iaculis hendrerit felis eleifend sapien"
//				+ "\n ante arcu velit dui ipsum vitae mi nec lacinia. ");
//		GridBagConstraints gbc_lblRa = new GridBagConstraints();	//===>OUTRO NOME NO LAYOUT
//		gbc_lblRa.anchor = GridBagConstraints.EAST;
//		gbc_lblRa.insets = new Insets(0, 0, 5, 5);
//		gbc_lblRa.gridx = 1;
//		gbc_lblRa.gridy = 1;
//		add(lbInstrucao, gbc_lblRa);
//	}
//}