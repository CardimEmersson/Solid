
/**
 * 1 - Princ�pio da Responsabilidade �nica (SRP)
 * Classe respons�v�l pela cria��o de contas
 * @author emersson
 *
 */
public class FactoryConta {
	
	/**
	 * 
	 * @param tipo Tipo de conta
	 * @return Conta Um tipo de conta
	 */
	public Conta criarConta(String tipo) {
		// TODO Auto-generated constructor stub
		
		switch(tipo) {
		  case "poupanca":
		    return new ContaPoupanca();
		case "corrente":
			  return new ContaCorrente();

		  case "empresarial":
			  return new ContaEmpresarial();
		  default:
		    // code block
		}
		return null;
		
	}
}
