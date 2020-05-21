package PatternStrategyStrategies;

public class StrategyCalcFixedPrice implements StrategyCalculation{

	private final double fixedProfit = 10;
	
	@Override
	public double carcularLucro(double preco) {
		
		return preco + fixedProfit;
	}

}
