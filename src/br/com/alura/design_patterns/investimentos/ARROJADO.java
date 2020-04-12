package br.com.alura.design_patterns.investimentos;

public class ARROJADO implements Investimento {

	@Override
	public double calcula(Conta conta) {
		double valor = 0.0;
		double porcentagem = new java.util.Random().nextDouble();
		
		if(porcentagem <= 0.20) {
			valor = conta.getSaldo() * 0.05;
		} else if(porcentagem > 0.20 && porcentagem <= 0.50) {
			valor = conta.getSaldo() * 0.03;
		} else {
			valor = conta.getSaldo() * 0.06;
		}
		return valor;
	}

}
