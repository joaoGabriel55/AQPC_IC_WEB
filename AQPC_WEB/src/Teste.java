import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class Teste {

	public static void main(String[] args) {
		//Carrega arquivo fcl
		FIS fis = FIS.load("src/resource/aqpc.fcl", true);
		
		if (fis == null) {
			System.err.println("Can't load file");
			System.exit(1);
		}
//		String cor = JOptionPane.showInputDialog("Qual a quantidade de cores?");
//		String folhosos = JOptionPane.showInputDialog("Quantos alimentos são ricos em enxofre?");
//		String tecnicasCoccao = JOptionPane.showInputDialog("Qual a quantidade de folhosos que existe na preparação?");
//		String enxofre = JOptionPane.showInputDialog("Qual a tecnica de cocção?\n 1 - ");
//		String gordura = JOptionPane.showInputDialog("Qual a porcetagem de gordura da preparação?");
//		String sobremesa = JOptionPane.showInputDialog("Qual o tipo de sobremesa?\n 1- DOCE\n 2 - FRUTA");
				
		
		JTextField texto = new JTextField(20);
		JTextField texto2 = new JTextField(20);
		JTextField texto3 = new JTextField(20);
		JTextField texto4 = new JTextField(20);
		JTextField texto5 = new JTextField(20);
		JTextField texto6 = new JTextField(20);
		
		JButton botao = new JButton("Confimar");
		JFrame janela = new JFrame("Título da janela");
		janela.setBounds(50, 100, 400, 300); // Seta posição e tamanho
		janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		janela.add(new JLabel("Cor:"));
		janela.add(texto);
		janela.add(new JLabel("\n"));
		janela.add(new JLabel("Folhosos:"));
		janela.add(texto2);
		janela.add(new JLabel("Tecnicas de coção:"));
		janela.add(texto3);
		janela.add(new JLabel("Enxofre:"));
		janela.add(texto4);
		janela.add(new JLabel("Gordura:"));
		janela.add(texto5);
		janela.add(new JLabel("Sobremesa:"));
		janela.add(texto6);
		botao.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFuzzyChart.get().chart(fis.getFunctionBlock("aqpc"));
				
				String cor = texto.getText();
				String folhosos = texto2.getText();
				String tecnicasCoccao = texto3.getText();
				String enxofre = texto4.getText();
				String gordura = texto5.getText();
				String sobremesa = texto6.getText();
				
				fis.setVariable("cor", Double.valueOf(cor));
		        fis.setVariable("folhosos", Double.valueOf(folhosos));
		        fis.setVariable("tecnicasCoccao", Double.valueOf(tecnicasCoccao));
		        fis.setVariable("enxofre", Double.valueOf(enxofre));
		        fis.setVariable("gordura", Double.valueOf(gordura));
		        fis.setVariable("sobremesa", Double.valueOf(sobremesa));
		        
		        fis.evaluate();

		        Variable aqpc = fis.getFunctionBlock("aqpc").getVariable("avaliacao");
		        JFuzzyChart.get().chart(aqpc, aqpc.getDefuzzifier(), true);
				
			}
		});
		janela.add(botao);
		janela.setVisible(true);	
	
		FlowLayout  flow  =  new  FlowLayout();
		Container caixa = janela.getContentPane();
		caixa.setLayout(flow);  
	}
}
