package br.com.alura.design_patterns.investimentos;

public class MODERADO implements Investimento {

	@Override
	public double calcula(Conta conta) {
		double valor = 0.0;
		boolean porcentagem = new java.util.Random().nextDouble() <= 0.50;
		
		if(porcentagem) {
			valor = conta.getSaldo() * 0.025;
		} else {
			valor = conta.getSaldo() * 0.07;
		}
		
		return valor;
	}

}
