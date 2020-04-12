package br.com.alura.design_patterns.investimentos;

public class CONSERVADOR implements Investimento {

	@Override
	public double calcula(Conta conta) {

		return conta.getSaldo() * 0.08;
	}

}
