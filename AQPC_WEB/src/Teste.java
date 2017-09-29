import model.Preparacao.TecnicaCoccao;
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
		
		// Mostra todas as varivais linguisticas em grafico
        JFuzzyChart.get().chart(fis.getFunctionBlock("aqpc"));
		
	    //Seta as entradas para cada variavel linguistica
        fis.setVariable("cor", 2);
        fis.setVariable("folhosos", 2);
        fis.setVariable("tecnicasCoccao", 10);
        fis.setVariable("enxofre", 5);
        fis.setVariable("gordura", 35);
        fis.setVariable("sobremesa", 2);
	    
	    //Avalia as regras
	    fis.evaluate();

	    //Mostra saída em grafico
        Variable aqpc = fis.getFunctionBlock("aqpc").getVariable("avaliacao");
        JFuzzyChart.get().chart(aqpc, aqpc.getDefuzzifier(), true);

	}

}
