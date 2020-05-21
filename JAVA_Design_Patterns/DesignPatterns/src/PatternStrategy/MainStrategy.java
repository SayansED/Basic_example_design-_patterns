package PatternStrategy;

import PatternStrategyStrategies.StrategyCalcLoss;
import PatternStrategyStrategies.StrategyCalcLucro;
import Products.Produto;

public class MainStrategy {
	public static void main(String[] args) {
		
		StrategyCalcLucro strategyCalcLucro = new StrategyCalcLucro();
		
		// Produto 01, com estrategia para calcular lucro, supondo que o lucro sempre seja o dobro do preco (x 2)
		Produto p1 = new Produto("Produto 01", 10, strategyCalcLucro);
		p1.calcularPrecoFinal();
		System.out.println(p1);
		
		// Produto 02, tomando preju
		StrategyCalcLoss strategyCalcLoss = new StrategyCalcLoss();
		Produto p2 = new Produto("Produto 02", 1000, strategyCalcLoss);
		p2.calcularPrecoFinal();
		System.out.println(p2);
		
		// Trocando strategyss em tempo de execução para Produto 02
		p2.trocarStrategy(strategyCalcLucro);
		p2.calcularPrecoFinal();
		System.out.println(p2);
	}
}
