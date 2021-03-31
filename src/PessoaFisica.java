/**
 * 3. Princípio da Substituição de Liskov (LSP)
 * "As classes derivadas devem ser substituíveis por suas classes básicas."
 * @author emersson
 *
 */
public class PessoaFisica extends Usuario {
	
	private String cnpj;
	
	public PessoaFisica() {
		System.out.println("Pessoa Fisica");
	}

	@Override
	public void abrirConta(Conta conta) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getNone() {
		// TODO Auto-generated method stub
		return super.getNone();
	}
	
	@Override
	public void setNone(String none) {
		// TODO Auto-generated method stub
		super.setNone(none);
	}
	
	@Override
	public String getEndereco() {
		// TODO Auto-generated method stub
		return super.getEndereco();
	}
	
	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		super.setEndereco(endereco);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
