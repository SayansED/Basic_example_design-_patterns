package PatternFactory;

import PatternStrategyStrategies.StrategyCalcFixedPrice;
import PatternStrategyStrategies.StrategyCalcLoss;
import PatternStrategyStrategies.StrategyCalcLucro;
import PatternStrategyStrategies.StrategyCalculation;

public class CalculationFactory {
	
	public static StrategyCalculation criarCalculo(String pTipoCalculo) {
		
		switch(pTipoCalculo) {
			case "FIXO":
				return new StrategyCalcFixedPrice();
			case "LUCRO":
				return new StrategyCalcLucro();
			case "PREJUIZO":
				return new StrategyCalcLoss();
			default:
				return null;
		}
	}
}
