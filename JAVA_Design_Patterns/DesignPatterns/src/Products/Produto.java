package Products;

import PatternStrategyStrategies.StrategyCalculation;

public class Produto {
	
	private String nome;
	private double preco;
	private double precoFinal;
	
	private StrategyCalculation strategyCalculation;
	
	public Produto(String nome, double preco, StrategyCalculation strategyCalculation) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.strategyCalculation = strategyCalculation;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public StrategyCalculation getStrategyCalculation() {
		return strategyCalculation;
	}

	
	public void setStrategyCalculation(StrategyCalculation strategyCalculation) {
		this.strategyCalculation = strategyCalculation;
	}

	// Padrão de projeto
	public void calcularPrecoFinal() {
		 this.precoFinal = this.strategyCalculation.carcularLucro(this.preco);
	}
	
	// Trocar estrategia em tempo de execução
	// Não interferindo nos principios
	public void trocarStrategy(StrategyCalculation newStrategy) {
		this.strategyCalculation = newStrategy;
	}
	
	@Override
	public String toString() {
		return "Produto{" + "nome=" + nome + ", preco=" + preco + ", precoFinal=" + precoFinal + ", metodo=" + getStrategyCalculation() + "}";
	}
}
