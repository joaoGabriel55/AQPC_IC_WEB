package mbean;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Preparacao;
import model.Sobremesa;
import model.TecnicasCoccao;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

@ManagedBean
@SessionScoped
public class PreparacaoMBean {

	private Preparacao preparacao;
	
	private List<TecnicasCoccao> tipoCoccao;
	private List<Sobremesa> tipoSobre;
		
	public PreparacaoMBean() {
		this.preparacao = new Preparacao();
		this.tipoCoccao = Arrays.asList(TecnicasCoccao.values());
		this.tipoSobre = Arrays.asList(Sobremesa.values());
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
	    fis.setVariable("cor", preparacao.getCor());
        fis.setVariable("folhosos", preparacao.getFolhosos());
        fis.setVariable("tecnicasCoccao", preparacao.getTecnicaCoccao());
        fis.setVariable("enxofre", preparacao.getEnxofre());
        fis.setVariable("gordura", preparacao.getAspectoGorduroso());
        fis.setVariable("sobremesa", preparacao.getSobremesa());

		// Avalia as regras
		fis.evaluate();

		// Mostra saída em grafico
		Variable aqpc = fis.getFunctionBlock("aqpc").getVariable("avaliacao");
		JFuzzyChart.get().chart(aqpc, aqpc.getDefuzzifier(), true);
	}

	public Preparacao getPreparacao() {
		return preparacao;
	}

	public void setPreparacao(Preparacao preparacao) {
		this.preparacao = preparacao;
	}

	public List<TecnicasCoccao> getTipoCoccao() {
		return tipoCoccao;
	}

	public void setTipoCoccao(List<TecnicasCoccao> tipoCoccao) {
		this.tipoCoccao = tipoCoccao;
	}

	public List<Sobremesa> getTipoSobre() {
		return tipoSobre;
	}

	public void setTipoSobre(List<Sobremesa> tipoSobre) {
		this.tipoSobre = tipoSobre;
	}
}
