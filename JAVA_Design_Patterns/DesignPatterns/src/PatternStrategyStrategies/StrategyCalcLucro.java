package PatternStrategyStrategies;

public class StrategyCalcLucro implements StrategyCalculation{
	
	private final int lucro = 2;

	@Override
	public double carcularLucro(double preco) {
		
		
		return preco * lucro;
	}

}
