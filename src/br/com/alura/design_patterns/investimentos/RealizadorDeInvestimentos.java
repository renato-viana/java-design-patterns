package br.com.alura.design_patterns.investimentos;

public class RealizadorDeInvestimentos {
	
	//	75% do lucro do investimento, pois 25% é imposto.
	//	Strategy
	public void calculaInvestimento(Conta conta, Investimento investimento) {
		
		double rendimento = investimento.calcula(conta) * 0.75; 
		double saldoTotal =	conta.getSaldo() + rendimento;
		System.out.println("Saldo total após redimentos: " + saldoTotal + " rendimentos -25% de imposto: " 
							+ rendimento);
	}
}
