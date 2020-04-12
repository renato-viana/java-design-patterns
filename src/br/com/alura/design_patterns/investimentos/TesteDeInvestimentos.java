package br.com.alura.design_patterns.investimentos;

public class TesteDeInvestimentos {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1000);
		RealizadorDeInvestimentos rendimento = new RealizadorDeInvestimentos();
		
		Investimento conservador = new CONSERVADOR();
		Investimento moderado = new MODERADO();
		Investimento arrojado = new ARROJADO();
		
		rendimento.calculaInvestimento(conta, conservador);
		rendimento.calculaInvestimento(conta, moderado);
		rendimento.calculaInvestimento(conta, arrojado);
		
	}
}
