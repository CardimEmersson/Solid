/**
 * 5. Princípio da Inversão de Dependências (DIP)
 * "Depende de abstrações, não de classes concretas."
 * @author emersson
 *
 */
public class Usuario {
	
	private String none;
	private String endereco;
	
	/**
	 * Recebe como parametro um objeto abstrato
	 * @param conta
	 */
	public void abrirConta(Conta conta) {
		
	}
	
	public String getNone() {
		return none;
	}

	public void setNone(String none) {
		this.none = none;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
