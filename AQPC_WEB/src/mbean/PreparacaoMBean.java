package mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Preparacao;
import model.Preparacao.Textura;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

@ManagedBean
@SessionScoped
public class PreparacaoMBean {

	private Preparacao preparacao;
	
	public Textura[] getLabelTexturas() {
		return Textura.values();
	}
	
	
	public PreparacaoMBean() {
	}

	public void calculaFuzzy() {
		FIS fis = FIS.load("src/resource/aqpc.fcl", true);

		if (fis == null) {
			System.err.println("Can't load file");
			System.exit(1);
		}

		// Mostra todas as varivais linguisticas em grafico
		JFuzzyChart.get().chart(fis.getFunctionBlock("aqpc"));

		// Seta as entradas para cada variavel linguistica
		// fis.setVariable("experiencia", 2);
		// fis.setVariable("responsabilidade", 0.65);
		// fis.setVariable("digestibilidadeRacao", 0.7);
		// fis.setVariable("qualidadeAgua", 0.7);

		// Avalia as regras
		fis.evaluate();

		// Mostra saída em grafico
		Variable aqpc = fis.getFunctionBlock("aqpc").getVariable("avaliacao");
		JFuzzyChart.get().chart(aqpc, aqpc.getDefuzzifier(), true);
	}

	public PreparacaoMBean(Preparacao preparacao) {
		super();
		this.preparacao = preparacao;
	}

	public Preparacao getPreparacao() {
		return preparacao;
	}

	public void setPreparacao(Preparacao preparacao) {
		this.preparacao = preparacao;
	}

}
