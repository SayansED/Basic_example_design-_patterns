package PatternStrategyStrategies;

public class StrategyCalcLoss implements StrategyCalculation{

	private final double loss = 50;
	
	@Override
	public double carcularLucro(double preco) {
		
		return preco - loss;
	}

}
