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
//        fis.setVariable("experiencia", 2); 
//	    fis.setVariable("responsabilidade", 0.65);
//	    fis.setVariable("digestibilidadeRacao", 0.7);
//	    fis.setVariable("qualidadeAgua", 0.7);
	    
	    //Avalia as regras
	    fis.evaluate();

	    //Mostra saída em grafico
        Variable aqpc = fis.getFunctionBlock("aqpc").getVariable("avaliacao");
        JFuzzyChart.get().chart(aqpc, aqpc.getDefuzzifier(), true);

	}

}
