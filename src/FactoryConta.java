
/**
 * 1 - Princípio da Responsabilidade Única (SRP)
 * Classe responsávél pela criação de contas
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
